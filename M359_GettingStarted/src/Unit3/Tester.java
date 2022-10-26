package Unit3;

import java.util.Objects;
import java.util.Scanner;

public class Tester {
    public static void findFactors(int n){
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        findFactors(40);
    }
}