package Unit2.homework.Tst;

public class Test {
    public static void main(String[] args) {String s1 = "ABCDEFGHI";

        String s2 = s1.substring(6, 7);

        String s3 = new String("abcdefghi");

        String s4 = s3.substring(4, 5);

        String s5 = s3.substring(2, 3);

        System.out.print(s2 + s4 + s5);
    }

}
