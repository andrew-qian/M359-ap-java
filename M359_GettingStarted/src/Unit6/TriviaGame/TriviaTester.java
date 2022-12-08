package Unit6.TriviaGame;


import java.io.FileNotFoundException;


public class TriviaTester {
    public static void main(String[] args) throws FileNotFoundException {
        Question[] allQuestions = TriviaGame.readFile("TriviaQuestions.txt");
        TriviaGame game = new TriviaGame(allQuestions);
        game.runGame();
        System.exit(0);
        //System.out.println(game);
    }





}
