package Unit7.TicketMasterLab;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Show show = new Show("02-14-22", 124.75, 52, "Beyonce", "Chicago");
        TicketMaster allShows = new TicketMaster(TicketMaster.readFile("showData.txt"));
        System.out.println(allShows);
    }
}
