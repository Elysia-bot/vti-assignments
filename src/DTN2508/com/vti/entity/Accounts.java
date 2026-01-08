package DTN2508.com.vti.entity;

import DTN2508.com.vti.frontend.ScannerUtils;

import java.util.Date;

public class Accounts {
    private static int counter = 0;
    private int accountID;
    private String email;
    private String userName;
    private String fullName;
    private Department department;
    private Position position;
    private Date createDate;
    //trying to make constructor
    /*public DTN2508.entity.Accounts(String email, String userName, String fullName, int department, int position, Date createDate) {
        this.id = ++counter;
        this.email = email;
        this.userName = userName;
        this.userName = userName;
    }*/
    /*Question 2:
    Tạo constructor cho Account:
    a) Không có parameters
    b) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)
    c) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và Position của User, default createDate = now
    d) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và Position của User, createDate.
    Khởi tạo 1 Object với mỗi constructor ở trên.*/



    public Accounts(){

        this.accountID = ++counter;
    }
    public  Accounts(int accountID, String email, String userName, String firstName, String lastName) {
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName + lastName;

    }
    public  Accounts(int accountID, String email, String userName, String firstName, String lastName, Position position) {
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName + lastName;
        this.position = position;
        this.createDate = new Date();
    }
    public  Accounts(int accountID, String email, String userName, String firstName, String lastName, Position position, Date createDate) {
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName + lastName;
        this.position = position;
        this.createDate = createDate;
    }
    public Accounts(String name){
        this.userName = name;
    }
    /*@Override
    public String toString() {
        return "Email: " + email +
                ", FullName: " + fullName +
                ", DTN2508.entity.Department: " + department.name;
    }*/

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
    public int getId() {
        return accountID;
    }

    public void setId(int id) {
        this.accountID = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getFullName() {
        return fullName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public static int inputAge() throws InvalidAgeInputingException {
        int age = ScannerUtils.inputInt("Tuổi phải là số!");
        if (age <= 0) {
            throw new InvalidAgeInputingException("The age must be greater than 0");
        }
        return age;
    }

    public int inputAccountAge() {
        while (true) {
            try {
                int age = inputAge();
                if (age < 18) {
                    System.out.println("Your age must be greater than 18");
                } else {
                    return age;
                }
            } catch (InvalidAgeInputingException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}