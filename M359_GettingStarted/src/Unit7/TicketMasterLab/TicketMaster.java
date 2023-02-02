package Unit7.TicketMasterLab;

import javax.crypto.AEADBadTagException;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
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

    /**
     * If user input = 1, then sorts performers by A-Z
     * @param s Scanner for user input
     * @param obj Contains allShows array
     */

    public static void optionOne(Scanner s, TicketMaster obj){
        ArrayList<Show> backup = allShows;
        sortByPerformer(true);
        System.out.println(obj);
        obj.setAllShows(backup);
        TicketMasterDriver.choiceMenu(s, obj);
    }

    /**
     * If user input = 2, then sorts performers by Z-A
     * @param s Scanner for user input
     * @param obj Contains allShows array
     */

    public static void optionTwo(Scanner s, TicketMaster obj){
        ArrayList<Show> backup = allShows;
        sortByPerformer(false);
        System.out.println(obj);
        obj.setAllShows(backup);
        TicketMasterDriver.choiceMenu(s, obj);
    }

    /**
     * sorts allShows A-Z is AZ = true or Z-A if AZ = false by selection sort
     * @param AZ whether array is to be sorted A-Z or Z-A
     */
    public static void sortByPerformer(Boolean AZ){
        for (int i = 0; i < allShows.size() - 1; i++){
            int min = i;
            for (int j = i+1; j < allShows.size(); j++){
                // we are checking remaining values to see if they are smaller
                // than the value located at index min
                if (AZ){
                    if (allShows.get(j).getPerformer().compareTo(allShows.get(min).getPerformer()) < 0){
                        min = j;
                    }
                }
                else{
                    if (allShows.get(j).getPerformer().compareTo(allShows.get(min).getPerformer()) > 0){
                        min = j;
                    }
                }

            }
            // I know that min has the index of the smallest value
            // swap the values from index i and index min
            Show temp = allShows.get(min);
            allShows.set(min, allShows.get(i));
            allShows.set(i, temp);
        }
    }
    /**
     * If user input = 3, then sorts price by low-high
     * @param s Scanner for user input
     * @param obj Contains allShows array
     */

    public static void optionThree(Scanner s, TicketMaster obj){
        ArrayList<Show> backup = allShows;
        searchPrice(true);
        System.out.println(obj);
        obj.setAllShows(backup);
        TicketMasterDriver.choiceMenu(s, obj);
    }
    /**
     * If user input = 4, then sorts price by high-low
     * @param s Scanner for user input
     * @param obj Contains allShows array
     */
    public static void optionFour(Scanner s, TicketMaster obj){
        ArrayList<Show> backup = allShows;
        searchPrice(false);
        System.out.println(obj);
        obj.setAllShows(backup);
        TicketMasterDriver.choiceMenu(s, obj);
    }

    /**
     * Sorts allShows array by insertion sort by price
     * @param lowHigh whether price is to be sorted low to high or high - low
     */
    public static void searchPrice(boolean lowHigh){
        for (int i = 1; i < allShows.size(); i++){
            Show valueToInsert = allShows.get(i);
            int currentPos = i;
            if (lowHigh){
                while (currentPos > 0 && allShows.get(currentPos-1).getPrice() > valueToInsert.getPrice()){
                    // shift value at position - 1 over to position

                    allShows.set(currentPos, allShows.get(currentPos-1));
                    currentPos--;
                }
            }
            else{
                while (currentPos > 0 && allShows.get(currentPos-1).getPrice() < valueToInsert.getPrice()){
                    // shift value at position - 1 over to position

                    allShows.set(currentPos, allShows.get(currentPos-1));
                    currentPos--;
                }
            }

            allShows.set(currentPos, valueToInsert);
        }
    }

    /**
     * If user input = 5, then asks for a city to search for in allShows
     * @param s Scanner for user input
     * @param obj Contains allShows array
     */
    public static void optionFive(Scanner s, TicketMaster obj){
        System.out.println("What city?");
        String userInput = null;
        try{
            userInput = s.nextLine();
        } catch (Exception e){
            System.out.println("TYPE ERROR");
            optionFive(s, obj);
        }
        searchCity(userInput, obj);
        TicketMasterDriver.choiceMenu(s, obj);
    }

    /**
     * Searches for city by linear search, returns message if not found
     * @param userInput city to search for
     * @param obj contains allShows array
     */
    public static void searchCity(String userInput, TicketMaster obj){
        ArrayList<Show> backup = allShows;
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
            obj.setAllShows(showInCity);
            System.out.println(obj);
            obj.setAllShows(backup);
        }
    }

    /**
     * Reads file to add to arrayList
     * @param pathname pathname for userFile
     * @return arrayList with type Show
     */
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

    public static ArrayList<Show> getAllShows() {
        return allShows;
    }

    public static void setAllShows(ArrayList<Show> allShows) {
        TicketMaster.allShows = allShows;
    }
}
