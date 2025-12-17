import java.util.Date;

public class Exam {
    static int counter = 0;
    int examID;
    String code;
    int categoryID;
    int duration;
    int creatorID;
    String title;
    Date createDate;
    public Exam(){
        this.examID = ++counter;
    }
}
