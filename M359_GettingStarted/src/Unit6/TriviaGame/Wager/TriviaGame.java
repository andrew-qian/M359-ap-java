package Unit6.TriviaGame.Wager;

import Unit6.TriviaGame.Question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    // all data connected to the actual game: T
    // nothing to do with the user who is currently playing: T
    private static Unit6.TriviaGame.Question[] questions;
    private int points;
    private int correctQuestions;
    private int questionsPlayed;
    private int streak;


    public TriviaGame(Unit6.TriviaGame.Question[] questions) {
        Unit6.TriviaGame.Question[] shuffledQuestions = new Unit6.TriviaGame.Question[questions.length]; // randomizes order of questions in constructor (no method)
        int index = (int)(Math.random() * shuffledQuestions.length);
        for (int i = 0; i < shuffledQuestions.length; i++){
            while (shuffledQuestions[index] != null){
                index = (int)(Math.random() * shuffledQuestions.length);
            }
            shuffledQuestions[index] = questions[i];
        }
        TriviaGame.questions = shuffledQuestions;
        points = 0;
        streak = 0;
        correctQuestions = 0;
        questionsPlayed = 0;
    }

    // method to read the text file
    public static Unit6.TriviaGame.Question[] readFile(String pathname) throws FileNotFoundException {
        // create file var
        // create Scanner var from the File var
        // user a loop to read in ALL question data and fill array
        File file = new File(pathname);
        Scanner inf = new Scanner(file);
        int questionNums = inf.nextInt();
        inf.nextLine();

        Unit6.TriviaGame.Question[] allQuestions = new Unit6.TriviaGame.Question[questionNums];
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

                Unit6.TriviaGame.Question q = new Unit6.TriviaGame.Question(question, answerChoiceOne, answerChoiceTwo, answerChoiceThree, answerChoiceFour, answer, points);
                allQuestions[i] = q;
            }
        }

        return allQuestions;
    }


    public Unit6.TriviaGame.Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getCorrectQuestions() {
        return correctQuestions;
    }

    public void setCorrectQuestions(int correctQuestions) {
        this.correctQuestions = correctQuestions;
    }

    public int getQuestionsPlayed() {
        return questionsPlayed;
    }

    public void setQuestionsPlayed(int questionsPlayed) {
        this.questionsPlayed = questionsPlayed;
    }
}

