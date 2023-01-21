package Unit7.TicketMasterLab;

import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TicketMaster allShows = new TicketMaster(TicketMaster.readFile("showData.txt"));
        TicketMaster.choiceMenu(s);
    }
}
