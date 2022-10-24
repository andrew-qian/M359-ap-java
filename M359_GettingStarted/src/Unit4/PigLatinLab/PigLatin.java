package Unit4.PigLatinLab;

import java.util.Locale;

public class PigLatin {
    // create toPigLatin method; make it so that it uses translateWordToPigLatin
    // every time there is a space

    //create translateWordToPigLatin method, check if the first letter is
    //a vowel or not, then run two cases, find consonant cluster and then stick it to the end
    // plus an "ay" and then stick the end of the original phrase in the front
    // str ans = end of string + consonant chunk + "ay";
    //if vowel  add yay to the end
    // str ans = str + yay;

    public static String toPigLatin(String str){
        String ans = "";
        int index = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                ans += translateWordToPigLatin(str.substring(index, i)) + " ";
                index = i+1;
            }
        }
        ans += translateWordToPigLatin(str.substring(index));
        ans = ans.substring(0,1).toUpperCase() + ans.substring(1);
        return ans;
    }

    public static String translateWordToPigLatin(String str){
        String ans = "";
        str = str.toLowerCase();
        if (checkFirstVowel(str)){
            ans = str + "yay";
            return ans;
        }
        else {
            String chunk = "";
            int index = 0;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                        || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                    chunk = str.substring(0,i);
                    index = i;
                    break;
                }
            }
            ans = str.substring(index) + chunk + "ay";
            return ans;
        }
    }

    public static boolean checkFirstVowel(String str) {
        if (str.startsWith("a") || str.startsWith("e") || str.startsWith("i")
                || str.startsWith("o") || str.startsWith("u")) {
            return true;
        }
        return false;
    }
}
