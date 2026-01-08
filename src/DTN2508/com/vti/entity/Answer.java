package DTN2508.com.vti.entity;

public class Answer {
    private static int counter = 0;
    private int answerID;
    private String content;
    private Question questionID;
    private boolean isCorrect;
    public Answer() {
        this.answerID = ++counter;
    }
    public int getAnswerID() {
        return answerID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Question getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Question questionID) {
        this.questionID = questionID;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
}
