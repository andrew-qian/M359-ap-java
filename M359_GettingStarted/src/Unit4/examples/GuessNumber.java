package Unit4.examples;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randNum = (int)(Math.random() * 10 + 1);
        int count = 0;
        System.out.println("Guess a number from 1-10:");
        int value = input.nextInt();

        while (value != randNum){
            if (value < randNum){
                System.out.println("Your guess is too low");
                count ++;
            }
            else if (value > randNum){
                System.out.println("Your guess is too high");
                count ++;
            }
            System.out.println("Guess a number from 1-10:");
            value = input.nextInt();
        }
        count ++;
        System.out.println("Congrats! You guessed the number " + randNum + " in " + count);
    }
}
