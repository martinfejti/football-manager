package util;

import data.PlayerPosition;
import simulator.MatchResultInfo;
import simulator.PreMatchData;
import data.Season;
import data.Player;
import data.Team;

import java.util.Comparator;

import static data.PlayerPosition.DEFENDER;

public class ResultLogger {

    /**
     * Logs team averages, keeper bonuses and the number of chances
     */
    public static void logPreMatchData(PreMatchData preMatchData) {

        System.out.println("\nHomeTeam Attributes: ");
        System.out.println("Forward AVG: " + preMatchData.homeTeamForwardsAverage());
        System.out.println("Midfielders AVG: " + preMatchData.homeTeamMidfieldersAverage());
        System.out.println("Defenders AVG: " + preMatchData.homeTeamDefendersAverage());
        System.out.println("OVERALL AVG: " + preMatchData.homeTeamAverage());

        System.out.println("\nAwayTeam Attributes: ");
        System.out.println("Forward AVG: " + preMatchData.awayTeamForwardsAverage());
        System.out.println("Midfielders AVG: " + preMatchData.awayTeamMidfieldersAverage());
        System.out.println("Defenders AVG: " + preMatchData.awayTeamDefendersAverage());
        System.out.println("OVERALL AVG: " + preMatchData.awayTeamAverage());

        System.out.println("Hazai kapus bónusz: " + preMatchData.homeTeamKeeperBonus());
        System.out.println("Vendég kapus bónusz: " + preMatchData.awayTeamKeeperBonus());

        System.out.println("HomeTeam big chances: " + preMatchData.homeTeamNumberOfBigChances() + ", small chances: " + preMatchData.homeTeamNumberOfSmallChances());
        System.out.println("AwayTeam big chances: " + preMatchData.awayTeamNumberOfBigChances() + ", small chances: " + preMatchData.awayTeamNumberOfSmallChances());
    }

    public static void logMatchResultInfo(MatchResultInfo matchResultInfo) {

        System.out.println("\nEredmény: " + matchResultInfo.homeTeamName() + " " + matchResultInfo.homeTeamNumberOfGoals() + " - " + matchResultInfo.awayTeamName() + " " + matchResultInfo.awayTeamNumberOfGoals());
        System.out.println("Gólszerzõk: ");
        for (int i = 0; i < matchResultInfo.goalscorersList().size(); i++) {
            System.out.println(matchResultInfo.goalscorersList().get(i));
        }
    }

    /**
     * Logs table and goalscorers
     */
    public static void logSeasonResults(Season season) {

        System.out.println("\n");
        season.getTeamList()
                .stream()
                .sorted(Comparator.comparing(Team::getPoints).reversed())
                .forEach(team -> System.out.println(team.getName() + " - " + team.getPoints() + " - LG: " + team.getScoredGoals() + " - KG: " + team.getConcededGoals() + " M: " + team.getMatchesPlayed()));

        System.out.println("\nGollovolista:");
        season.getTeamList()
                .stream()
                .flatMap(team -> team.getListOfPlayers().stream())
                .sorted(Comparator.comparing(Player::getGoals).reversed())
                .filter(player -> player.getGoals() > 0)
                .forEach(player -> System.out.println(player.getPlayerName() + ": " + player.getGoals()));

        System.out.println("\nGollovolista - vedok:");
        season.getTeamList()
                .stream()
                .flatMap(team -> team.getListOfPlayers().stream())
                .sorted(Comparator.comparing(Player::getGoals).reversed())
                .filter(player -> player.getGoals() > 0)
                .filter(player -> player.getPosition() == DEFENDER)
                .forEach(player -> System.out.println(player.getPlayerName() + ": " + player.getGoals()));

        System.out.println("\nSárga lapok:");
        season.getTeamList()
                .stream()
                .flatMap(team -> team.getListOfPlayers().stream())
                .sorted(Comparator.comparing(Player::getNumberOfYellowCards).reversed())
                .filter(player -> player.getNumberOfYellowCards() > 0)
                .forEach(player -> System.out.println(player.getPlayerName() + ": " + player.getNumberOfYellowCards()));

        System.out.println("\nPiros lapok:");
        season.getTeamList()
                .stream()
                .flatMap(team -> team.getListOfPlayers().stream())
                .sorted(Comparator.comparing(Player::getNumberOfRedCards).reversed())
                .filter(player -> player.getNumberOfRedCards() > 0)
                .forEach(player -> System.out.println(player.getPlayerName() + ": " + player.getNumberOfRedCards()));
    }

}
