package Unit4.examples;

import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;


        // user will enter -999 to exit
        // need to create int vars for sum and count
        // prompt the user for their value
        // while a loop making sure they want to continue,
        // add to the sum
        System.out.println("Enter an int: (-999 to quit)");
        int value = input.nextInt();
        // increment the count
        while (value != -999){
            sum += value;
            count ++;
            System.out.println("Enter an int: (-999 to quit)");
            value = input.nextInt();
        }
        double average = (double)(sum)/count;
        System.out.println(average);
        // calculate the average
        // print it out
    }
}
