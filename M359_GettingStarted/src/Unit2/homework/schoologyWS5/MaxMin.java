package Unit2.homework.schoologyWS5;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Max: ");
        int max = input.nextInt();
        System.out.print("Min: ");
        int min = input.nextInt();

        int random = (int)(Math.random()*(max-min+1)) + min;

        System.out.println("Random number: " + random);


    }
}
