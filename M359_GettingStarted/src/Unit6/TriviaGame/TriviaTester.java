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

    /**
     * Introduction text for the trivia game
     * @param userInput Name of user
     * @return Introduction text that welcomes the user
     */
    public static String introText(Scanner userInput){
        String str = "Welcome to NFL Trivia!";
        str += "\nWhat is your name? ";
        System.out.println(str);
        String name = userInput.nextLine();
        return "Hello " + name + ", good luck!\n" + "Instructions: \n" + "For every question, answer with the letter associated with the answer\n" + "(Don't type out the answer; it will be incorrect)\n";

    }

    /**
     * Prompts user for an answer from a single question
     * @param n User answer
     * @param allQuestions The array of all questions
     * @param index The index of the question being chosen
     * @param game Contains # of points, current streak, and total questions answered
     * @return Returns if user was right or wrong, how many points earned. Also, it returns the
     * current streak and total points.
     */
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

    /**
     * Prints out a final log including final score, # of correct answers, and % of correct answer
     * @param game contains data for the game (final score, correct answers, total questions asked)
     */
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

    /**
     * User decides whether to continue; if yes, another question is displayed; if no, end log is shown
     * and game terminates
     * @param userInput Yes or no to whether user wants to continue
     * @param game contains data for the game (final score, correct answers, total questions asked)
     *             if user wants to quit
     * @return returns text
     */
    public static String continueGame(Scanner userInput, TriviaGame game){
        String str = "";
        System.out.println("Continue game? (y/n)");
        String continueGame = userInput.nextLine();


        if (game.getQuestionsPlayed() < game.getQuestions().length){
            if (continueGame.equalsIgnoreCase("y")){
                str += "Ok, continuing game\n";
            }
            else if (continueGame.equalsIgnoreCase("n")){
                endLog(game);
            }
            else{
                continueGame(userInput, game);
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
