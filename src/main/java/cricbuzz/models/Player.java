package cricbuzz.models;

public class Player {
    private int id;
    private String name;
    private BattingStats battingStats;
    private BowlingStats bowlingStats;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BattingStats getBattingStats() {
        return battingStats;
    }

    public void setBattingStats(BattingStats battingStats) {
        this.battingStats = battingStats;
    }

    public BowlingStats getBowlingStats() {
        return bowlingStats;
    }

    public void setBowlingStats(BowlingStats bowlingStats) {
        this.bowlingStats = bowlingStats;
    }
}
