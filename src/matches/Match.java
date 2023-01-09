package matches;

import seasons.SerieA2006Season;
import teams.Player;
import teams.Team;

import java.util.Comparator;

public class Match {

    public static void main(String[] args) {

        var season = SerieA2006Season.create();

        season.getMatches()
            .forEach(MatchSimulation::simulateMatch);
        
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
                .filter(player -> player.getPosition().equals("DEF"))
                .forEach(player -> System.out.println(player.getPlayerName() + ": " + player.getGoals()));
    }

}
