package Unit2.examples.scannerClass;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("What is your hourly pay rate?");
        double payRate = input.nextDouble();

        System.out.println(name + " " + age + " " + payRate);
    }
}
