package Unit6.TriviaGame.Wager;


import Unit6.TriviaGame.Question;
import Unit6.TriviaGame.TriviaGame;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriviaTester {
    // nmo instance variables

    public static void main(String[] args) throws FileNotFoundException {
        // local variables

        Unit6.TriviaGame.Question[] allQuestions = Unit6.TriviaGame.TriviaGame.readFile("TriviaQuestions.txt");
        Unit6.TriviaGame.TriviaGame game = new Unit6.TriviaGame.TriviaGame(allQuestions);

        // create my Scanner to interact with the user
        // only make ONE keyboard Scanner
        // you are allowed to pass the Scanner var to a method

        Scanner n = new Scanner(System.in);

        System.out.println(introText(n));
        // gameplay
        for (int i = 0; i < game.getQuestions().length; i++){
            System.out.println(wager(n, i, game));
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

    public static String singleQuestion(Scanner n, Unit6.TriviaGame.Question[] allQuestions, int index, Unit6.TriviaGame.TriviaGame game){
        Unit6.TriviaGame.Question q = allQuestions[index];
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

    public static void endLog(Unit6.TriviaGame.TriviaGame game){
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

    public static String wager(Scanner n, int i, TriviaGame game){
        String str = "";
        System.out.println("Wager? (y/n)");
        String userInput = n.nextLine();

        if (userInput.equalsIgnoreCase("y")){
            System.out.println("How much? ");
            int userWager = n.nextInt();
            n.nextLine();

            if (userWager > game.getPoints()) {
                System.out.println("Wagered too much.");
                wager(n, i, game);
            }
            game.getQuestions()[i].setValue(userWager);
            str += "Ok, wager set.";
        }
        else{
            str += "Ok, no wager.\n";
        }
        return str;
    }

}
