package matches;

import java.util.List;

public record MatchResultInfo(
        String homeTeamName,
        int homeTeamNumberOfGoals,
        String awayTeamName,
        int awayTeamNumberOfGoals,
        List<String> goalscorersList
) {
}
