public class Answer {
    static int counter = 0;
    int answerID;
    String content;
    int questionID;
    boolean isCorrect;
    public Answer() {
        this.answerID = ++counter;
    }
}
