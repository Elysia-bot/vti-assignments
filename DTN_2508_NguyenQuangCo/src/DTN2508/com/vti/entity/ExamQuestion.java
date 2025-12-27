package DTN2508.com.vti.entity;

public class ExamQuestion {
    private int examID;
    private Question questionID;
    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public Question getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Question questionID) {
        this.questionID = questionID;
    }
}
