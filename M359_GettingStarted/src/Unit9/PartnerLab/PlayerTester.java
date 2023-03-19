package Unit9.PartnerLab;
// Teacher: Denna Period 3
// Students: Andrew Qian and Rithesh Balusu
// Class: Tester class

import java.security.cert.CertificateParsingException;

public class PlayerTester {
    public static void main(String[] args) {
        Player player = new Player("Andrew", 50, 50);
        Quarterback player1 = new Quarterback("Rithesh1", 100, 100, 100 , 100);
        WideReceiver player2 = new WideReceiver("Rithesh", 100, 100, 100 ,100);
        Cornerback island = new Cornerback("DARELLE REVIS", 90, 75, 99, 88);
        Edge mackAttack = new Edge("KHALIL MACK", 90, 99, 82, 100);
        WideReceiver player3 = new WideReceiver("Clown", 12, 12, 12 ,12);

        Player[] playerArray = {player, player1, player2, island, mackAttack};
        for (Player p: playerArray){
            System.out.println(p.toString());
            p.printContract();
        }

        player2.compare(player3);
    }
}
