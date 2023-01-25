package Unit7;

import java.util.ArrayList;

public class SelectionSortNotes {
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

        // Selection Sort
        // outer loop goes from zero to size() - 1
            // set min index = this index
            // inner loop goes from outer loop +1 to size()
                //update min index as needed
            // swap min index with outer loop index

        for (int i = 0; i < myNums.size() - 1; i++){
            int min = i;
            for (int j = i+1; j < myNums.size(); j++){
                // we are checking remaining values to see if they are smaller
                // than the value located at index min
                if (myNums.get(j) < myNums.get(min)){
                    min = j;
                }
            }
            // I know that min has the index of the smallest value
            // swap the values from index i and index min
            int temp = myNums.get(min);
            myNums.set(min, myNums.get(i));
            myNums.set(i, temp);
        }
        System.out.println(myNums);


    }
}
