package Unit4.TestReview;

import java.util.Scanner;

public class SchU4TestRevWScode {
        public static void main(String[] args)
        {
          /*  #1 Write a method called doubleChar where when a
        String is passed, it returns a String that takes every
        char in the original and doubles it.
        Uncomment the lines below when you are ready to test your code
        */
            System.out.println(doubleChar("The"));             // returns "TThhee"
            System.out.println(doubleChar("AAbb"));            // returns "AAAAbbbb"
            System.out.println(doubleChar("Hi-There"));        // returns "HHii--TThheerree"


        /*  #2 Write a method called repeatFront that accepts a String
        and an int n and returns a String made of the first n characters
        of the String, followed by the first n-1 characters of the
        String, and so on. You may assume that n is between 0 and the
        length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

        */

            System.out.println(repeatFront("Chocolate", 4));   // returns "ChocChoChC"
            System.out.println(repeatFront("Chocolate", 3));   // returns "ChoChC"
            System.out.println(repeatFront("Ice Cream", 2));   // returns "IcI"


            /*  #3 Use a loop to print each letter of a given String on its own line.

             */
        String str = "Chocolate";
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
        /*  #4 Write a method called reverseRemove that accepts a String and
        returns the String in reverse order, with every other character removed.
        */
            System.out.println(reverseRemove("ComputerScience"));    // returns "eniSeumC"

        /*  #5 Write a method called removeChar that accepts a String and a char
        and returns a new String that has all instances of that character removed.
        */

            System.out.println(removeChar("Brookfield Zoo is Awesome", 'o'));
            // returns "Brkfield Z is Awesme"


        /*  #6 Use a loop to generate the following output
            when given the String “HocusPocus”.

            Ho
            Hocu
            HocusP
            HocusPoc
            HocusPocus

        */

            String str1 = "HocusPocus";
            for (int i = 2; i <= str1.length(); i+= 2){
                System.out.println(str1.substring(0,i));
            }





        /*  #7 complete the method buildPhrase
            Complete the method buildPhrase that prompts the user
            to enter a phrase, one word at a time.  When they have
            entered all the words, the user will enter -1 to stop.
            After all of the words have been entered, the complete
            phrase will be returned, with spaces in between each of
            the words.  See the sample output on the worksheet
        */

            //System.out.println(buildPhrase());

       /* 8 Use nested loops to generate this output:

		1
		2 4
		3 6 9
		4 8 12 16
		5 10 15 20 25

		*/
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <=i; j++){
                System.out.print(i*j +"\t");
            }
            System.out.println();
        }

		/*  #9. Write a void method called findFactors that accepts an int and
		    will print all factors of the given parameter.
		*/
            findFactors(40);		 // prints: 40  20  10  8  5  4  2  1
            findFactors(17);		 // prints: 17  1

        }


        /************************************************************
         *
         * METHODS TO WRITE FOR THE PROBLEMS
         *
         ***********************************************************/

        // #1

        public static String doubleChar(String str) {
            String ans = "";
            for (int i = 0; i < str.length(); i++){
                ans += str.charAt(i);
                ans += str.charAt(i);
            }
            return ans;
        }



        // #2

        public static String repeatFront(String str, int n) {
            String ans = "";
            for (int i = n; i >=1; i--){
                ans += str.substring(0,i);
            }
            return ans;
        }

        public static String reverseRemove(String str){
            String ans = "";
            for (int i = str.length()-1; i >= 0; i-=2){
                ans += str.charAt(i);
            }
            return ans;
        }

        public static String removeChar(String str, char a){
            String ans = "";
            int index = 0;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == a){
                    ans += str.substring(index, i);
                    index = i+1;
                }
            }
            ans += str.substring(index);
            return ans;
        }
        // #7
        public static String buildPhrase() {
            String str = "";
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first word of your phrase (-1 to quit):");
            String word = input.nextLine();
            // loop
            while(!word.equals("-1")){
                System.out.println("Enter the next word of your phrase (-1 to quit):");
                str += word;
                word = input.nextLine();
            }
            return str;
            // complete any other method code


        }

        public static void findFactors(int n){

            for (int i = n; i >= 1; i--){
                if ((n % i) == 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        }




    }


