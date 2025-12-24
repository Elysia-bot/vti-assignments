import java.util.ArrayList;
import java.util.Date;

public class Group {
    static int counter = 0;
    int groupID;
    String name;
    Accounts creatorID;
    Date createDate;
    ArrayList<Accounts> accounts = new ArrayList<>();
    public Group() {
        this.groupID = ++counter;
    }
}
