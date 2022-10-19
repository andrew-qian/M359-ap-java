package Unit4.homework;

public class Tester {
    public static void printNums(int value, int numRounds){
        while (numRounds > 0){
            int randInt = (int)(Math.random()*10);
            System.out.print(randInt);
            if (randInt == value){
                System.out.println();
                numRounds--;
            }
        }
    }
    public static void main(String[] args) {
        printNums(5,4);
    }
}
