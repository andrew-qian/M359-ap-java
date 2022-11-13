package Unit5.PartnerLab;

public class StarPlayer {
    private String playerName;
    private static int playerStrength = 0;

    public StarPlayer(String playerName, int playerStrength) {
        this.playerName = playerName;
        StarPlayer.playerStrength = playerStrength;
    }

    public String toString(){
        return "The player is: " + playerName + " and is on: " + playerStrength;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public static int getPlayerStrength() {
        return playerStrength;
    }

    public void setPlayerStrength(int playerStrength) {
        StarPlayer.playerStrength = playerStrength;
    }
}
