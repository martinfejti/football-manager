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
        } else if (team.getFormation() == TeamFormation.FOUR_FOUR_TWO) {
            selectStartingLineupFor442(team.getListOfPlayers());
        } else if (team.getFormation() == TeamFormation.FOUR_TWO_THREE_ONE) {
            selectStartingLineupFor4231(team.getListOfPlayers());
        } else if (team.getFormation() == TeamFormation.FOUR_ONE_FOUR_ONE) {
            selectStartingLineupFor4141(team.getListOfPlayers());
        } else if (team.getFormation() == TeamFormation.THREE_FIVE_TWO) {
            selectStartingLineupFor352(team.getListOfPlayers());
        } else if (team.getFormation() == TeamFormation.THREE_FOUR_THREE) {
            selectStartingLineupFor343(team.getListOfPlayers());
        }
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

    private static void selectStartingLineupFor442(List<Player> playerList) {

        selectOnePlayerForOnePosition(playerList, GOALKEEPER);
        selectOnePlayerForOnePosition(playerList, LEFT_BACK);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, RIGHT_BACK);
        selectOnePlayerForOnePosition(playerList, LEFT_WINGER);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, RIGHT_WINGER);
        selectOnePlayerForOnePosition(playerList, LEFT_STRIKER);
        selectOnePlayerForOnePosition(playerList, RIGHT_STRIKER);
    }

    private static void selectStartingLineupFor4231(List<Player> playerList) {

        selectOnePlayerForOnePosition(playerList, GOALKEEPER);
        selectOnePlayerForOnePosition(playerList, LEFT_BACK);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, RIGHT_BACK);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, LEFT_WINGER);
        selectOnePlayerForOnePosition(playerList, CENTRAL_ATTACKING_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, RIGHT_WINGER);
        selectOnePlayerForOnePosition(playerList, STRIKER);
    }

    private static void selectStartingLineupFor4141(List<Player> playerList) {

        selectOnePlayerForOnePosition(playerList, GOALKEEPER);
        selectOnePlayerForOnePosition(playerList, LEFT_BACK);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, RIGHT_BACK);
        selectOnePlayerForOnePosition(playerList, CENTRAL_DEFENSIVE_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, LEFT_WINGER);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, RIGHT_WINGER);
        selectOnePlayerForOnePosition(playerList, STRIKER);
    }

    private static void selectStartingLineupFor352(List<Player> playerList) {

        selectOnePlayerForOnePosition(playerList, GOALKEEPER);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, LEFT_WINGER);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, RIGHT_WINGER);
        selectOnePlayerForOnePosition(playerList, LEFT_STRIKER);
        selectOnePlayerForOnePosition(playerList, RIGHT_STRIKER);
    }

    private static void selectStartingLineupFor343(List<Player> playerList) {

        selectOnePlayerForOnePosition(playerList, GOALKEEPER);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_BACK);
        selectOnePlayerForOnePosition(playerList, LEFT_WINGER);
        selectOnePlayerForOnePosition(playerList, LEFT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, RIGHT_CENTRAL_MIDFIELDER);
        selectOnePlayerForOnePosition(playerList, RIGHT_WINGER);
        selectOnePlayerForOnePosition(playerList, LEFT_STRIKER);
        selectOnePlayerForOnePosition(playerList, STRIKER);
        selectOnePlayerForOnePosition(playerList, RIGHT_STRIKER);
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
        } else {
            // For now there are only two players for one position, if the first choice is not available the second will start
            secondChoice.setInStartingLineup(true);
            firstChoice.setInStartingLineup(false);
        }
    }

}
