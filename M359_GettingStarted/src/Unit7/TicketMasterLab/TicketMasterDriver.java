package Unit7.TicketMasterLab;

public class TicketMasterDriver {
    public static void main(String[] args){
        TicketMaster allShows = new TicketMaster(TicketMaster.readFile("showData.txt"));
        System.out.println(allShows);
    }
}