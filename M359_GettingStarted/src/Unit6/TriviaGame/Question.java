package Unit6.TriviaGame;


public class Question {
    private String question;
    private String answerChoiceOne, answerChoiceTwo, answerChoiceThree, answerChoiceFour;
    private String answer;
    private int value;

    public Question(String question, String answerChoiceOne,
                    String answerChoiceTwo, String answerChoiceThree, String answerChoiceFour,
                    String answer, int value) {
        this.question = question;
        this.answerChoiceOne = answerChoiceOne;
        this.answerChoiceTwo = answerChoiceTwo;
        this.answerChoiceThree = answerChoiceThree;
        this.answerChoiceFour = answerChoiceFour;
        this.answer = answer;
        this.value = value;
    }

    public String toString(){
        String str = "";
        str += question + " (" + value + ")\n";
        str += "a)" + answerChoiceOne + "\n" + "b)" + answerChoiceTwo + "\n" + "c)" + answerChoiceThree + "\n" + "d)" + answerChoiceFour + "\n";
        str += "Answer: ";


        return str;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerChoiceOne() {
        return answerChoiceOne;
    }

    public void setAnswerChoiceOne(String answerChoiceOne) {
        this.answerChoiceOne = answerChoiceOne;
    }

    public String getAnswerChoiceTwo() {
        return answerChoiceTwo;
    }

    public void setAnswerChoiceTwo(String answerChoiceTwo) {
        this.answerChoiceTwo = answerChoiceTwo;
    }

    public String getAnswerChoiceThree() {
        return answerChoiceThree;
    }

    public void setAnswerChoiceThree(String answerChoiceThree) {
        this.answerChoiceThree = answerChoiceThree;
    }

    public String getAnswerChoiceFour() {
        return answerChoiceFour;
    }

    public void setAnswerChoiceFour(String answerChoiceFour) {
        this.answerChoiceFour = answerChoiceFour;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
