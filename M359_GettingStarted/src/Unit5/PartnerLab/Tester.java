package Unit5.PartnerLab;

import static Unit5.PartnerLab.SimulateSeason.franchiseLog;
import static Unit5.PartnerLab.SimulateSeason.simulateSeason;

public class Tester {
    public static void main(String[] args) {
        Team bears = new Team(12, 14, "Bears");
        for (int i = 0; i < 5; i++){
            System.out.println(simulateSeason(bears));
        }
        System.out.println(franchiseLog());
    }
    // bears better
    // BEAR DOWN ANDREW
    // Seahawks suck


}
