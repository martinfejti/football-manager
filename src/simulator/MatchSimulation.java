package simulator;

import data.Match;
import data.Player;
import data.Team;
import util.ResultLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static data.PlayerPosition.*;

public class MatchSimulation {

    public static void simulateMatch(Match match) {

        List<String> goalscorers = new ArrayList<>();

        PreMatchLogic.selectStartingLineups(match);
        System.out.println("\nHome starting 11:");
        match.getHomeTeam().getListOfPlayers()
                .stream()
                .filter(Player::isInStartingLineup)
                .forEach(player -> System.out.println(player.getPlayerName()));
        System.out.println("\nAway starting 11:");
        match.getAwayTeam().getListOfPlayers()
                .stream()
                .filter(Player::isInStartingLineup)
                .forEach(player -> System.out.println(player.getPlayerName()));
        
        //Collect data for the match
        double homeTeamForwardsAvg = getTeamForwardsAvg(match.getHomeTeam());
        double homeTeamMidfieldersAvg = getTeamMidfieldersAvg(match.getHomeTeam());
        double homeTeamDefendersAvg = getTeamDefendersAvg(match.getHomeTeam());
        double homeTeamAvg = (homeTeamForwardsAvg + homeTeamMidfieldersAvg + homeTeamDefendersAvg) / 3; // TODO doesnt contain keeper!!! later...
        
        double awayTeamForwardsAvg = getTeamForwardsAvg(match.getAwayTeam());
        double awayTeamMidfieldersAvg = getTeamMidfieldersAvg(match.getAwayTeam());
        double awayTeamDefendersAvg = getTeamDefendersAvg(match.getAwayTeam());
        double awayTeamAvg = (awayTeamForwardsAvg + awayTeamMidfieldersAvg + awayTeamDefendersAvg) / 3;
        
        // Keeper bonuses
        double homeKeeperSavingBonus = calculateKeeperSavingBonus(match.getHomeTeam());
        double awayKeeperSavingBonus = calculateKeeperSavingBonus(match.getAwayTeam());

        // Chances
        int numberOfBigHomeTeamChances = calculateNumberOfBigChances(homeTeamAvg, awayTeamAvg);
        int numberOfSmallHomeTeamChances = calculateNumberOfSmallChances(homeTeamAvg, awayTeamAvg);
        int numberOfBigAwayTeamChances = calculateNumberOfBigChances(awayTeamAvg, homeTeamAvg);
        int numberOfSmallAwayTeamChances = calculateNumberOfSmallChances(awayTeamAvg, homeTeamAvg);
        
        ResultLogger.logPreMatchData(
                new PreMatchData(
                    homeTeamForwardsAvg, homeTeamMidfieldersAvg, homeTeamDefendersAvg, homeTeamAvg, awayTeamForwardsAvg,
                    awayTeamMidfieldersAvg, awayTeamDefendersAvg, awayTeamAvg, homeKeeperSavingBonus, awayKeeperSavingBonus,
                    numberOfBigHomeTeamChances, numberOfSmallHomeTeamChances, numberOfBigAwayTeamChances, numberOfSmallAwayTeamChances
                )
        );
        
        // Simulate chances
        int numberOfHomeTeamGoals = simulateChances(numberOfBigHomeTeamChances, match.getHomeTeam(), true, homeKeeperSavingBonus, goalscorers);
        numberOfHomeTeamGoals += simulateChances(numberOfSmallHomeTeamChances, match.getHomeTeam(), false, homeKeeperSavingBonus, goalscorers);
        
        int numberOfAwayTeamGoals = simulateChances(numberOfBigAwayTeamChances, match.getAwayTeam(), true, awayKeeperSavingBonus, goalscorers);
        numberOfAwayTeamGoals += simulateChances(numberOfSmallAwayTeamChances, match.getAwayTeam(), false, awayKeeperSavingBonus, goalscorers);

        ResultLogger.logMatchResultInfo(
                new MatchResultInfo(
                        match.getHomeTeam().getName(), numberOfHomeTeamGoals,
                        match.getAwayTeam().getName(), numberOfAwayTeamGoals,
                        goalscorers
                )
        );

        // Handle fatigue
        handleFatigue(match.getHomeTeam().getListOfPlayers());
        handleFatigue(match.getAwayTeam().getListOfPlayers());

        // Handle injuries
        handleInjuries(match.getHomeTeam().getListOfPlayers());
        handleInjuries(match.getAwayTeam().getListOfPlayers());

        // Handle cards
        handleYellowCards(match.getHomeTeam().getListOfPlayers());
        handleYellowCards(match.getAwayTeam().getListOfPlayers());
        handleRedCards(match.getHomeTeam().getListOfPlayers());
        handleRedCards(match.getAwayTeam().getListOfPlayers());

        // Handle points
        if (numberOfHomeTeamGoals > numberOfAwayTeamGoals) {
            match.getHomeTeam().addThreePoints();
        } else if (numberOfAwayTeamGoals > numberOfHomeTeamGoals) {
            match.getAwayTeam().addThreePoints();
        } else if (numberOfHomeTeamGoals == numberOfAwayTeamGoals) {
            match.getHomeTeam().addOnePoint();
            match.getAwayTeam().addOnePoint();
        }
        
        // Handle goals
        match.setHomeTeamGoals(numberOfHomeTeamGoals);
        match.setAwayTeamGoals(numberOfAwayTeamGoals);
        
        match.getHomeTeam().setScoredGoals(numberOfHomeTeamGoals);
        match.getHomeTeam().setConcededGoals(numberOfAwayTeamGoals);
        
        match.getAwayTeam().setScoredGoals(numberOfAwayTeamGoals);
        match.getAwayTeam().setConcededGoals(numberOfHomeTeamGoals);
        
        // Increase match numbers
        match.getHomeTeam().increaseMatchedPlayed();
        match.getAwayTeam().increaseMatchedPlayed();
        increasesPlayersMatchNumber(match.getHomeTeam().getListOfPlayers());
        increasesPlayersMatchNumber(match.getAwayTeam().getListOfPlayers());

    }

    private static double getTeamForwardsAvg(Team team) {

        double teamForwardsAvgSum = 0;
        int numberOfForwards = 0;

        // TODO use enhanced loops
        for (int i = 0; i < team.getListOfPlayers().size(); i++) {
            if (team.getListOfPlayers().get(i).getPosition().equals(FORWARD) && team.getListOfPlayers().get(i).isInStartingLineup()) {
                teamForwardsAvgSum += team.getListOfPlayers().get(i).getOverall();
                numberOfForwards++;
            }
        }
        
        return teamForwardsAvgSum/numberOfForwards;
    }
    
    private static double getTeamMidfieldersAvg(Team team) {

        double teamMidfieldersAvgSum = 0;
        int numberOfMidfielders = 0;
        
        for (int i = 0; i < team.getListOfPlayers().size(); i++) {
            if (team.getListOfPlayers().get(i).getPosition().equals(MIDFIELDER) && team.getListOfPlayers().get(i).isInStartingLineup()) {
                teamMidfieldersAvgSum += team.getListOfPlayers().get(i).getOverall();
                numberOfMidfielders++;
            }
        }
        
        return teamMidfieldersAvgSum/numberOfMidfielders;
    }
    
    private static double getTeamDefendersAvg(Team team) {

        double teamDefendersAvgSum = 0;
        int numberOfDefenders = 0;
        
        for (int i = 0; i < team.getListOfPlayers().size(); i++) {
            if (team.getListOfPlayers().get(i).getPosition().equals(DEFENDER) && team.getListOfPlayers().get(i).isInStartingLineup()) {
                teamDefendersAvgSum += team.getListOfPlayers().get(i).getOverall();
                numberOfDefenders++;
            }
        }
        
        return teamDefendersAvgSum/numberOfDefenders;
    }
    
    // dinamikusabb megoldas
    private static int calculateNumberOfBigChances(double homeTeamAvg, double awayTeamAvg) {
        
        int numberOfBigChances = 1;
        
        if (Math.abs(homeTeamAvg - awayTeamAvg) <= 5) {
            numberOfBigChances += 2;
        }
        
        if (Math.abs(homeTeamAvg - awayTeamAvg) <= 15 && Math.abs(homeTeamAvg - awayTeamAvg) > 5) {
            numberOfBigChances++;
        }
        
        if ((homeTeamAvg - awayTeamAvg) > 15) {
            numberOfBigChances += 2;
        }
        
        return numberOfBigChances;
    }

    // dinamikusabb megoldas
    private static int calculateNumberOfSmallChances(double homeTeamAvg, double awayTeamAvg) {

        int numberOfSmalllChances = 2;
        
        if (Math.abs(homeTeamAvg - awayTeamAvg) <= 5) {
            numberOfSmalllChances += 2;
        }
        
        if (Math.abs(homeTeamAvg - awayTeamAvg) <= 15 && Math.abs(homeTeamAvg - awayTeamAvg) > 5) {
            numberOfSmalllChances += 1;
        }
        
        if ((homeTeamAvg - awayTeamAvg) > 15) {
            numberOfSmalllChances += 3;
        }
        
        return numberOfSmalllChances;
    }
    
    private static int simulateChances(int numberOfChances, Team team, boolean isBigChance, double keeperSavingBonus, List<String> goalscorers) {

        List<Player> playersToHaveChance = new ArrayList<>();
        int numberOfGoals = 0;
        
        for (int i = 0; i < numberOfChances; i++) {
            double valueForDecidingWhichPositionHasTheChance = Math.random();
            if (valueForDecidingWhichPositionHasTheChance <= 0.6) {
                // A striker will have the chance
                for (int j = 0; j < team.getListOfPlayers().size(); j++) {
                    if (team.getListOfPlayers().get(j).getPosition().equals(FORWARD) && team.getListOfPlayers().get(j).isInStartingLineup()) {
                        playersToHaveChance.add(team.getListOfPlayers().get(j));
                    }
                }
            } else if (valueForDecidingWhichPositionHasTheChance > 0.6 && valueForDecidingWhichPositionHasTheChance <= 0.9) {
                // A midfielder will have the chance
                for (int j = 0; j < team.getListOfPlayers().size(); j++) {
                    if (team.getListOfPlayers().get(j).getPosition().equals(MIDFIELDER) && team.getListOfPlayers().get(j).isInStartingLineup()) {
                        playersToHaveChance.add(team.getListOfPlayers().get(j));
                    }
                }
            } else if (valueForDecidingWhichPositionHasTheChance > 0.9) {
                // A defender will have the chance
                for (int j = 0; j < team.getListOfPlayers().size(); j++) {
                    if (team.getListOfPlayers().get(j).getPosition().equals(DEFENDER) && team.getListOfPlayers().get(j).isInStartingLineup()) {
                        playersToHaveChance.add(team.getListOfPlayers().get(j));
                    }
                }
            }

            // Goalscoring mechanism
            if (isGoalScored(playersToHaveChance, isBigChance, keeperSavingBonus, goalscorers)) {
                numberOfGoals++;
            }
            
            playersToHaveChance.clear();
        }
        
        return numberOfGoals;
    }

    // TODO Handle sysouts if they are still needed in the later stages
    private static boolean isGoalScored(List<Player> playersToHaveChance, boolean isBigChance, double keeperSavingBonus, List<String> goalscorers) {

        int numberOfPlayersWhoHaveChance = playersToHaveChance.size();
        Random ran = new Random();
        double strikerAdHocBonus = Math.random() / 10;
        double keeperAdHocBonus = Math.random() / 10;
        
        int index = ran.nextInt(numberOfPlayersWhoHaveChance);
        System.out.println("\nGolhelyzetbe kerult: " + playersToHaveChance.get(index).getPlayerName());
        
        if (isBigChance) { // TODO itt annak erdekeben hogy a magasabb atlagu jatekosok elonye meglegyen, be lehetne vinni az OVERALL-t a helyzet szammal kepzett atlagba, es az vmivel igazsagosabb lenne
            if (Math.random() <=
                    playersToHaveChance.get(index).getChanceOfScoringFromBigOpportunity()
                    + (playersToHaveChance.get(index).getOverall() / 1000)
                    + strikerAdHocBonus
                    - keeperAdHocBonus
                    - keeperSavingBonus) {
                System.out.println("Gólt szerzett ziccerbõl: " + playersToHaveChance.get(index).getPlayerName());
                goalscorers.add(playersToHaveChance.get(index).getPlayerName());
                playersToHaveChance.get(index).increaseGoals(); // gólok tárolása
                return true;
            } else {
                System.out.println("Ziccer kimaradt: " + playersToHaveChance.get(index).getPlayerName());
                return false;
            }            
        } else {
            if (Math.random() <=
                    playersToHaveChance.get(index).getChanceOfScoringFromSmallOpportunity()
                    + (playersToHaveChance.get(index).getOverall() / 1000)
                    + strikerAdHocBonus
                    - keeperAdHocBonus
                    - (1.5 * keeperSavingBonus)) {
                System.out.println("Gólt szerzett kis helyzetbõl: " + playersToHaveChance.get(index).getPlayerName());
                goalscorers.add(playersToHaveChance.get(index).getPlayerName());
                playersToHaveChance.get(index).increaseGoals(); // gólok tárolása
                return true;
            } else {
                System.out.println("Kis helyzet kimaradt: " + playersToHaveChance.get(index).getPlayerName());
                return false;
            } 
        }
    }
    
    private static double calculateKeeperSavingBonus(Team team) {

        Player keeper = new Player();

        for (int i = 0; i < team.getListOfPlayers().size(); i++) {
            if (team.getListOfPlayers().get(i).getPosition().equals(GOALKEEPER) && team.getListOfPlayers().get(i).isInStartingLineup()) {
                keeper = team.getListOfPlayers().get(i);
                System.out.println("Kapus neve: " + keeper.getPlayerName());                
            }
        }

        return keeper.getOverall() / 200; // egyelore jo igy sztem, 90nes kapusnal ziccer 0,45, kis helyzet 0,67 korul van
    }

    /**
     * Decreases player's stamina by a random number between 10 and 30
     */
    private static void handleFatigue(List<Player> playerList) {

        for (Player player : playerList) {
            if (player.isInStartingLineup()) {
                int randomNumber = (int) (Math.random() * (30 - 10)) + 10;
                player.setStamina(player.getStamina() - randomNumber);
            } else {
                player.setStamina(100); // TODO megoldani, hogy ha hozzáadok az aktuálishoz egy számot, akkor az ne legyen több, mint 100
            }
        }
    }

    /**
     * Decides if a player injured during match and how many matches he needs to miss
     */
    private static void handleInjuries(List<Player> playerList) {

        for (Player player : playerList) { // TODO az összes handle csak a kezdõkre fusson le és a legvégén mindenki legyen false!

            if (player.isInStartingLineup() && Math.random() <= 0.01) { // too many injuries happened in case of 0.04
                player.setInjured(true);

                System.out.println("SÉRÜLÉS:" + player.getPlayerName());
                double injuryLengthRandom = Math.random();
                if (injuryLengthRandom >= 0.9) {
                    player.setMatchesUntilComesBackFromInjury(5);
                } else if (injuryLengthRandom >= 0.75) {
                    player.setMatchesUntilComesBackFromInjury(4);
                } else if (injuryLengthRandom >= 0.5) {
                    player.setMatchesUntilComesBackFromInjury(3);
                } else if (injuryLengthRandom >= 0.2) {
                    player.setMatchesUntilComesBackFromInjury(2);
                } else {
                    player.setMatchesUntilComesBackFromInjury(1);
                }
            }
        }
    }

    /**
     * Decides if a player gets a yellow card and increases his yellow card number if needed
     * The chances of getting a card depends on the position
     */
    private static void handleYellowCards(List<Player> playerList) {

        for (Player player : playerList) {
            if (player.isInStartingLineup()) {
                boolean getsYellowCard = false;
                double yellowCardChance = Math.random();

                if (player.getPosition() == GOALKEEPER && yellowCardChance < 0.05) {
                    getsYellowCard = true;
                } else if (player.getPosition() == DEFENDER && yellowCardChance < 0.15) {
                    getsYellowCard = true;
                } else if (player.getPosition() == MIDFIELDER && yellowCardChance < 0.05) {
                    getsYellowCard = true;
                } else if (player.getPosition() == FORWARD && yellowCardChance < 0.025) {
                    getsYellowCard = true;
                }

                if (getsYellowCard) {
                    player.increaseNumberOfYellowCards();
                    System.out.println("SÁRGA LAP: " + player.getPlayerName());
                }
            }
        }
    }

    /**
     * Decides if a player gets a red card and increases his red card number if needed
     * The chances of getting a card depends on the position
     */
    private static void handleRedCards(List<Player> playerList) {

        for (Player player : playerList) {
            if (player.isInStartingLineup()) {
                boolean getsRedCard = false;
                double redCardChance = Math.random();

                if (player.getPosition() == GOALKEEPER && redCardChance < 0.003) {
                    getsRedCard = true;
                } else if (player.getPosition() == DEFENDER && redCardChance < 0.01) {
                    getsRedCard = true;
                } else if (player.getPosition() == MIDFIELDER && redCardChance < 0.005) {
                    getsRedCard = true;
                } else if (player.getPosition() == FORWARD && redCardChance < 0.0025) {
                    getsRedCard = true;
                }

                if (getsRedCard) {
                    player.increaseNumberOfRedCards();
                    player.setExcluded(true);
                    System.out.println("KIÁLLÍTÁS: " + player.getPlayerName());
                }
            }
        }
    }

    private static void increasesPlayersMatchNumber(List<Player> playerList) {
        playerList
                .stream()
                .filter(Player::isInStartingLineup)
                .forEach(Player::increaseNumberOfMatches);
    }

}
