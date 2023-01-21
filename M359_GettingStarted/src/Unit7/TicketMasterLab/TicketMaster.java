package Unit7.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private static ArrayList<Show> allShows;

    public TicketMaster(ArrayList<Show> allShows) {
        this.allShows = allShows;
    }

    public String toString(){
        String str = "Date\t\tPrice\t\tQty\t\t Performer\t\t\t\t City";
        str += "\n-------------------------------------------------------------\n";
        for (Show show: allShows){
            str += show;
        }
        return str;
    }

    public static void choiceMenu(Scanner s){
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

        } catch (Exception e){
            System.out.println("TYPE ERROR");
            s.nextLine();
            choiceMenu(s);



        }
        while (userInput > 6 && userInput < 1){
            choiceMenu(s);
        }
        if (userInput == 5){
            optionFive(s);
            choiceMenu(s);
        }
        else if (userInput == 6){
            System.out.println("Thank you for using TicketMaster!");
            System.exit(0);
        }


    }

    public static void optionFive(Scanner s){
        System.out.println("What city?");
        String userInput = null;
        try{
            userInput = s.next();
        } catch (Exception e){
            System.out.println("TYPE ERROR");
            optionFive(s);
        }
        searchCity(userInput);

    }

    public static void searchCity(String userInput){
        ArrayList<Show> showInCity = new ArrayList<>();
        for (Show show: allShows){
            if (show.getCity().equalsIgnoreCase(userInput)){
                showInCity.add(show);
            }
        }
        if (showInCity.size() == 0){
            System.out.println("City not found!");
        }
        else{
            TicketMaster citySort = new TicketMaster(showInCity);
            System.out.println(citySort);
        }
    }


    public static ArrayList<Show> readFile(String pathname){
        Scanner inf = null;
        File file;
        try{
            file = new File(pathname);
            inf = new Scanner(file);
        } catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            System.exit(0);
        }

        ArrayList<Show> allShows = new ArrayList<>();

        while (inf.hasNextLine()){
            String date = null;
            double price = 0;
            int qty = 0;
            String commaPart = null;

            try{
                date = inf.next();
                price = inf.nextDouble();
                qty = inf.nextInt();
                commaPart = inf.nextLine();
            }
            catch (Exception e){
                System.out.println("ERROR: DATA");
                System.exit(0);
            }

            String performer = "";
            String city = "";

            for(int j = 0; j < commaPart.length(); j++){
                if (commaPart.charAt(j) == ','){
                    performer = commaPart.substring(0,j);
                    city = commaPart.substring(j+2);
                }
            }

            Show show = new Show(date, price, qty, performer, city);
            allShows.add(show);

        }
        return allShows;
    }
}
