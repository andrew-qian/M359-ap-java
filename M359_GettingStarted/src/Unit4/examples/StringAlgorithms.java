package Unit4.examples;

public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for (int i = 0; i < mySchool.length(); i+=2){
            System.out.print(mySchool.charAt(i));
        }
        System.out.println("");


        // print the String mySchool in reverse (all characters on the same line)
        String str = "";
        for (int i = 0; i < mySchool.length(); i++){
            str = mySchool.charAt(i) + str;
        }
        System.out.println(str);




         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        String animal = "monkey";
        for (int i = 0; i < animal.length() + 1; i++){
            System.out.println(animal.substring(0,i));
        }





        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb. ";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        // Print the amount of times the word "little" appears within phrase?
        int count = 0;
        for (int i = 0; i < phrase.length() - 6; i++){
            if (phrase.substring(i, i + 6).equals("little")){
                count++;
            }
        }
        System.out.println("The word \"little\" appears in phrase " + count + " times.");


        // create a new String, or modify the existing String, that removes
        // the word "little" entirely
        String str1 = "";
        int incre = 0;
        for (int i = 0; i < phrase.length() - 6; i++){
            if (phrase.substring(i, i + 6).equals("little")){
                str1 += phrase.substring(incre, i-1);
                incre = i+6;
            }
        }
        str1 += phrase.substring(incre);

        System.out.println(str1);

        int incre1 = 0;
        String str2 = "";
        for (int i = 0; i < phrase.length() - 6; i++){
            if (phrase.substring(i, i + 6).equals("little")){
                str2 += phrase.substring(incre1, i-1);
                str2 += " BIG";
                incre1 = i+6;
            }
        }
        str2 += phrase.substring(incre1);

        System.out.println(str2);






        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"




    }
}
