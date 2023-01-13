package simulator;

import data.*;

import java.util.Comparator;
import java.util.List;

import static data.SpecificPlayerPosition.*;

public class PreMatchLogic {

    public static void selectStartingLineups(Match match) {

        selectFormation(match.getHomeTeam());
        selectFormation(match.getAwayTeam());
    }

    private static void selectFormation(Team team) {

        if (team.getFormation() == TeamFormation.FOUR_THREE_THREE) {
            selectStartingLineupFor433(team.getListOfPlayers());
        }
        // TODO implement other formations
    }

    private static void selectStartingLineupFor433(List<Player> playerList) {

        selectOnePlayerForOnePosition(playerList, GOALKEEPER);
        selectOnePlayerForOnePosition(playerList, LEFT_BACK);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, RIGHT_BACK);
        selectOnePlayerForOnePosition(playerList, CENTRAL_DEFENSIVE_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, LEFT_WINGER);
        selectOnePlayerForOnePosition(playerList, STRIKER);
        selectOnePlayerForOnePosition(playerList, RIGHT_WINGER);
    }

    private static void selectOnePlayerForOnePosition(List<Player> playerList, SpecificPlayerPosition position) {

        var playersForTheGivenPosition = playerList
                .stream()
                .filter(player -> player.getSpecificPlayerPosition() == position)
                .sorted(Comparator.comparing(Player::getOverall).reversed())
                .toList();

        var firstChoice = playersForTheGivenPosition.get(0);
        var secondChoice = playersForTheGivenPosition.get(1);

        if (firstChoice != null
                && firstChoice.getStamina() > 30
                && !firstChoice.isExcluded()
                && !firstChoice.isInjured()
        ) {
            firstChoice.setInStartingLineup(true);
            secondChoice.setInStartingLineup(false);
            // TODO felesleges külön a starting lineup osztály, a Playerbe kell egy plusz flag, amit itt állítunk igazra, ha kezdõ, falsera ha nem, és nincs gond a konverzióval se, mert eleve lista
        } else {
            // For now there are only two players for one position, if the first choice is not available the second will start
            // TODO handle that if first is unavailable after match, the second cannot be unavailable
            secondChoice.setInStartingLineup(true);
            firstChoice.setInStartingLineup(false);
        }
    }

}
