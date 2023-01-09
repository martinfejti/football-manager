package data;

public class Player {

    private String playerName;
    
    private PlayerPosition position;
    
    private double overall;
    
    private double chanceOfScoringFromBigOpportunity;
    private double chanceOfScoringFromSmallOpportunity;
    private int stamina;
    private boolean injured;
    private int matchesUntilComesBackFromInjury;
    private int numberOfYellowCards;
    private int numberOfRedCards;
    private boolean excluded;
    
    private int goals;
    
    public Player(String playerName, PlayerPosition position, double overall, double chanceOfScoringFromBigOpportunity,
            double chanceOfScoringFromSmallOpportunity) {
        super();
        this.playerName = playerName;
        this.position = position;
        this.overall = overall;
        this.chanceOfScoringFromBigOpportunity = chanceOfScoringFromBigOpportunity;
        this.chanceOfScoringFromSmallOpportunity = chanceOfScoringFromSmallOpportunity;
        this.goals = 0;
        this.stamina = 100;
        this.injured = false;
        this.matchesUntilComesBackFromInjury = 0;
        this.numberOfYellowCards = 0;
        this.numberOfRedCards = 0;
        this.excluded = false;
    }
    
    public Player() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public PlayerPosition getPosition() {
        return position;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position;
    }

    public double getOverall() {
        return overall;
    }

    public void setOverall(double overall) {
        this.overall = overall;
    }

    public double getChanceOfScoringFromBigOpportunity() {
        return chanceOfScoringFromBigOpportunity;
    }

    public void setChanceOfScoringFromBigOpportunity(double chanceOfScoringFromBigOpportunity) {
        this.chanceOfScoringFromBigOpportunity = chanceOfScoringFromBigOpportunity;
    }

    public double getChanceOfScoringFromSmallOpportunity() {
        return chanceOfScoringFromSmallOpportunity;
    }

    public void setChanceOfScoringFromSmallOpportunity(double chanceOfScoringFromSmallOpportunity) {
        this.chanceOfScoringFromSmallOpportunity = chanceOfScoringFromSmallOpportunity;
    }

    public int getGoals() {
        return goals;
    }
    
    public void increaseGoals() {
        this.goals += 1;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public boolean isInjured() {
        return injured;
    }

    public void setInjured(boolean injured) {
        this.injured = injured;
    }

    public int getMatchesUntilComesBackFromInjury() {
        return matchesUntilComesBackFromInjury;
    }

    public void setMatchesUntilComesBackFromInjury(int matchesUntilComesBackFromInjury) {
        this.matchesUntilComesBackFromInjury = matchesUntilComesBackFromInjury;
    }

    public int getNumberOfYellowCards() {
        return numberOfYellowCards;
    }

    public void increaseNumberOfYellowCards() {
        this.numberOfYellowCards++;
    }

    public int getNumberOfRedCards() {
        return numberOfRedCards;
    }

    public void increaseNumberOfRedCards() {
        this.numberOfRedCards++;
    }

    public boolean isExcluded() {
        return excluded;
    }

    public void setExcluded(boolean excluded) {
        this.excluded = excluded;
    }

}


