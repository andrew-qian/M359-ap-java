package Unit6.TriviaGame;

import Unit6.CourseStudentExample.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaTester {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TriviaQuestions.txt");
        Scanner inf = new Scanner(file);
        inf.nextLine();


        TriviaGame game = null;
        while (inf.hasNextLine()) {
            Questions[] allQuestions = new Questions[3];

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

                Questions q = new Questions(question, answerChoiceOne, answerChoiceTwo, answerChoiceThree, answerChoiceFour, answer, points);
                allQuestions[i] = q;
            }
            game = new TriviaGame(allQuestions);
        }
        System.out.println(game);
    }
}
