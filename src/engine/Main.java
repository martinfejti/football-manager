package engine;

import seasons.TestSeason;
import simulator.MatchSimulation;
import util.ResultLogger;

public class Main {

    public static void main(String[] args) {

        var season = TestSeason.create();

        season.getMatchList()
            .forEach(MatchSimulation::simulateMatch);

        ResultLogger.logSeasonResults(season);
    }

}
