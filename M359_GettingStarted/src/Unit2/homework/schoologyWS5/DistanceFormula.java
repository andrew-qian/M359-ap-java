package Unit2.homework.schoologyWS5;
import java.util.Scanner;


// Andrew Qian, Denna, 3

public class DistanceFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = input.nextInt();
        System.out.print("Enter y1: ");
        int y1 = input.nextInt();
        System.out.print("Enter x2: ");
        int x2 = input.nextInt();
        System.out.print("Enter y2: ");
        int y2 = input.nextInt();

        String point1 = "(" + x1 +", " + y1 + ")";
        String point2 = "(" + x2 + ", " + y2 + ")";
        double dist = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

        System.out.print("The distance between " + point1 + " and " + point2 + " is " + dist);
    }
}
