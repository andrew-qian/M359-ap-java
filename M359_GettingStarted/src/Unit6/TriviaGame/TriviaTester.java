package Unit6.TriviaGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TriviaTester {
    public static void main(String[] args) throws FileNotFoundException {
        Question[] allQuestions = readFile("TriviaQuestions.txt");
        TriviaGame game = new TriviaGame(allQuestions);
        System.out.println(singleQuestion(allQuestions, 2));
        System.exit(0);
        //System.out.println(game);
    }


    public static String singleQuestion(Question[] allQuestions, int index){
        Question q = allQuestions[index];
        String str = "";
        System.out.println(q);
        Scanner n = new Scanner(System.in);
        String input = n.nextLine();

        if (input.equals(q.getAnswer())){
            str = "Nice Job!";
        }
        else{
            str = "Nope!";
        }

        return str;
    }
    public static Question[] readFile(String pathname) throws FileNotFoundException {
        File file = new File(pathname);
        Scanner inf = new Scanner(file);
        inf.nextLine();

        Question[] allQuestions = new Question[3];
        while (inf.hasNextLine()) {


            for (int i = 0; i < allQuestions.length; i++) {
                String question = inf.nextLine();
                String answerChoiceOne = inf.nextLine();
                String answerChoiceTwo = inf.nextLine();
                String answerChoiceThree = inf.nextLine();
                String answerChoiceFour = inf.nextLine();
                String answer = inf.nextLine();
                int points = inf.nextInt();

                if (inf.hasNextLine()) {
                    inf.nextLine();
                }

                Question q = new Question(question, answerChoiceOne, answerChoiceTwo, answerChoiceThree, answerChoiceFour, answer, points);
                allQuestions[i] = q;
            }
        }

        return allQuestions;
    }

}
