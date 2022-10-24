package Unit4.examples;

public class DebuggingPractice {
    public static void main(String[] args) {
        int sum = 0;
        String name = "Shrek";
        for (int i = 0; i < 5; i++){
            sum += i;
        }
        System.out.println(revString(name));
    }

    public static String revString(String str){
        String revStr = "";
        for (int i = str.length()-1; i >= 0; i--){
            revStr += str.charAt(i);
        }
        return revStr;
    }
}
