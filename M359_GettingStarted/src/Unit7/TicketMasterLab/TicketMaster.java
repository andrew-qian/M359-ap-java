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
        String str = "Date\t\tPrice\t\tQty\t\tPerformer\t\tCity";
        str += "\n---------------------------------------------------\n";
        for (Show show: allShows){
            str += show;
        }
        return str;
    }


    public static ArrayList<Show> readFile(String pathname) throws FileNotFoundException{
        File file = new File(pathname);
        Scanner inf = new Scanner(file);

        ArrayList<Show> allShows = new ArrayList<>();

        while (inf.hasNextLine()){
            String date = inf.next();
            double price = inf.nextDouble();
            int qty = inf.nextInt();
            String commaPart = inf.nextLine();
            String performer = "";
            String city = "";

            for(int j = 0; j < commaPart.length(); j++){
                if (commaPart.charAt(j) == ','){
                    performer = commaPart.substring(0,j);
                    city = commaPart.substring(j+2);
                }
            }

            if (inf.hasNextLine()){
                inf.nextLine();
            }

            Show show = new Show(date, price, qty, performer, city);
            allShows.add(show);
            // not reading full file
        }
        return allShows;
    }
}
