import java.util.Date;

public class Exam {
    static int counter = 0;
    int examID;
    String code;
    CategoryQuestion categoryID;
    int duration;
    Accounts creatorID;
    String title;
    Date createDate;
    public Exam(){
        this.examID = ++counter;
    }
}
