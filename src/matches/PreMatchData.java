package matches;

public record PreMatchData(
        double homeTeamForwardsAverage,
        double homeTeamMidfieldersAverage,
        double homeTeamDefendersAverage,
        double homeTeamAverage,
        double awayTeamForwardsAverage,
        double awayTeamMidfieldersAverage,
        double awayTeamDefendersAverage,
        double awayTeamAverage,
        double homeTeamKeeperBonus,
        double awayTeamKeeperBonus,
        double homeTeamNumberOfBigChances,
        double homeTeamNumberOfSmallChances,
        double awayTeamNumberOfBigChances,
        double awayTeamNumberOfSmallChances
) {
}
