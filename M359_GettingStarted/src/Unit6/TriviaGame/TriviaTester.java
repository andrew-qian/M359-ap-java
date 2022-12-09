package Unit6.TriviaGame;


import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriviaTester {
    // nmo instance variables

    public static void main(String[] args) throws FileNotFoundException {
        // local variables

        Question[] allQuestions = TriviaGame.readFile("TriviaQuestions.txt");
        TriviaGame game = new TriviaGame(allQuestions);


        // create my Scanner to interact with the user
        // only make ONE keyboard Scanner
        // you are allowed to pass the Scanner var to a method

        Scanner n = new Scanner(System.in);

        // gameplay
        for (int i = 0; i < game.getQuestions().length; i++){
            System.out.println(singleQuestion(n, game.getQuestions(), i));
        }


    }

    public static String singleQuestion(Scanner n, Question[] allQuestions, int index){
        Question q = allQuestions[index];
        String str;
        System.out.println(q);
        String input = n.nextLine();

        if (checkAnswer(q, input)){
            str = "Nice Job!";
             += q.getValue(); // MAKE IT SO POINT METHOD WORKS
        }
        else{
            str = "Nope! ";
            str += "Right answer was: " + q.getAnswer();
        }

        str += "\nPoints: " + points;

        return str;
    }

    public static boolean checkAnswer(Question q, String userAnswer){
        return q.getAnswer().equalsIgnoreCase(userAnswer);
    }

}
