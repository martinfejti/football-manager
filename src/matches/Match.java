package matches;

import seasons.SerieA2006Season;
import util.ResultLogger;

public class Match {

    public static void main(String[] args) {

        var season = SerieA2006Season.create();

        season.getMatches()
            .forEach(MatchSimulation::simulateMatch);

        ResultLogger.logSeasonResults(season);
    }

}
