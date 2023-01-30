package Unit7;

import java.util.ArrayList;

public class InsertionSortNotes {
    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<>();
        myNums.add(3);
        myNums.add(1);
        myNums.add(0);
        myNums.add(8);
        myNums.add(4);
        myNums.add(1);
        myNums.add(7);
        System.out.println(myNums);

        for (int i = 1; i < myNums.size(); i++){
            Integer valueToInsert = myNums.get(i);
            int currentPos = i;

            while (currentPos > 0 && myNums.get(currentPos-1) > valueToInsert){
                // shift value at position - 1 over to position

                myNums.set(currentPos, myNums.get(currentPos-1));
                currentPos--;
            }
            myNums.set(currentPos, valueToInsert);
        }

        System.out.println(myNums);
    }
}
