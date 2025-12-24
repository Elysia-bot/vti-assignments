import java.util.Date;

public class Accounts {
    static int counter = 0;
    int accountID;
    String email;
    String userName;
    String fullName;
    Department department;
    Position position;
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
    @Override
    public String toString() {
        return "Email: " + email +
                ", FullName: " + fullName +
                ", Department: " + department.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Accounts account = (Accounts) obj;
        return this.accountID == account.accountID;
    }

    @Override
    public int hashCode() {
        return accountID;
    }

}
