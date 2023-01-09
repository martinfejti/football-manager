package engine;

import simulator.MatchSimulation;
import seasons.SerieA2006Season;
import util.ResultLogger;

public class Main {

    public static void main(String[] args) {

        var season = SerieA2006Season.create();

        season.getMatchList()
            .forEach(MatchSimulation::simulateMatch);

        ResultLogger.logSeasonResults(season);
    }

}
