package Unit6.TriviaGame;

public class TriviaGame {
    private Questions[] questions;

    public TriviaGame(Questions[] questions) {
        this.questions = questions;
    }

    public String toString(){
        String str = "Welcome to NFL Trivia!\n";
        for (Questions q: questions){
            if (q != null)
                str += q + "\n";
        }
        return str;
    }

    public Questions[] getQuestions() {
        return questions;
    }

    public void setQuestions(Questions[] questions) {
        this.questions = questions;
    }
}

