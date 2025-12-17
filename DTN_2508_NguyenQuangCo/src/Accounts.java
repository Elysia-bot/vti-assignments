import java.util.Date;

public class Accounts {
    static int counter = 0;
    int accountID;
    String email;
    String userName;
    String fullName;
    int departmentID;
    int positionID;
    Date createDate;
    //trying to make constructor
    /*public Accounts(String email, String userName, String fullName, int department, int position, Date createDate) {
        this.id = ++counter;
        this.email = email;
        this.userName = userName;
        this.userName = userName;
    }*/
    public Accounts(){
        this.accountID = ++counter;
    }
}
