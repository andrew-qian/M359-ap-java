package Unit8;

public class Notepad {
    public static void main(String[] args) {
        int[][] nums = new int[3][6];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[0].length; j++){
                nums[i][j] = 1 + i + j;
            }
        }

        for (int[] arr: nums){
            for (int i: arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
