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

        System.out.println(introText(n));
        // gameplay
        for (int i = 0; i < game.getQuestions().length; i++){
            System.out.println(singleQuestion(n, game.getQuestions(), i, game));
            System.out.println(continueGame(n, game));
        }


    }

    public static String introText(Scanner userInput){
        String str = "Welcome to NFL Trivia!";
        str += "\nWhat is your name? ";
        System.out.println(str);
        String name = userInput.nextLine();
        return "Hello " + name + ", good luck!\n" + "Instructions: \n" + "For every question, answer with the letter associated with the answer\n" + "(Don't type out the answer; it will be incorrect)\n";

    }

    public static String singleQuestion(Scanner n, Question[] allQuestions, int index, TriviaGame game){
        Question q = allQuestions[index];
        String str;
        System.out.println(q);
        String input = n.nextLine();

        if (checkAnswer(q, input)){
            str = "Nice Job! " + "(+" + q.getValue() + ")";
            game.setPoints(game.getPoints() + q.getValue());
            game.setStreak(game.getStreak()+1);
            game.setCorrectQuestions(game.getCorrectQuestions()+1);
        }
        else{
            str = "Nope! (+0)\n";
            str += "Right answer was: " + q.getAnswer();
            game.setStreak(0);
        }


        str += "\nTotal Points: " + game.getPoints();
        str += "\nCurrent Streak: " + game.getStreak();
        game.setQuestionsPlayed(game.getQuestionsPlayed() + 1);
        return str;
    }

    public static void endLog(TriviaGame game){
        double percentCorrect = (double)game.getCorrectQuestions()/game.getQuestionsPlayed()*100;
        percentCorrect = percentCorrect * Math.pow(10, 2);
        percentCorrect = Math.floor(percentCorrect);
        percentCorrect = percentCorrect / Math.pow(10, 2);

        String str = "";
        str += "Final Score: " + game.getPoints() + "\n";
        str += "Number of Questions Answered Correctly: " + game.getCorrectQuestions() + "\n";
        str += "Percent of Questions Answered Correctly: " + percentCorrect + "%";
        System.out.println(str);
        System.exit(0);
    }
    public static String continueGame(Scanner userInput, TriviaGame game){
        String str = "";
        System.out.println("Continue game? (y/n)");
        String continueGame = userInput.nextLine();


        while (game.getQuestionsPlayed() < game.getQuestions().length){
            if (continueGame.equalsIgnoreCase("y")){
                str += "Ok, continuing game\n";
            }
            else{
                endLog(game);
            }
            return str;
        }
        System.out.println("No more questions.");
        endLog(game);
        return null;
    }

    public static boolean checkAnswer(Question q, String userAnswer){
        return q.getAnswer().equalsIgnoreCase(userAnswer);
    }


}
