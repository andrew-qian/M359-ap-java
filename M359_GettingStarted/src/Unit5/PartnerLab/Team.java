package Unit5.PartnerLab;

public class Team {
    private int defenseRanking, offenseRanking, wins;
    private String teamName;



    public Team(int offenseRanking, int defenseRanking, String teamName) {
        this.defenseRanking = defenseRanking;
        this.offenseRanking = offenseRanking;
        this.teamName = teamName;
        wins = 0;
    }

    public Team(String teamName) {
        this.teamName = teamName;
        defenseRanking = (int)(Math.random()*32+1);
        offenseRanking = (int)(Math.random()*32+1);
        wins = 0;
    }

    public Team(){
        this.teamName = ""; // change to get something from an array of team names;
        defenseRanking = (int)(Math.random()*32+1);
        offenseRanking = (int)(Math.random()*32+1);
        wins = 0;

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
}
