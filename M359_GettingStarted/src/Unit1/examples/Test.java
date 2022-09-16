package Unit1.examples;

public class Test {
    public static void main(String[] args) {
        double x = 0;
        if (x >= 0) {
            x += 0.5;
            int y = (int)x;
            System.out.print(y);
        }

        else if (x < 0) {
            x -= 0.5;
            int y = (int)x;
            System.out.print(y);
        }
    }
}
