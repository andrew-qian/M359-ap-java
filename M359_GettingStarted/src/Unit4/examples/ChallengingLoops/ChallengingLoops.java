package Unit4.examples.ChallengingLoops;

public class ChallengingLoops {
    public static void everyOtherLetterPyramid(String str){
        System.out.println(str);
        String ans;
        while(str.length()>1) {
            ans = "";
            for (int i = 0; i < str.length(); i += 2) {
                ans += str.charAt(i);
            }
            System.out.println(ans);
            str = ans;
        }
    }

    public static void main(String[] args) {
        everyOtherLetterPyramid("FremdVikings");
    }
}
