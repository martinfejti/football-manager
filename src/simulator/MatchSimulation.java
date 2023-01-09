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

    }

    private static double getTeamForwardsAvg(Team team) {
        double teamForwardsAvgSum = 0;
        int numberOfForwards = 0;
        
        for (int i = 0; i < team.getListOfPlayers().size(); i++) {
            if (team.getListOfPlayers().get(i).getPosition().equals(FORWARD)) {
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
            if (team.getListOfPlayers().get(i).getPosition().equals(MIDFIELDER)) {
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
            if (team.getListOfPlayers().get(i).getPosition().equals(DEFENDER)) {
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
                    if (team.getListOfPlayers().get(j).getPosition().equals(FORWARD)) {
                        playersToHaveChance.add(team.getListOfPlayers().get(j));
                    }
                }
            } else if (valueForDecidingWhichPositionHasTheChance > 0.6 && valueForDecidingWhichPositionHasTheChance <= 0.9) {
                // A midfielder will have the chance
                for (int j = 0; j < team.getListOfPlayers().size(); j++) {
                    if (team.getListOfPlayers().get(j).getPosition().equals(MIDFIELDER)) {
                        playersToHaveChance.add(team.getListOfPlayers().get(j));
                    }
                }
            } else if (valueForDecidingWhichPositionHasTheChance > 0.9) {
                // A defender will have the chance
                for (int j = 0; j < team.getListOfPlayers().size(); j++) {
                    if (team.getListOfPlayers().get(j).getPosition().equals(DEFENDER)) {
                        playersToHaveChance.add(team.getListOfPlayers().get(j));
                    }
                }
            }

            // Goalscoring mechanism
            if (isGoalScored(playersToHaveChance, team, isBigChance, keeperSavingBonus, goalscorers)) {
                numberOfGoals++;
            }
            
            playersToHaveChance.clear();
        }
        
        return numberOfGoals;
    }

    // TODO Handle sysouts if they are still needed in the later stages
    private static boolean isGoalScored(List<Player> playersToHaveChance, Team team, boolean isBigChance, double keeperSavingBonus, List<String> goalscorers) {
        int numberOfPlayersWhoHaveChance = playersToHaveChance.size();
        Random ran = new Random();
        double strikerAdHocBonus = Math.random()/10;
        double keeperAdHocBonus = Math.random()/10;
        
        int index = ran.nextInt(numberOfPlayersWhoHaveChance);
        System.out.println("\nGolhelyzetbe kerult: " + playersToHaveChance.get(index).getPlayerName());
        
        if (isBigChance) { // TODO itt annak erdekeben hogy a magasabb atlagu jatekosok elonye meglegyen, be lehetne vinni az OVERALL-t a helyzet szammal kepzett atlagba, es az vmivel igazsagosabb lenne
            if (Math.random() <=
                    playersToHaveChance.get(index).getChanceOfScoringFromBigOpportunity()
                    + (playersToHaveChance.get(index).getOverall()/1000)
                    + strikerAdHocBonus
                    - keeperAdHocBonus
                    - keeperSavingBonus) {
                System.out.println("G�lt szerzett ziccerb�l: " + playersToHaveChance.get(index).getPlayerName());
                goalscorers.add(playersToHaveChance.get(index).getPlayerName());
                playersToHaveChance.get(index).increaseGoals(); // g�lok t�rol�sa
                return true;
            } else {
                System.out.println("Ziccer kimaradt: " + playersToHaveChance.get(index).getPlayerName());
                return false;
            }            
        } else {
            if (Math.random() <=
                    playersToHaveChance.get(index).getChanceOfScoringFromSmallOpportunity()
                    + (playersToHaveChance.get(index).getOverall()/1000)
                    + strikerAdHocBonus
                    - keeperAdHocBonus
                    - (1.5 * keeperSavingBonus)) {
                System.out.println("G�lt szerzett kis helyzetb�l: " + playersToHaveChance.get(index).getPlayerName());
                goalscorers.add(playersToHaveChance.get(index).getPlayerName());
                playersToHaveChance.get(index).increaseGoals(); // g�lok t�rol�sa
                return true;
            } else {
                System.out.println("Kis helyzet kimaradt: " + playersToHaveChance.get(index).getPlayerName());
                return false;
            } 
        }
    }
    
    private static double calculateKeeperSavingBonus(Team homeTeam) {
        Player keeper = new Player();
        for (int i = 0; i < homeTeam.getListOfPlayers().size(); i++) {
            if (homeTeam.getListOfPlayers().get(i).getPosition().equals(GOALKEEPER)) {
                keeper = homeTeam.getListOfPlayers().get(i);
                System.out.println("Kapus neve: " + keeper.getPlayerName());                
            }
        }

        return keeper.getOverall()/200; // egyelore jo igy sztem, 90nes kapusnal ziccer 0,45, kis helyzet 0,67 korul van
    }

}