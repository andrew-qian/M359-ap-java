package Unit7.TicketMasterLab;

import java.util.Scanner;


public class TicketMasterDriver {
    private static final int SORT_AZ = 1;
    private static final int SORT_ZA = 2;
    private static final int SORT_LH = 3;
    private static final int SORT_HL = 4;
    private static final int SEARCH_CITY = 5;
    private static final int QUIT = 6;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TicketMaster allShows = new TicketMaster(TicketMaster.readFile("showData.txt"));
        choiceMenu(s, allShows);
    }

    public static void choiceMenu(Scanner s, TicketMaster obj){
        System.out.println("Input: ");
        int userInput = -1;
        System.out.println("1: Sort A-Z");
        System.out.println("2: Sort Z-A");
        System.out.println("3: Sort low-high (ticket price)");
        System.out.println("4: Sort high-low (ticket price)");
        System.out.println("5: Search by city");
        System.out.println("6: Quit");

        try{
            userInput = s.nextInt();
            s.nextLine();
        } catch (Exception e){
            System.out.println("TYPE ERROR");
            s.nextLine();
            choiceMenu(s, obj);
        }
        while (userInput > 6 || userInput < 1){
            System.out.println("Out of range.");
            choiceMenu(s, obj);
        }
        if (userInput == SORT_AZ){
            TicketMaster.optionOne(s, obj);
        }
        else if (userInput == SORT_ZA){
            TicketMaster.optionTwo(s, obj);
        }
        else if (userInput == SORT_LH){
            System.out.println("Option three.");
            TicketMaster.optionThree(s, obj);
        }
        else if (userInput == SORT_HL){
            System.out.println("Option four.");
            TicketMaster.optionFour(s, obj);
        }
        else if (userInput == SEARCH_CITY){
            TicketMaster.optionFive(s, obj);
        }
        else if (userInput == QUIT){
            System.out.println("Thank you for using TicketMaster!");
            System.exit(0);
        }
    }

}
