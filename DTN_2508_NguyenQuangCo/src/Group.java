import java.util.Date;

public class Group {
    static int counter = 0;
    int id;
    String name;
    int creatorID;
    Date createDate;
    public Group() {
        this.id = ++counter;
    }
}
