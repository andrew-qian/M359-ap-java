package Unit9.PartnerLab;
/*

 */

import java.security.cert.CertificateParsingException;

public class PlayerTester {
    public static void main(String[] args) {
        Player player = new Player("Andrew", 50, 50);
        Quarterback player1 = new Quarterback("Rithesh", 100, 100, 100 , 100);
        WideReceiver player2 = new WideReceiver("Rithesh", 100, 100, 100 ,100);
        Cornerback island = new Cornerback("DARELLE REVIS", 90, 75, 99, 88);
        Edge mackAttack = new Edge("KHALIL MACK", 90, 99, 82, 100);
        Player[] playerArray = {player, player1, player2, island, mackAttack};
        for (Player p: playerArray){
            p.printContract();
        }
    }
}
