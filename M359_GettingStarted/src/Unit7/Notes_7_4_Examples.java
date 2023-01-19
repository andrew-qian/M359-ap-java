package Unit7;

import java.util.ArrayList;

/**
 * In this java file we will explore these key algorithms with ArrayLists
 * Determine a minimum or maximum value
 * Compute a sum, average, or mode
 * Determine if at least one element has a particular property
 * Determine if all elements have a particular property
 * Access all consecutive pairs of elements
 * Determine the presence or absence of duplicate elements
 * Determine the number of elements meeting specific criteria
 * (already did this last lesson with evens)
 * Shift or rotate elements left or right
 * Reverse the order of the elements
 */
public class Notes_7_4_Examples {
    public static void main(String[] args) {

        // Define ArrayLists to be used for testing the methods
        ArrayList<Integer> numsNoRepeats = new ArrayList<>();
        numsNoRepeats.add(2);
        numsNoRepeats.add(5);
        numsNoRepeats.add(3);
        numsNoRepeats.add(8);
        numsNoRepeats.add(9);
        numsNoRepeats.add(1);


        ArrayList<Integer> numsRepeats = new ArrayList<>();
        numsRepeats.add(2);
        numsRepeats.add(5);
        numsRepeats.add(1);
        numsRepeats.add(2);
        numsRepeats.add(6);
        numsRepeats.add(8);


        ArrayList<Integer> orderedNums = new ArrayList<>();
        orderedNums.add(2);
        orderedNums.add(3);
        orderedNums.add(8);
        orderedNums.add(11);
        orderedNums.add(15);
        orderedNums.add(19);


        ArrayList<String> names = new ArrayList<>();
        names.add("Mya");
        names.add("John");
        names.add("Kim");
        names.add("Sanjana");
        names.add("Adi");
        names.add("Noah");

        System.out.print("numsNoRepeats: ");
        System.out.println(numsNoRepeats);
        System.out.println(findMin(numsNoRepeats));
        System.out.println(findMax(numsNoRepeats));
        System.out.println(findSum(numsNoRepeats));
        System.out.println(findAverage(numsNoRepeats));

        System.out.print("\nnumsRepeats: ");
        System.out.println(numsRepeats);

        System.out.print("\norderedNums: ");
        System.out.println(orderedNums);

        System.out.print("\nnames: ");
        System.out.println(names);
        System.out.println(revArrayList(names));
        shiftLeft(names);
        System.out.println(names);
    }

    /**
     * Finds the smallest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMin(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer i : list) {
            if (i <= min) {
                min = i;
            }
        }
        return min;
    }

    /**
     * Finds the largest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (i >= max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Finds the sum of all values in the ArrayList
     * @param list
     * @return returns the int value for the sum
     */
    public static int findSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i: list){
            sum += i;
        }
        return sum;
    }

    /**
     * Finds the average as a double of all Integer values
     * @param list
     * @return double average value
     */
    public static double findAverage(ArrayList<Integer> list) {
        return (double)(findSum(list))/list.size();
    }

    /**
     * Determines if all values are in increasing order
     * @param list
     * @return true or false if increasing
     */
    public static boolean isIncreasing(ArrayList<Integer> list) {
        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i) >= list.get(i+1)){
                return false;
            }
            // DON'T RETURN FALSE
        }
        return true;
    }

    /**
     * Checks if any values within the ArrayList are repeated anywhere else
     * in the ArrayList
     * @param list
     * @return true if any values are repeated, false otherwise
     */
    public static boolean hasDuplicates(ArrayList<String> list) {
        for (int i = 0; i < list.size()-1; i++){
            for (int j = i+1; j < list.size(); j++){
                if (list.get(i).equals(list.get(j))){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Creates a new ArrayList of Strings that is equal to the original ArrayList
     * in reverse order.  Original ArrayList is unchanged.
     * @param list
     * @return new ArrayList of Strings in reverse order
     */
    public static ArrayList<String> revArrayList(ArrayList<String> list) {
        // create and instantiate a new AL
        // use a loop to fill it
        // return the AL
        ArrayList<String> output = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--){
            output.add(list.get(i));
        }
        return output;
    }

    /**
     * Shifts all values in list to the Left and the value at index 0 is moved
     * to index list.size() - 1.
     * @param list
     */
    public static void shiftLeft(ArrayList<String> list) {
        String removedString = list.remove(0);
        list.add(removedString);
    }

}
