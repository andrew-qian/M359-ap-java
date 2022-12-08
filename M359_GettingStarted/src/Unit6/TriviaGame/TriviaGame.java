package Unit6.TriviaGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private static Question[] questions;
    private static int points = 0;




    public TriviaGame(Question[] questions) {
        TriviaGame.questions = questions;
    }

    public static void runGame(){
        Question[] allQuestions = questions;
        int[] indexes = new int[allQuestions.length];
        for (int i = 0; i < allQuestions.length; i++){
            indexes[i] = i;
        }

        for (int i = 0; i < allQuestions.length; i++){
            int index = (int)(Math.random() * allQuestions.length);
            while (indexes[index] == -1){
                index = (int)(Math.random() * allQuestions.length);
            }

            System.out.println(singleQuestion(allQuestions, index));
            indexes[index] = -1;
        }

    }


    public static String singleQuestion(Question[] allQuestions, int index){
        Question q = allQuestions[index];
        String str;
        System.out.println(q);
        Scanner n = new Scanner(System.in);
        String input = n.nextLine();

        if (input.equals(q.getAnswer())){
            str = "Nice Job!";
            points += q.getValue();
        }
        else{
            str = "Nope! ";
            str += "Right answer was: " + q.getAnswer();
        }

        str += "\nPoints: " + points;

        return str;
    }

    public static Question[] readFile(String pathname) throws FileNotFoundException {
        File file = new File(pathname);
        Scanner inf = new Scanner(file);
        int questionNums = inf.nextInt();
        inf.nextLine();

        Question[] allQuestions = new Question[questionNums];
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
    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}

