package Unit6.TriviaGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private Question[] questions;

    private static int index = 0;

    public TriviaGame(Question[] questions) {
        this.questions = questions;
    }

    public String toString(){
        String str = "Welcome to NFL Trivia!\n";
        for (int i = 0; i < questions.length; i++){
            if (questions[i] != null)
                str += questions[i] + "\n";
        }
        return str;
    }




    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}

