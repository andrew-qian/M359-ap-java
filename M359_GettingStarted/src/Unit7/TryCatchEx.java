package Unit7;

import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = getNextIntVal(in, 1, 5);
        System.out.println(choice);

    }
    public static int getNextIntVal(Scanner in, int min, int max) {
        boolean keepGoing = true; // will keep prompting user until valid input
        int num = -1;
        while (keepGoing) {
            try {
                System.out.println(("Enter an int from (" + min + "-" + max + ")"));
                num = in.nextInt();
                // Now that I have an integer, I want to make sure the int
                // is in the range iI want (9-12)
                if (num >= min && num <= max) {
                    System.out.println("You entered " + num);
                    keepGoing = false;
                } else {
                    System.out.println("invalid");
                }
            } catch (Exception e) {
                System.out.println("invalid");
                in.nextLine();
            }
        }
        return num;
    }
}
