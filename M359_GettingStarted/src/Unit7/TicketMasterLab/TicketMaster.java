package Unit7.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> allShows;

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
