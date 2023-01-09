package matches;

import teams.Player;
import teams.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatchSimulation {

    public static void simulateMatch(MatchDto match) {

        List<String> goalscorers = new ArrayList<>();
        
        //Collect data for the match
        double homeTeamForwardsAvg = getTeamForwardsAvg(match.getHomeTeam());
        double homeTeamMidfieldersAvg = getTeamMidfieldersAvg(match.getHomeTeam());
        double homeTeamDefendersAvg = getTeamDefendersAvg(match.getHomeTeam());
        double homeTeamAvg = (homeTeamForwardsAvg + homeTeamMidfieldersAvg + homeTeamDefendersAvg) / 3; // doesnt contain keeper!!! later...
        
        double awayTeamForwardsAvg = getTeamForwardsAvg(match.getAwayTeam());
        double awayTeamMidfieldersAvg = getTeamMidfieldersAvg(match.getAwayTeam());
        double awayTeamDefendersAvg = getTeamDefendersAvg(match.getAwayTeam());
        double awayTeamAvg = (awayTeamForwardsAvg + awayTeamMidfieldersAvg + awayTeamDefendersAvg)/3;
        
        System.out.println("\nHomeTeam Attributes: ");
        System.out.println("Forward AVG: " + homeTeamForwardsAvg);
        System.out.println("Midfielders AVG: " + homeTeamMidfieldersAvg);
        System.out.println("Defenders AVG: " + homeTeamDefendersAvg);
        System.out.println("OVERALL AVG: " + homeTeamAvg);
        
        System.out.println("\nAwayTeam Attributes: ");
        System.out.println("Forward AVG: " + awayTeamForwardsAvg);
        System.out.println("Midfielders AVG: " + awayTeamMidfieldersAvg);
        System.out.println("Defenders AVG: " + awayTeamDefendersAvg);
        System.out.println("OVERALL AVG: " + awayTeamAvg);
        
        // Keepers
        double homeKeeperSavingBonus = calculateKeeperSavingBonus(match.getHomeTeam());
        double awayKeeperSavingBonus = calculateKeeperSavingBonus(match.getAwayTeam());
        System.out.println("Hazai kapus bónusz: " + homeKeeperSavingBonus);
        System.out.println("Vendég kapus bónusz: " + awayKeeperSavingBonus);
        
        int numberOfBigHomeTeamChances = calculateNumberOfBigChances(homeTeamAvg, awayTeamAvg);
        int numberOfSmallHomeTeamChances = calculateNumberOfSmallChances(homeTeamAvg, awayTeamAvg);
        
        int numberOfBigAwayTeamChances = calculateNumberOfBigChances(awayTeamAvg, homeTeamAvg);
        int numberOfSmallAwayTeamChances = calculateNumberOfSmallChances(awayTeamAvg, homeTeamAvg);
        
        System.out.println("HomeTeam big chances: " + numberOfBigHomeTeamChances + ", small chances: " + numberOfSmallHomeTeamChances);
        System.out.println("AwayTeam big chances: " + numberOfBigAwayTeamChances + ", small chances: " + numberOfSmallAwayTeamChances);
        
        // Handle Chances
        int numberOfHomeTeamGoals = simulateChances(numberOfBigHomeTeamChances, match.getHomeTeam(), true, homeKeeperSavingBonus, goalscorers); 
        numberOfHomeTeamGoals += simulateChances(numberOfSmallHomeTeamChances, match.getHomeTeam(), false, homeKeeperSavingBonus, goalscorers);
        
        int numberOfAwayTeamGoals = simulateChances(numberOfBigAwayTeamChances, match.getAwayTeam(), true, awayKeeperSavingBonus, goalscorers);
        numberOfAwayTeamGoals += simulateChances(numberOfSmallAwayTeamChances, match.getAwayTeam(), false, awayKeeperSavingBonus, goalscorers);
        
        System.out.println("\nEredmény: " + match.getHomeTeam().getName() + " " + numberOfHomeTeamGoals + " - " + match.getAwayTeam().getName() + " " + numberOfAwayTeamGoals);
        System.out.println("Gólszerzõk: ");
        for (int i = 0; i < goalscorers.size(); i++) {
            System.out.println(goalscorers.get(i));
        }
        
        // pontok kezelese
        if (numberOfHomeTeamGoals > numberOfAwayTeamGoals) {
            match.getHomeTeam().addThreePoints();
        } else if (numberOfAwayTeamGoals > numberOfHomeTeamGoals) {
            match.getAwayTeam().addThreePoints();
        } else if (numberOfHomeTeamGoals == numberOfAwayTeamGoals) {
            match.getHomeTeam().addOnePoint();
            match.getAwayTeam().addOnePoint();
        }
        
        // golok kezelese
        match.setHomeTeamGoals(numberOfHomeTeamGoals);
        match.setAwayTeamGoals(numberOfAwayTeamGoals);
        
        match.getHomeTeam().setScoredGoals(numberOfHomeTeamGoals);
        match.getHomeTeam().setConcededGoals(numberOfAwayTeamGoals);
        
        match.getAwayTeam().setScoredGoals(numberOfAwayTeamGoals);
        match.getAwayTeam().setConcededGoals(numberOfHomeTeamGoals);
        
        // meccsek novelese
        match.getHomeTeam().increaseMatchedPlayed();
        match.getAwayTeam().increaseMatchedPlayed();

    }

    private static double getTeamForwardsAvg(Team team) {
        double teamForwardsAvgSum = 0;
        int numberOfForwards = 0;
        
        for (int i = 0; i < team.getListOfPlayers().size(); i++) {
            if (team.getListOfPlayers().get(i).getPosition().equals("FOR")) {
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
            if (team.getListOfPlayers().get(i).getPosition().equals("MID")) {
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
            if (team.getListOfPlayers().get(i).getPosition().equals("DEF")) {
                teamDefendersAvgSum += team.getListOfPlayers().get(i).getOverall();
                numberOfDefenders++;
            }
        }
        
        return teamDefendersAvgSum/numberOfDefenders;
    }
    
    private static int calculateNumberOfBigChances(double forAvg, double midAvg, double defAvg) {
        
        int numberOfBigChances = 1;
        
        if (forAvg >= 90) {
            numberOfBigChances += 2;
        } else if (forAvg > 80 && forAvg < 90) {
            numberOfBigChances += 1;
        }
        
        if (midAvg >= 90) {
            numberOfBigChances += 2;
        } else if (midAvg > 80 && midAvg < 90) {
            numberOfBigChances += 1;
        }
        
        if (defAvg >= 95) {
            numberOfBigChances += 1;
        }

        return numberOfBigChances;
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
                    if (team.getListOfPlayers().get(j).getPosition().equals("FOR")) {
                        playersToHaveChance.add(team.getListOfPlayers().get(j));
                    }
                }
            } else if (valueForDecidingWhichPositionHasTheChance > 0.6 && valueForDecidingWhichPositionHasTheChance <= 0.9) {
                // A midfielder will have the chance
                for (int j = 0; j < team.getListOfPlayers().size(); j++) {
                    if (team.getListOfPlayers().get(j).getPosition().equals("MID")) {
                        playersToHaveChance.add(team.getListOfPlayers().get(j));
                    }
                }
            } else if (valueForDecidingWhichPositionHasTheChance > 0.9) {
                // A defender will have the chance
                for (int j = 0; j < team.getListOfPlayers().size(); j++) {
                    if (team.getListOfPlayers().get(j).getPosition().equals("DEF")) {
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
                    + (playersToHaveChance.get(index).getOverall()/1000)
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
    
    private static double calculateKeeperSavingBonus(Team homeTeam) {
        Player keeper = new Player();
        for (int i = 0; i < homeTeam.getListOfPlayers().size(); i++) {
            if (homeTeam.getListOfPlayers().get(i).getPosition().equals("GKP")) {
                keeper = homeTeam.getListOfPlayers().get(i);
                System.out.println("Kapus neve: " + keeper.getPlayerName());                
            }
        }

        return keeper.getOverall()/200; // egyelore jo igy sztem, 90nes kapusnal ziccer 0,45, kis helyzet 0,67 korul van
    }

}
