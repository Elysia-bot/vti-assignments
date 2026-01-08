package DTN2508.com.vti.entity;

import DTN2508.com.vti.frontend.ScannerUtils;

import java.util.ArrayList;
import java.util.Date;

public class Group {
    private static int counter = 0;
    private int groupID;
    private String name;
    private Accounts creatorID;
    private Date createDate;
    private ArrayList<Accounts> accounts = new ArrayList<>();

    /*Question 3:
    Tạo constructor cho Group:
    a) Không có parameters
    b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
    c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
    Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin còn lại = null).
    Khởi tạo 1 Object với mỗi constructor ở trên.*/

    public Group() {
        this.groupID = ++counter;
        System.out.print("Nhập tên group: ");
        this.name = ScannerUtils.inputString();

        System.out.print("Có muốn thêm account không (Y/N): ");
        if (ScannerUtils.inputString().equalsIgnoreCase("Y")) {
            this.accounts.set(0, new Accounts());
        }
    }

    public Group(String name, Accounts creatorID, ArrayList<Accounts> accounts, Date createDate) {
        this.groupID = ++counter;
        this.creatorID = creatorID;
        this.accounts = accounts;
        this.createDate = createDate;
        this.name = name;
    }
    public Group(String name, Accounts creatorID, String[] userNames, Date createDate) {
        this.groupID = ++counter;
        this.creatorID = creatorID;
        this.createDate = createDate;
        this.name = name;
        accounts = new ArrayList<>();
        for (String username : userNames) {
            accounts.add(new Accounts(username));
        }
    }
    public int getGroupID() {
        return groupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Accounts getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(Accounts creatorID) {
        this.creatorID = creatorID;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public ArrayList<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Accounts> accounts) {
        this.accounts = accounts;
    }
}