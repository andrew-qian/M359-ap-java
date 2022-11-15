package Unit5.PartnerLab;

public class Team {
    private int defenseRanking, offenseRanking, wins, sbWins, losses, rivalryWins, totalWins, totalLosses, perfectSeasonYear;
    private boolean hasPerfectSeason;
    private StarPlayer teamStarPlayer;
    private String teamName;

    private static String rivalryRecord = "";


    String[] teamNameArray = {"49ers", "Bears", "Bengals", "Bills", "Broncos", "Browns", "Buccaneers", "Cardinals", "Chargers",
            "Chiefs", "Colts", "Commanders", "Cowboys", "Dolphins", "Eagles", "Falcons", "Giants", "Jaguars", "Jets", "Lions",
            "Packers", "Panthers", "Patriots", "Raiders", "Rams", "Ravens", "Saints", "Seahawks", "Steelers", "Texans", "Titans", "Vikings"};

    public Team(String teamName, int offenseRanking, int defenseRanking, String playerName, int playerStrength) {
        this.defenseRanking = defenseRanking;
        this.offenseRanking = offenseRanking;
        this.teamName = teamName;
        teamStarPlayer = new StarPlayer(playerName, playerStrength);
        wins = 0;
        losses = 0;
        sbWins = 0;
        rivalryWins = 0;
        totalWins = 0;
        totalLosses = 0;
        perfectSeasonYear = 0;
        hasPerfectSeason = false;

    }

    public Team(int offenseRanking, int defenseRanking) {
        int randInt = (int)(Math.random()*32);
        this.defenseRanking = defenseRanking;
        this.offenseRanking = offenseRanking;
        this.teamName = teamNameArray[randInt];
        wins = 0;
        losses = 0;
        sbWins = 0;

    }

    public Team(){
        int randInt = (int)(Math.random()*32);
        defenseRanking = (int)(Math.random()*32+1);
        offenseRanking = (int)(Math.random()*32+1);
        this.teamName = teamNameArray[randInt];

        losses = 0;
        wins = 0;
        sbWins = 0;

    }

    public int getDefenseRanking() {
        return defenseRanking;
    }

    public void setDefenseRanking(int defenseRanking) {
        this.defenseRanking = defenseRanking;
    }

    public int getOffenseRanking() {
        return offenseRanking;
    }

    public void setOffenseRanking(int offenseRanking) {
        this.offenseRanking = offenseRanking;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getSbWins() {
        return sbWins;
    }

    public void setSbWins(int sbWins) {
        this.sbWins = sbWins;
    }

    public StarPlayer getTeamStarPlayer() {
        return teamStarPlayer;
    }

    public void setTeamStarPlayer(StarPlayer teamStarPlayer) {
        this.teamStarPlayer = teamStarPlayer;
    }


    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getRivalryWins() {
        return rivalryWins;
    }

    public void setRivalryWins(int rivalryWins) {
        this.rivalryWins = rivalryWins;
    }

    public void setRivalryRecord(Team x, Team y){
        rivalryRecord = x.getTeamName() + " vs " +  y.getTeamName() + " " +x.getRivalryWins() + "-" + y.getRivalryWins();

    }

    public static String getRivalryRecord() {
        return rivalryRecord;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }

    public int getTotalLosses() {
        return totalLosses;
    }

    public void setTotalLosses(int totalLosses) {
        this.totalLosses = totalLosses;
    }

    public int getPerfectSeasonYear() {
        return perfectSeasonYear;
    }

    public void setPerfectSeasonYear(int perfectSeasonYear) {
        this.perfectSeasonYear = perfectSeasonYear;
    }

    public boolean isHasPerfectSeason() {
        return hasPerfectSeason;
    }

    public void setHasPerfectSeason(boolean hasPerfectSeason) {
        this.hasPerfectSeason = hasPerfectSeason;
    }
}
