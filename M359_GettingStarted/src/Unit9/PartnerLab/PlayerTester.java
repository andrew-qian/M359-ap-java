package Unit9.PartnerLab;

public class PlayerTester {
    public static void main(String[] args) {
        Edge player = new Edge("Andrew", 0, 100, 100, 100, 100);
        Edge player1 = new Edge("Rithesh", 0, 100, 100, 100 , 100);
        System.out.println(player);
        player.compare(player1);
    }
}
