package DTN2508.exercise1;

import DTN2508.com.vti.entity.Accounts;
import DTN2508.com.vti.entity.Department;
import DTN2508.com.vti.entity.Group;
import DTN2508.com.vti.entity.Position;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department dep1 = new Department();
        Department dep2 = new Department("IT");
        Accounts acc1 = new Accounts();
        Accounts acc2 = new Accounts(
                1,
                "acc2@gmail.com",
                "user2",
                "Nguyen",
                "An"
        );
        Position dev = new Position();
        Accounts acc3 = new Accounts(
                2,
                "acc3@gmail.com",
                "user3",
                "Tran",
                "Binh",
                dev
        );
        Accounts acc4 = new Accounts(
                3,
                "acc4@gmail.com",
                "user4",
                "Le",
                "Minh",
                dev,
                new Date()
        );
        Accounts creator = new Accounts("admin");

        String[] usernames = {"user1", "user2", "user3"};

        Group group = new Group(
                "Java Group",
                creator,
                usernames,
                new Date()
        );

    }
}