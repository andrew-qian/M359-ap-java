package Unit5.PartnerLab;

public class Team {
    private int defenseRanking, offenseRanking, wins, sbWins, losses;
    private StarPlayer teamStarPlayer;
    private String playerName;
    private int playerStrength;
    private String teamName;

    String[] teamNameArray = {"49ers", "Bears", "Bengals", "Bills", "Broncos", "Browns", "Buccaneers", "Cardinals", "Chargers",
            "Chiefs", "Colts", "Commanders", "Cowboys", "Dolphins", "Eagles", "Falcons", "Giants", "Jaguars", "Jets", "Lions",
            "Packers", "Panthers", "Patriots", "Raiders", "Rams", "Ravens", "Saints", "Seahawks", "Steelers", "Texans", "Titans", "Vikings"};

    String[] NFCEast = {"Cowboys", "Giants", "Eagles", "Commanders"};
    String[] NFCSouth = {"Falcons", "Panthers", "Saints", "Buccaneers"};
    String[] NFCNorth = {"Bears", "Lions", "Packers", "Vikings"};
    String[] NFCWest = {"Cardinals", "Rams", "49ers", "Seahawks"};

    String[] AFCEast = {"Bills", "Dolphins", "Patriots", "Jets"};
    String[] AFCSouth = {"Texans", "Colts", "Jaguars", "Titans"};
    String[] AFCNorth = {"Ravens", "Bengals", "Browns", "Steelers"};
    String[] AFCWest = {"Broncos", "Chiefs", "Raiders", "Chargers"};





    public Team(String teamName, int offenseRanking, int defenseRanking, String playerName, int playerStrength) {

        this.defenseRanking = defenseRanking;
        this.offenseRanking = offenseRanking;
        this.teamName = teamName;
        this.teamStarPlayer = new StarPlayer(playerName, playerStrength);
        wins = 0;
        losses = 0;
        sbWins = 0;
    }
    public Team(int offenseRanking, int defenseRanking) {
        int randInt = (int)(Math.random()*32);
        this.defenseRanking = defenseRanking;
        this.offenseRanking = offenseRanking;
        this.teamName = teamNameArray[randInt];
        /*
        String[] arr_new = new String[teamNameArray.length-1];
        for(int i=0, k=0;i<teamNameArray.length;i++){
            if(i!=randInt){
                arr_new[k] = (teamNameArray[i]);
                k++;
            }
        }
        this.teamNameArray = arr_new;
        */


        wins = 0;
        losses = 0;
        sbWins = 0;
    }

    public Team(){ // i'm slowly going insane i need to make it so that the array removes the team name
        int randInt = (int)(Math.random()*32);
        defenseRanking = (int)(Math.random()*32+1);
        offenseRanking = (int)(Math.random()*32+1);
        this.teamName = teamNameArray[randInt];
        /*String[] arr_new = new String[teamNameArray.length-1];
        for(int i=0, k=0;i<teamNameArray.length;i++){
            if(i!=randInt){
                arr_new[k] = (teamNameArray[i]);
                k++;
            }
        }
        this.teamNameArray = arr_new.clone();
        */

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

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerStrength() {
        return playerStrength;
    }

    public void setPlayerStrength(int playerStrength) {
        this.playerStrength = playerStrength;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
}
