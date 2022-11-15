package Unit5.PartnerLab;

public class StarPlayer {
    private String playerName;
    private int playerStrength = 0;

    public StarPlayer(String playerName, int playerStrength) {
        this.playerName = playerName;
        this.playerStrength = playerStrength;
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
}
