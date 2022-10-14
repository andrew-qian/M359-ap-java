package Unit4.examples.ChallengingLoops;

public class ChallengingLoops {
    public static void everyOtherLetterPyramid(String str){
        int num = str.length();
        System.out.println(str);
        if (num != 0){
            num = str.length();
            for (int i = 0; i < num; i += 2){
                str += str.charAt(i);
            }
            System.out.println(str);
            everyOtherLetterPyramid(str);
        }

    }

    public static void main(String[] args) {
        everyOtherLetterPyramid("FremdVikings");
    }
}
