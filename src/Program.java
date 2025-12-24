import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import static java.time.LocalTime.now;

public class Program {
    /*Question 7:
        Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
        chuẩn hóa họ và tên của họ như sau:
        a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
        VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn nam"
        b) Viết hoa chữ cái mỗi từ của người dùng
        VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"*/
    static String chuanHoaName(String name) {
        name = name.trim().replaceAll("\\s+", " ");
        return chuanHoaTen(name);
    }

    /*Question 6:
        Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ
        tách ra họ, tên , tên đệm
        VD:
        Người dùng nhập vào "Nguyễn Văn Nam"
        Hệ thống sẽ in ra
        "Họ là: Nguyễn"
        "Tên đệm là: Văn"
        "Tên là: Nam"*/
    static void tachHoten(String hoTen) {
        hoTen = hoTen.trim().replaceAll("\\s+", " ");

        String[] parts = hoTen.split(" ");

        String ho = parts[0];
        String ten = parts[parts.length - 1];

        String dem = "";
        if (parts.length > 2) {
            for (int i = 1; i < parts.length - 1; i++) {
                dem += parts[i] + " ";
            }
            dem = dem.trim();
        }

        System.out.printf(
                "Họ là: %s%nTên đệm là: %s%nTên là: %s%n",
                ho, dem, ten
        );
    }

    /*Question 5:
        Viết chương trình để người dùng nhập vào họ, sau đó yêu
        cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ.*/
    static void printHoTen(String ho, String ten) {
        System.out.printf("Tên vừa nhập là: %s %s%n", ho, ten);
    }
            /*Question 4:
        Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
        VD:
        Người dùng nhập vào "Nam", hệ thống sẽ in ra
        "Ký tự thứ 1 là: N"
        "Ký tự thứ 1 là: A"
        "Ký tự thứ 1 là: M"*/

    static void spellName(String name) {
        for (int i = 0; i < name.length(); i++)
            System.out.printf("Kí tự thứ %d là: %s%n", i, name.charAt(i));
    }

    /*Question 3:
        Viết chương trình để người dùng nhập vào tên và kiểm tra,
        nếu tên chữ viết hoa chữ cái đầu thì viết hoa lên.*/
    static String chuanHoaTen(String name) {
        if (name == null || name.length() == 0) {
            return name;
        }


        if (name.charAt(0) >= 'a' && name.charAt(0) <= 'z') {
            name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        }


        for (int i = 0; i < name.length() - 1; i++) {
            if (name.charAt(i) == ' ' && name.charAt(i + 1) >= 'a' && name.charAt(i + 1) <= 'z') {

                name = name.substring(0, i + 1)
                        + Character.toUpperCase(name.charAt(i + 1))
                        + name.substring(i + 2);
            }
        }

        return name;
    }

    /*Question 2:
        Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;*/
    static String noiChuoi(String s1, String s2) {
        String res = s1.concat(s2);
        return res;
    }

    /*Question 1:
        Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó
                (các từ có thể cách nhau bằng nhiều khoảng trắng );*/
    static int countWord(String str) {

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
                counter++;
        }
        return 1 + counter;

    }

    /*Question 4:
    Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng.*/
    static double thuong2So(int a, int b) {
        return a * 1.0 / b;
    }

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
            case 1:
                acc.position.name = positionName.Dev;
                break;
            case 2:
                acc.position.name = positionName.Test;
                break;
            case 3:
                acc.position.name = positionName.ScrumMaster;
                break;
            case 4:
                acc.position.name = positionName.PM;
                break;
            default:
                acc.position.name = positionName.Dev;
                break;
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
        Khai báo 2 số lương có kiểu dữ liệu là float.
        Khởi tạo Lương của Account 1 là 5240.5 $
        Khởi tạo Lương của Account 2 là 10970.055$
        Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
        Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra*/
        float salaryAccount1 = 5240.5f;
        float salaryAccount2 = 10970.055f;
        int roundSalAcc1 = (int) salaryAccount1;
        int roundSalAcc2 = (int) salaryAccount2;
        System.out.printf("Lương của account 1 là: %d%n", roundSalAcc1);
        System.out.printf("Lương của account 2 là: %d%n", roundSalAcc2);

        /*Question 2:
        Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5
        chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)*/
        Random random = new Random();
        int number5 = random.nextInt(100000);
        String result = String.format("%05d", number5);
        System.out.printf("Số ngẫu nhiên 5 chữ số là: %s%n", result);

        /*Question 3:
        Lấy 2 số cuối của số ở Question 2 và in ra.
        Gợi ý:
        Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
        Cách 2: chia lấy dư số đó cho 100*/
        int newNum5 = Integer.valueOf(result);
        newNum5 = newNum5 % 100;
        System.out.printf("2 số cuối của số ngẫu nhiên trên là: %d%n", newNum5);

        /*Question 1:
        Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5 phần
        tử theo cú pháp (sử dụng vòng for để khởi tạo):
        ∙ Email: "Email 1"
        ∙ Username: "User name 1"
        ∙ FullName: "Full name 1"*/

        Accounts[] accountsList = new Accounts[10];
        for (int i = 0; i < 5; i++) {
            accountsList[i] = new Accounts();
            accountsList[i].email = "Email " + (i + 1);
            accountsList[i].userName = "User name " + (i + 1);
            accountsList[i].fullName = "Full name " + (i + 1);
            accountsList[i].createDate = new Date();
        }

        /*Question 1:
        Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
        Sau đó convert lương ra float và hiển thị lương lên màn hình
        (với số float có 2 số sau dấu thập phân).*/
        Integer salary = Integer.valueOf(5000);
        System.out.println(salary);
        float luong = (float) salary;
        System.out.printf("Lương là: %.2f%n", luong);

        /*Question 2:
        Khai báo 1 String có value = "1234567"
        Hãy convert String đó ra số int*/
        String val = "1234567";
        int valOfStr = Integer.parseInt(val);

        /*Question 3:
        Khởi tạo 1 số Integer có value là chữ "1234567"
        Sau đó convert số trên thành datatype int*/
        Integer integer = Integer.valueOf(1234567);
        int intInteger = integer;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập String: ");
        String str = sc.nextLine();
        System.out.printf("Số từ trong string vừa nhập là: %d%n", countWord(str));

        /*Question 2:
        Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;*/
        System.out.println("Nhập s1: ");
        String s1 = sc.nextLine();
        System.out.println("Nhập s2: ");
        String s2 = sc.nextLine();
        System.out.println("String được nối là: ");
        System.out.println(noiChuoi(s1, s2));

        /*Question 3:
        Viết chương trình để người dùng nhập vào tên và kiểm tra,
        nếu tên chữ viết hoa chữ cái đầu thì viết hoa lên.*/
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println(chuanHoaTen(name));

        /*Question 4:
        Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
        VD:
        Người dùng nhập vào "Nam", hệ thống sẽ in ra
        "Ký tự thứ 1 là: N"
        "Ký tự thứ 1 là: A"
        "Ký tự thứ 1 là: M"*/
        System.out.println("Nhập tên: ");
        String name1 = sc.nextLine();
        spellName(name1);

        /*Question 5:
        Viết chương trình để người dùng nhập vào họ, sau đó yêu
        cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ.*/
        System.out.println("Nhập họ: ");
        String ho = sc.nextLine();
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        printHoTen(ho, ten);

        /*Question 6:
        Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ
        tách ra họ, tên , tên đệm
        VD:
        Người dùng nhập vào "Nguyễn Văn Nam"
        Hệ thống sẽ in ra
        "Họ là: Nguyễn"
        "Tên đệm là: Văn"
        "Tên là: Nam"*/
        System.out.println("Nhập đầy đủ họ và tên: ");
        String hoVaTen = sc.nextLine();
        tachHoten(hoVaTen);

        /*Question 7:
        Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
        chuẩn hóa họ và tên của họ như sau:
        a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
        VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn nam"
        b) Viết hoa chữ cái mỗi từ của người dùng
        VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"*/

        System.out.println("Nhập tên cần chuẩn hóa: ");
        String name2 = sc.nextLine();
        System.out.printf("Tên sau khi chuẩn hóa: %s%n", chuanHoaName(name2));

        /*Question 8:
        In ra tất cả các group có chứa chữ "Java"*/
        Group[] groupsD = {group1, group2, group3};
        for (int i = 0; i < groupsD.length; i++) {
            if (groupsD[i].name.contains("Java"))
                System.out.println(groupsD[i].name);
        }

        /*Question 9:
        In ra tất cả các group "Java"*/
        Group[] groupsXD = {group1, group2, group3};
        for (int i = 0; i < groupsXD.length; i++) {
            if (groupsXD[i].name.equals("Java"))
                System.out.println(groupsXD[i].name);
        }
        /*Question 10:
        Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.*/
        System.out.print("Nhập chuỗi 1: ");
        String s11 = sc.nextLine();
        System.out.print("Nhập chuỗi 2: ");
        String s22 = sc.nextLine();

        boolean isReverse = true;

        if (s11.length() != s22.length()) {
            isReverse = false;
        } else {
            for (int i = 0; i < s11.length(); i++) {
                if (s11.charAt(i) != s22.charAt(s22.length() - 1 - i)) {
                    isReverse = false;
                    break;
                }
            }
        }

        if (isReverse) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
        /*Question 11: Count special Character
        Tìm số lần xuất hiện ký tự "a" trong chuỗi*/
        System.out.println("Nhập chuỗi cần đếm: ");
        String countA = sc.nextLine();
        int counterOfA = 0;
        for(int i = 0; i < countA.length(); i++ ){
            if(countA.charAt(i) == 'a')
                counterOfA++;
        }
        System.out.printf("Số kí tự a trong chuỗi vừa nhập là: %s%n", counterOfA);

        /*Question 12: Reverse String
        Đảo ngược chuỗi sử dụng vòng lặp*/
        System.out.println("Nhập chuỗi cần đảo: ");
        String revStr = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

        /*Question 13:
        String not contains digit
        Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
                Ví dụ:
        "abc" => true
        "1abc", "abc1", "123", "a1bc", null => false*/
        System.out.println("Nhap string can xet co chu so khong: ");
        String containDigit = sc.nextLine();
        boolean containNum = true;
        for(int i = 0; i< containDigit.length(); i++)
            if(containDigit.charAt(i) >= '0' || containDigit.charAt(i) <= '9')
                containNum =false;
        System.out.println(containNum);

        /*Question 14: Replace character
        Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
                Ví dụ:
        "VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"*/
        System.out.println("Nhap string goc: ");
        String repChar = sc.nextLine();
        repChar = repChar.replace("a", "o");
        System.out.println(repChar);

        /*Question 15: Revert string by word
        Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
                Ví dụ: " I am developer " => "developer am I".
                Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
        Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt chuỗi theo dấu cách*/
        System.out.println("nhap str can reverse: ");
        String revWord = sc.nextLine();
        revWord = revWord.trim();

        String[] words = new String[50];
        int count = 0;
        String temp = "";

        for (int i = 0; i < revWord.length(); i++) {
            if (revWord.charAt(i) != ' ') {
                temp += revWord.charAt(i);
            } else {
                words[count++] = temp;
                temp = "";
            }
        }
        words[count++] = temp;
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) System.out.print(" ");
        }


        /*Question 16:
        Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần bằng nhau với n
        ký tự. Nếu chuỗi không chia được thì xuất ra màn hình “KO”.*/
        String str16 = "abcdefgh";
        int n = 2;

        if (str16.length() % n != 0) {
            System.out.println("KO");
            return;
        }

        for (int i = 0; i < str16.length(); i += n) {
            for (int j = i; j < i + n; j++) {
                System.out.print(str16.charAt(j));
            }
            System.out.println();
        }

        /*Question 1:
        In ra thông tin của phòng ban thứ 1 (sử dụng toString())*/
        Department[] departments = {dep1, dep2, dep3};
        System.out.println(departments[0].toString());



        /*Question 2:
        In ra thông tin của tất cả phòng ban (sử dụng toString())*/
        for (Department d : departments) {
            System.out.println(d);
        }



       /* Question 3:
        In ra địa chỉ của phòng ban thứ 1*/
        System.out.println(departments[0]);



        /*Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?*/
        if (departments[0].name.equals("Phòng A")) {
            System.out.println("Có tên là Phòng A");
        } else {
            System.out.println("Không phải Phòng A");
        }



        /*Question 5:
        So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không
                (bằng nhau khi tên của 2 phòng ban đó bằng nhau)*/
        if (departments[0].equals(departments[1])) {
            System.out.println("Hai phòng ban bằng nhau");
        } else {
            System.out.println("Hai phòng ban không bằng nhau");
        }



        /*Question 6:
        Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
        VD:
        Accounting
        Boss of director
                Marketing
        Sale
        Waiting room*/
        for (int i = 0; i < departments.length - 1; i++) {
            for (int j = i + 1; j < departments.length; j++) {
                if (departments[i].name.compareTo(departments[j].name) > 0) {
                    Department tmp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = tmp;
                }
            }
        }

        for (Department d : departments) {
            System.out.println(d.name);
        }



        /*Question 7:
        Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra dan sách phòng ban được sắp xếp theo tên
        VD:
        Accounting
        Boss of director
                Marketing
        waiting room
        Sale*/
        for (int i = 0; i < departments.length - 1; i++) {
            for (int j = i + 1; j < departments.length; j++) {
                if (departments[i].name.compareToIgnoreCase(departments[j].name) > 0) {
                    Department tmp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = tmp;
                }
            }
        }

        for (Department d : departments) {
            System.out.println(d.name);
        }

    }

}



