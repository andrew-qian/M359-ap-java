package Unit7.TicketMasterLab;

import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Show show = new Show("02-14-22", 124.75, 52, "Beyonce", "Chicago");
        System.out.println(TicketMaster.readFile("showData.txt"));
    }
}
