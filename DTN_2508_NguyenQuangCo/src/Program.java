import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Program {
    /*Exercise 6: Method
        Question 1:
        Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10*/
    static void printEvenLessThan10() {
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
    }
    /*Question 5:
        Viết lệnh cho phép người dùng tạo account (viết thành method)
        Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
        chương trình sẽ chuyển thành Position.Dev, Position.Test, Position.ScrumMaster, Position.PM.*/
    static Accounts createAccount(Scanner sc) {
        Accounts acc = new Accounts();

        System.out.print("Nhập username: ");
        acc.userName = sc.nextLine();

        System.out.print("Nhập full name: ");
        acc.fullName = sc.nextLine();

        System.out.println("Chọn position: 1.Dev 2.Test 3.ScrumMaster 4.PM");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1: acc.position.name = positionName.Dev; break;
            case 2: acc.position.name = positionName.Test; break;
            case 3: acc.position.name = positionName.ScrumMaster; break;
            case 4: acc.position.name = positionName.PM; break;
            default: acc.position.name = positionName.Dev;
        }

        return acc;
    }
    /*Question 6:
        Viết lệnh cho phép người dùng tạo department (viết thành method)*/
    static Department createDepartment(Scanner sc) {
        Department dep = new Department();
        System.out.print("Nhập tên department: ");
        dep.name = sc.nextLine();
        return dep;
    }
    /*Question 2:
        Tạo method để in thông tin các account*/
    static void printAccounts(ArrayList<Accounts> accounts) {
        for (Accounts a : accounts) {
            System.out.println(a.userName + " - " + a.fullName);
        }
    }
    /*Question 11: Tiếp tục Question 10
        Bổ sung thêm vào bước 2 của Question 8 như sau:
        Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
        Bước 1: In ra tên các usernames của user cho người dùng xem
        Bước 2: Yêu cầu người dùng nhập vào username của account
        Bước 3: Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
        Bước 4: Thêm account vào group chương trình vừa chọn ngẫu nhiên*/
    static void addRandomGroup(
            ArrayList<Accounts> accounts,
            ArrayList<Group> groups,
            Scanner sc) {

        System.out.println("Danh sách username:");
        for (Accounts a : accounts) {
            System.out.println(a.userName);
        }

        System.out.print("Nhập username: ");
        String name = sc.nextLine();

        Accounts acc = null;
        for (Accounts a : accounts) {
            if (a.userName.equals(name)) {
                acc = a;
                break;
            }
        }

        Random rd = new Random();
        Group randomGroup = groups.get(rd.nextInt(groups.size()));
        randomGroup.accounts.add(acc);

        System.out.println("Đã thêm vào group: " + randomGroup.name);
    }
    /*Question 3:
        Tạo method để in ra các số nguyên dương nhỏ hơn 10*/
    static void printPositiveLessThan10() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
    /*Question 9:
        Viết method cho phép người dùng thêm group vào account theo flow sau:
        Bước 1: In ra tên các usernames của user cho người dùng xem
        Bước 2: Yêu cầu người dùng nhập vào username của account
        Bước 3: In ra tên các group cho người dùng xem
        Bước 4: Yêu cầu người dùng nhập vào tên của group
        Bước 5: Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account        vào group đó .*/
    static void addAccountToGroup(
            ArrayList<Accounts> accounts,
            ArrayList<Group> groups,
            Scanner sc) {

        System.out.println("Danh sách username:");
        for (Accounts a : accounts) {
            System.out.println(a.userName);
        }

        System.out.print("Nhập username: ");
        String userInput = sc.nextLine();

        Accounts selectedAcc = null;
        for (Accounts a : accounts) {
            if (a.userName.equals(userInput)) {
                selectedAcc = a;
                break;
            }
        }

        System.out.println("Danh sách group:");
        for (Group g : groups) {
            System.out.println(g.name);
        }

        System.out.print("Nhập tên group: ");
        String groupName = sc.nextLine();

        for (Group g : groups) {
            if (g.name.equals(groupName)) {
                g.accounts.add(selectedAcc);
                System.out.println("Thêm thành công!");
                break;
            }
        }

    }
   /* public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
*/

    public static void main(String[] args) {
        ArrayList<Accounts> accounts = new ArrayList<>();
        ArrayList<Group> groups = new ArrayList<>();
        // ===== Table Department =====
        Department dep1 = new Department();
        dep1.name = "Sale";

        Department dep2 = new Department();
        dep2.name = "Marketing";

        Department dep3 = new Department();
        dep3.name = "IT";

        // ===== Table Position =====
        Position pos1 = new Position();
        pos1.name = positionName.Dev;

        Position pos2 = new Position();
        pos2.name = positionName.Test;

        Position pos3 = new Position();
        pos3.name = positionName.PM;

        // ===== Table Account =====
        Accounts acc1 = new Accounts();
        acc1.email = "a@gmail.com";
        acc1.userName = "userA";
        acc1.fullName = "Nguyen Van A";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = new Date();

        Accounts acc2 = new Accounts();
        acc2.email = "b@gmail.com";
        acc2.userName = "userB";
        acc2.fullName = "Nguyen Van B";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = new Date();

        Accounts acc3 = new Accounts();
        acc3.email = "c@gmail.com";
        acc3.userName = "userC";
        acc3.fullName = "Nguyen Van C";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = new Date();

        // ===== Table Group =====
        Group group1 = new Group();
        group1.name = "Java Fresher";
        group1.creatorID = acc1;
        group1.createDate = new Date();

        Group group2 = new Group();
        group2.name = "Backend Team";
        group2.creatorID = acc2;
        group2.createDate = new Date();

        Group group3 = new Group();
        group3.name = "Testing Team";
        group3.creatorID = acc3;
        group3.createDate = new Date();

        // ===== Table GroupAccount =====
        GroupAccount ga1 = new GroupAccount();
        ga1.groupID = group1.groupID;
        ga1.account = acc1;
        ga1.joinDate = new Date();

        GroupAccount ga2 = new GroupAccount();
        ga2.groupID = group1.groupID;
        ga2.account = acc2;
        ga2.joinDate = new Date();

        GroupAccount ga3 = new GroupAccount();
        ga3.groupID = group2.groupID;
        ga3.account = acc3;
        ga3.joinDate = new Date();

        // ===== Table TypeQuestion =====
        TypeQuestion tq1 = new TypeQuestion();
        tq1.typeName = typeName.Essay;

        TypeQuestion tq2 = new TypeQuestion();
        tq2.typeName = typeName.MultipleChoice;

        TypeQuestion tq3 = new TypeQuestion();
        tq3.typeName = typeName.Essay;

        // ===== Table CategoryQuestion =====
        CategoryQuestion cq1 = new CategoryQuestion();
        cq1.categoryName = "Java";

        CategoryQuestion cq2 = new CategoryQuestion();
        cq2.categoryName = "SQL";

        CategoryQuestion cq3 = new CategoryQuestion();
        cq3.categoryName = "Postman";

        // ===== Table Question =====
        Question q1 = new Question();
        q1.content = "Java là gì?";
        q1.category = cq1;
        q1.type = tq1;
        q1.creator = acc1;
        q1.createDate = new Date();

        Question q2 = new Question();
        q2.content = "Primary key là gì?";
        q2.category = cq2;
        q2.type = tq1;
        q2.creator = acc2;
        q2.createDate = new Date();

        Question q3 = new Question();
        q3.content = "Postman dùng để làm gì?";
        q3.category = cq3;
        q3.type = tq2;
        q3.creator = acc3;
        q3.createDate = new Date();

        // ===== Table Answer =====
        Answer ans1 = new Answer();
        ans1.content = "Java là ngôn ngữ lập trình";
        ans1.questionID = q1;
        ans1.isCorrect = true;

        Answer ans2 = new Answer();
        ans2.content = "Primary key là khóa chính";
        ans2.questionID = q2;
        ans2.isCorrect = true;

        Answer ans3 = new Answer();
        ans3.content = "Postman dùng để test API";
        ans3.questionID = q3;
        ans3.isCorrect = true;

        // ===== Table Exam =====
        Exam exam1 = new Exam();
        exam1.code = "EX001";
        exam1.title = "Java Basic";
        exam1.categoryID = cq1;
        exam1.duration = 60;
        exam1.creatorID = acc1;
        exam1.createDate = new Date();

        Exam exam2 = new Exam();
        exam2.code = "EX002";
        exam2.title = "SQL Basic";
        exam2.categoryID = cq2;
        exam2.duration = 45;
        exam2.creatorID = acc2;
        exam2.createDate = new Date();

        Exam exam3 = new Exam();
        exam3.code = "EX003";
        exam3.title = "Postman Test";
        exam3.categoryID = cq3;
        exam3.duration = 30;
        exam3.creatorID = acc3;
        exam3.createDate = new Date();

        // ===== Table ExamQuestion =====
        ExamQuestion eq1 = new ExamQuestion();
        eq1.examID = exam1.examID;
        eq1.questionID = q1;

        ExamQuestion eq2 = new ExamQuestion();
        eq2.examID = exam2.examID;
        eq2.questionID = q2;

        ExamQuestion eq3 = new ExamQuestion();
        eq3.examID = exam3.examID;
        eq3.questionID = q3;


        /*Question 1:
        Kiểm tra account thứ 2
        Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
        Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"*/
        if (acc2.department == null)
            System.out.println("Nhân viên này chưa có phòng ban");
        else
            System.out.println("Phòng ban của nhân viên này là: " + acc2.department.id);

        /*Question 2:
        Kiểm tra account thứ 2
        Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
        Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
        Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
        Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"*/
        GroupAccount[] groupAccounts = {ga1, ga2, ga3};
        int counter = 0;
        for (int i = 0; i < groupAccounts.length; i++)
            if (groupAccounts[i].account == acc2)
                counter++;
        if (counter == 0)
            System.out.println("Nhân viên này chưa có group");
        else if (counter >= 2)
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        else if (counter == 3)
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        else
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");

        System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là: " + acc2.department.id);

        /*Question 4:
        Sử dụng toán tử ternary để làm yêu cầu sau:
        Kiểm tra Position của account thứ 1
        Nếu Position = Dev thì in ra text "Đây là Developer"
        Nếu không phải thì in ra text "Người này không phải là Developer"*/
        System.out.println(acc1.position.name == positionName.Dev ? "Đây là Developer" : "Người này không phải là Developer");

        GroupAccount[] groupAccountList = {ga1, ga2, ga3};
        int counterAccountInGroup1 = 0;

        for (int i = 0; i < groupAccountList.length; i++)
            if (groupAccountList[i].groupID == group1.groupID && groupAccountList[i].account != null)
                counterAccountInGroup1++;
        switch (counterAccountInGroup1) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }

        /*Question 6:
        Sử dụng switch case để làm lại Question 2*/
        switch (counter) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;

        }

        /*Question 7:
        Sử dụng switch case để làm lại Question 4*/
        switch (acc1.position.name) {
            case Dev:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
        }

        /*Question 8:
        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ*/
        Accounts[] accountsList = {acc1, acc2, acc3};
        for (int i = 0; i < accountsList.length; i++) {
            System.out.printf("nguoi thu: %d %n", i);
            System.out.println(accountsList[i].accountID);
            System.out.println(accountsList[i].fullName);
            System.out.println(accountsList[i].department.name);
            System.out.println(" ");
        }
        Department[] departments = {dep1, dep2, dep3};
        for (int i = 0; i < departments.length; i++) {
            System.out.println(departments[i].id);
            System.out.println(departments[i].name);
            System.out.println(" ");
        }

        /*Question 10:
        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
        họ theo định dạng như sau:
        Thông tin account thứ 1 là:
        Email: NguyenVanA@gmail.com
        Full name: Nguyễn Văn A
        Phòng ban: Sale
        Thông tin account thứ 2 là:
        Email: NguyenVanB@gmail.com
        Full name: Nguyễn Văn B
        Phòng ban: Marketting*/
        for (int i = 0; i < accountsList.length; i++) {
            System.out.printf("Thông tin account thứ %d là:%n", i + 1);
            System.out.printf("Email: %s %n", accountsList[i].email);
            System.out.printf("Full name: %s %n", accountsList[i].fullName);
            System.out.printf("Phòng ban: %s %n%n", accountsList[i].department.name);
        }

        /*Question 11:
        In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
        Thông tin department thứ 1 là:
        Id: 1
        Name: Sale
        Thông tin department thứ 2 là:
        Id: 2
        Name: Marketing*/
        for (int i = 0; i < departments.length; i++) {
            System.out.printf("Thông tin department thứ %d là:%n", i + 1);
            System.out.printf("Id: %d%n", departments[i].id);
            System.out.printf("Name: %s%n%n", departments[i].name);
        }

        /*Question 12:
        Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10*/
        for (int i = 0; i < 2; i++) {
            System.out.printf("Thông tin department thứ %d là:%n", i + 1);
            System.out.printf("Id: %d%n", departments[i].id);
            System.out.printf("Name: %s%n%n", departments[i].name);
        }

        /*Question 13:
        In ra thông tin tất cả các account ngoại trừ account thứ 2*/
        for (int i = 0; i < accountsList.length; i++) {
            if (accountsList[i].accountID == 2)
                continue;
            System.out.printf("Thông tin account thứ %d là:%n", i + 1);
            System.out.printf("Email: %s %n", accountsList[i].email);
            System.out.printf("Full name: %s %n", accountsList[i].fullName);
            System.out.printf("Phòng ban: %s %n%n", accountsList[i].department.name);
        }

        /*Question 14:
        In ra thông tin tất cả các account có id < 4*/
        for (int i = 0; i < accountsList.length; i++) {
            if (accountsList[i].accountID < 4) {
                System.out.printf("Thông tin account thứ %d là:%n", i + 1);
                System.out.printf("Email: %s %n", accountsList[i].email);
                System.out.printf("Full name: %s %n", accountsList[i].fullName);
                System.out.printf("Phòng ban: %s %n%n", accountsList[i].department.name);
            }
        }
        /*Question 15:
        In ra các số chẵn nhỏ hơn hoặc bằng 20*/
        for (int i = 0; i <= 20; i += 2)
            System.out.println(i);
        /*Question 16:
        Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
        lệnh break, continue*/
        int i = 0;
        while (i < accountsList.length) {
            System.out.printf("Thông tin account thứ %d là:%n", i + 1);
            System.out.printf("Email: %s %n", accountsList[i].email);
            System.out.printf("Full name: %s %n", accountsList[i].fullName);
            System.out.printf("Phòng ban: %s %n%n", accountsList[i].department.name);
            i++;
        }
        i = 0;
        while (i < departments.length) {
            System.out.printf("Thông tin department thứ %d là:%n", i + 1);
            System.out.printf("Id: %d%n", departments[i].id);
            System.out.printf("Name: %s%n%n", departments[i].name);
            i++;
        }
        i = 0;
        while (i < 2) {
            System.out.printf("Thông tin department thứ %d là:%n", i + 1);
            System.out.printf("Id: %d%n", departments[i].id);
            System.out.printf("Name: %s%n%n", departments[i].name);
            i++;
        }
        i = 0;
        while (i < accountsList.length) {
            if (accountsList[i].accountID == 2) {
                i++;
                continue;
            }
            System.out.printf("Thông tin account thứ %d là:%n", i + 1);
            System.out.printf("Email: %s %n", accountsList[i].email);
            System.out.printf("Full name: %s %n", accountsList[i].fullName);
            System.out.printf("Phòng ban: %s %n%n", accountsList[i].department.name);
            i++;
        }
        i = 0;
        while (i < accountsList.length) {
            if (accountsList[i].accountID < 4) {
                System.out.printf("Thông tin account thứ %d là:%n", i + 1);
                System.out.printf("Email: %s %n", accountsList[i].email);
                System.out.printf("Full name: %s %n", accountsList[i].fullName);
                System.out.printf("Phòng ban: %s %n%n", accountsList[i].department.name);
            }
            i++;
        }
        i = 0;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
        /*Question 17:
        Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
        lệnh break, continue*/
        i = 0;
        do {
            System.out.printf("Thông tin account thứ %d là:%n", i + 1);
            System.out.printf("Email: %s %n", accountsList[i].email);
            System.out.printf("Full name: %s %n", accountsList[i].fullName);
            System.out.printf("Phòng ban: %s %n%n", accountsList[i].department.name);
            i++;
        } while (i < accountsList.length);

        i = 0;
        do {
            System.out.printf("Thông tin department thứ %d là:%n", i + 1);
            System.out.printf("Id: %d%n", departments[i].id);
            System.out.printf("Name: %s%n%n", departments[i].name);
            i++;
        } while (i < departments.length);

        i = 0;
        do {
            System.out.printf("Thông tin department thứ %d là:%n", i + 1);
            System.out.printf("Id: %d%n", departments[i].id);
            System.out.printf("Name: %s%n%n", departments[i].name);
            i++;
        } while (i < 2);

        i = 0;
        do {
            if (accountsList[i].accountID == 2) {
                i++;
                continue;
            }
            System.out.printf("Thông tin account thứ %d là:%n", i + 1);
            System.out.printf("Email: %s %n", accountsList[i].email);
            System.out.printf("Full name: %s %n", accountsList[i].fullName);
            System.out.printf("Phòng ban: %s %n%n", accountsList[i].department.name);
            i++;
        } while (i < accountsList.length);

        i = 0;
        do {
            if (accountsList[i].accountID < 4) {
                System.out.printf("Thông tin account thứ %d là:%n", i + 1);
                System.out.printf("Email: %s %n", accountsList[i].email);
                System.out.printf("Full name: %s %n", accountsList[i].fullName);
                System.out.printf("Phòng ban: %s %n%n", accountsList[i].department.name);
            }
            i++;
        } while (i < accountsList.length);

        i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 20);

        /*Question 1:
        Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó*/
        int a = 5;
        System.out.printf("%d%n%n", a);

        /*Question 2:
        Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
        ra số nguyên đó thành định dạng như sau: 100,000,000*/

        int b = 100000000;
        System.out.printf("%,d %n", b);

        /*Question 3:
        Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
        thực đó chỉ bao gồm 4 số đằng sau*/
        double c = 5.567098;
        System.out.printf("%.4f %n", c);

        /*Question 4:
        Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
        dạng như sau:
        Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
        Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.*/
        String d = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.%n", d);

        /*Question 5:
        Lấy thời gian bây giờ và in ra theo định dạng sau:
        24/04/2020 11h:16p:20s*/
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");

        System.out.println(now.format(formatter));


        /*Question 6:
        In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
        table (giống trong Database)*/
        System.out.printf(
                "+----------------------+----------------------+--------------------+%n");
        System.out.printf(
                "| Email                | Full Name            | Department         |%n");
        System.out.printf(
                "+----------------------+----------------------+--------------------+%n");

        for (Accounts acc : accountsList) {
            System.out.printf(
                    "| %-20s | %-20s | %-18s |%n",
                    acc.email,
                    acc.fullName,
                    acc.department.name
            );
        }

        System.out.printf(
                "+----------------------+----------------------+--------------------+%n");

        System.out.println(" ");

        /*Question 1:
        In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
        dạng vietnamese*/
        SimpleDateFormat vnFormatter =
                new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Exam ID: " + exam1.examID);
        System.out.println("Title: " + exam1.title);
        System.out.println("Create date: " + vnFormatter.format(exam1.createDate));

        /*Question 2:
        In ra thông tin: Exam đã tạo ngày nào theo định dạng
        Năm – tháng – ngày – giờ – phút – giây*/
        SimpleDateFormat formatter1 =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(
                "Exam đã tạo ngày: " + formatter1.format(exam1.createDate)
        );

        /*Question 3:
        Chỉ in ra năm của create date property trong Question 2*/
        SimpleDateFormat formatter2 =
                new SimpleDateFormat("yyyy");

        System.out.println(
                "Exam đã tạo ngày: " + formatter2.format(exam1.createDate)
        );

        /*Question 4:
        Chỉ in ra tháng và năm của create date property trong Question 2*/
        SimpleDateFormat formatter3 =
                new SimpleDateFormat("yyyy/MM");

        System.out.println(
                "Exam đã tạo ngày: " + formatter3.format(exam1.createDate)
        );
        /*Question 5:
        Chỉ in ra "MM-DD" của create date trong Question 2*/
        SimpleDateFormat formatter4 =
                new SimpleDateFormat("MM-dd");

        System.out.println(
                "Exam đã tạo ngày: " + formatter4.format(exam1.createDate)
        );

        /*Question 1:
        In ngẫu nhiên ra 1 số nguyên*/
        Random random = new Random();
        int ngauNhien = random.nextInt();
        System.out.println(ngauNhien);

        /*Question 2:
        In ngẫu nhiên ra 1 số thực*/
        double ngauNhien1 = random.nextDouble();
        System.out.println(ngauNhien1);

        /*Question 3:
        Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn*/
        String[] names = {"an", "binh", "co"};
        int index = random.nextInt(names.length);
        System.out.println(names[index]);

        /*Question 4:
        Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12- 1995*/
        LocalDate startDate = LocalDate.of(1995, 7, 24);
        LocalDate endDate = LocalDate.of(1995, 12, 20);

        long startEpoch = startDate.toEpochDay();
        long endEpoch = endDate.toEpochDay();


        long randomDay = startEpoch + random.nextInt(
                (int) (endEpoch - startEpoch + 1)
        );

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);

        System.out.println("Ngày ngẫu nhiên: " + randomDate);

        /*Question 5:
        Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây*/
        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today.minusYears(1);

        long startEpoch1 = oneYearAgo.toEpochDay();
        long endEpoch1 = today.toEpochDay();


        long randomDay1 = startEpoch1 + random.nextInt(
                (int) (endEpoch1 - startEpoch1 + 1)
        );

        LocalDate randomDate1 = LocalDate.ofEpochDay(randomDay1);

        System.out.println("Ngày ngẫu nhiên trong 1 năm trở lại đây: " + randomDate1);

        /*Question 6:
        Lấy ngẫu nhiên 1 ngày trong quá khứ.*/
        LocalDate today2 = LocalDate.now();
        LocalDate startDate2 = LocalDate.of(1970, 1, 1);

        long startEpoch2 = startDate2.toEpochDay();
        long endEpoch2 = today2.minusDays(1).toEpochDay();


        long randomDay2 = startEpoch2 + random.nextInt(
                (int) (endEpoch2 - startEpoch2 + 1)
        );

        LocalDate randomDate2 = LocalDate.ofEpochDay(randomDay2);

        System.out.println("Ngày ngẫu nhiên trong quá khứ: " + randomDate2);

        /*Question 7:
        Lấy ngẫu nhiên 1 số có 3 chữ số.*/

        int idk = random.nextInt(999 - 100 + 1) + 100;
        System.out.println(idk);

        /*Question 1:
        Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a0 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b0 = scanner.nextInt();

        System.out.print("Nhập số thứ ba: ");
        int c0 = scanner.nextInt();

        System.out.println("Ba số đã nhập là: " + a + ", " + b + ", " + c);

        /*Question 2:
        Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình.*/

        System.out.print("Nhập số thực thứ nhất: ");
        double a1 = scanner.nextDouble();

        System.out.print("Nhập số thực thứ hai: ");
        double b1 = scanner.nextDouble();

        System.out.println("Hai số thực đã nhập là: " + a1 + " và " + b1);


        /*Question 3:
        Viết lệnh cho phép người dùng nhập họ và tên.*/
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();

        /*Question 4:
        Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ.*/
        System.out.print("Nhập ngày sinh (yyyy-MM-dd): ");
        LocalDate birthday = LocalDate.parse(scanner.nextLine());






        /*Question 7:
        Nhập số chẵn từ console*/
        int n;
        do {
            System.out.print("Nhập số chẵn: ");
            n = scanner.nextInt();
        } while (n % 2 != 0);


        /*Question 10: Tiếp tục Question 8 và Question 9
        Bổ sung thêm vào bước 2 của Question 8 như sau:
        Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
                account
        Bổ sung thêm Bước 3 của Question 8 như sau:
        Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng text để hỏi   người dùng "Bạn có muốn thực hiện chức năng khác không?". Nếu người dùng
         chọn "Có" thì quay lại bước 1, nếu người dùng chọn "Không" thì kết thúc chương trình (sử dụng
         lệnh return để kết thúc chương trình).*/
        while (true) {
            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng:");
            System.out.println("1. Tạo account");
            System.out.println("2. Tạo department");
            System.out.println("3. Thêm account vào group");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                createAccount(scanner);
            } else if (choice == 2) {
                createDepartment(scanner);
            } else if (choice == 3) {
                addAccountToGroup(accounts, groups, scanner);
            } else {
                System.out.println("Mời bạn nhập lại");
                continue;
            }

            System.out.print("Bạn có muốn tiếp tục không (Có/Không): ");
            String cont = scanner.nextLine();
            if (cont.equalsIgnoreCase("Không")) {
                return; // ✅ return CHỈ ĐẶT Ở ĐÂY
            }
        /*Question 8:
        Viết chương trình thực hiện theo flow sau:
        Bước 1:
        Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
        Bước 2:
        Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
        Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
        department
        Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
        lại" và quay trở lại bước 1*/


            while (true) {
                System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
                System.out.println("1. Tạo account");
                System.out.println("2. Tạo department");

                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    createAccount(scanner);
                } else if (choice == 2) {
                    createDepartment(scanner);
                } else {
                    System.out.println("Mời bạn nhập lại");
                    continue;
                }
            }


        }
    }
}

