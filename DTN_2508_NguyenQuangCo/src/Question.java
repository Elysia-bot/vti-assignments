import java.util.Date;

public class Question {
    static int counter = 0;
    int questionID;
    String content;
    int categoryID;
    int typeID;
    int creatorID;
    Date createDate;
    public Question() {
        this.questionID = ++counter;
    }

}
