import java.util.Date;

public class Question {
    static int counter = 0;
    int questionID;
    String content;
    CategoryQuestion category;
    TypeQuestion type;
    Accounts creator;
    Date createDate;
    public Question() {
        this.questionID = ++counter;
    }

}
