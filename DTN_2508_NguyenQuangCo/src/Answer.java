public class Answer {
    static int counter = 0;
    int answerID;
    String content;
    Question questionID;
    boolean isCorrect;
    public Answer() {
        this.answerID = ++counter;
    }
}
