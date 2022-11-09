package Unit5.PartnerLab;

public class Team {
    private int defenseRanking, offenseRanking, wins, sbWins;
    private String teamName;



    public Team(int offenseRanking, int defenseRanking, String teamName) {
        this.defenseRanking = defenseRanking;
        this.offenseRanking = offenseRanking;
        this.teamName = teamName;
        wins = 0;
        sbWins = 0;
    }

    public Team(int lowerOffenseBound, int lowerDefenseBound) { //random Playoffs team
        this.teamName = "";
        defenseRanking = (int)(Math.random()*lowerOffenseBound+1);
        offenseRanking = (int)(Math.random()*lowerDefenseBound+1);
        wins = 0;
        sbWins = 0;
    }

    public Team(){
        this.teamName = "";
        defenseRanking = (int)(Math.random()*32+1);
        offenseRanking = (int)(Math.random()*32+1);
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
}
