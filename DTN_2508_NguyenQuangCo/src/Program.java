import java.util.Date;

public class Program {
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
        // ===== TABLE 1: Department =====
        Department d1 = new Department();
        d1.name = "Sale";

        Department d2 = new Department();
        d2.name = "Marketing";

        Department d3 = new Department();
        d3.name = "IT";

        // ===== TABLE 2: Position =====
        Position p1 = new Position();
        p1.name = positionName.PM;

        Position p2 = new Position();
        p2.name = positionName.Dev;

        Position p3 = new Position();
        p3.name = positionName.PM;

        // ===== TABLE 3: Account =====
        Accounts a1 = new Accounts();
        a1.email = "a@gmail.com";
        a1.userName = "user1";
        a1.fullName = "Nguyen Van A";
        a1.departmentID = d1.id;
        a1.positionID = p1.id;
        a1.createDate = new Date();

        Accounts a2 = new Accounts();
        a2.email = "b@gmail.com";
        a2.userName = "user2";
        a2.fullName = "Tran Thi B";
        a2.departmentID = d2.id;
        a2.positionID = p2.id;
        a2.createDate = new Date();

        Accounts a3 = new Accounts();
        a3.email = "c@gmail.com";
        a3.userName = "user3";
        a3.fullName = "Le Van C";
        a3.departmentID = d3.id;
        a3.positionID = p3.id;
        a3.createDate = new Date();

        // ===== TABLE 4: Group =====
        Group g1 = new Group();
        g1.name = "Java Fresher";
        g1.creatorID = a1.accountID;
        g1.createDate = new Date();

        Group g2 = new Group();
        g2.name = "Backend Team";
        g2.creatorID = a2.accountID;
        g2.createDate = new Date();

        Group g3 = new Group();
        g3.name = "Testing Group";
        g3.creatorID = a3.accountID;
        g3.createDate = new Date();

        // ===== TABLE 5: GroupAccount =====
        GroupAccount ga1 = new GroupAccount();
        ga1.groupID = g1.id;
        ga1.accountID = a1.accountID;
        ga1.joinDate = new Date();

        GroupAccount ga2 = new GroupAccount();
        ga2.groupID = g1.id;
        ga2.accountID = a2.accountID;
        ga2.joinDate = new Date();

        GroupAccount ga3 = new GroupAccount();
        ga3.groupID = g2.id;
        ga3.accountID = a3.accountID;
        ga3.joinDate = new Date();

        // ===== TABLE 6: TypeQuestion =====
        TypeQuestion tq1 = new TypeQuestion();
        tq1.typeName = typeName.Essay;

        TypeQuestion tq2 = new TypeQuestion();
        tq2.typeName = typeName.MultipleChoice;

        TypeQuestion tq3 = new TypeQuestion();
        tq3.typeName = typeName.MultipleChoice;

        // ===== TABLE 7: CategoryQuestion =====
        CategoryQuestion cq1 = new CategoryQuestion();
        cq1.categoryName = "Java";

        CategoryQuestion cq2 = new CategoryQuestion();
        cq2.categoryName = "SQL";

        CategoryQuestion cq3 = new CategoryQuestion();
        cq3.categoryName = ".NET";

        // ===== TABLE 8: Question =====
        Question q1 = new Question();
        q1.content = "Java là gì?";
        q1.categoryID = cq1.categoryID;
        q1.typeID = tq1.typeID;
        q1.creatorID = a1.accountID;
        q1.createDate = new Date();

        Question q2 = new Question();
        q2.content = "SELECT dùng để làm gì?";
        q2.categoryID = cq2.categoryID;
        q2.typeID = tq2.typeID;
        q2.creatorID = a2.accountID;
        q2.createDate = new Date();

        Question q3 = new Question();
        q3.content = ".NET do hãng nào phát triển?";
        q3.categoryID = cq3.categoryID;
        q3.typeID = tq2.typeID;
        q3.creatorID = a3.accountID;
        q3.createDate = new Date();

        // ===== TABLE 9: Answer =====
        Answer ans1 = new Answer();
        ans1.content = "Ngôn ngữ lập trình";
        ans1.questionID = q1.questionID;
        ans1.isCorrect = true;

        Answer ans2 = new Answer();
        ans2.content = "Hệ điều hành";
        ans2.questionID = q1.questionID;
        ans2.isCorrect = false;

        Answer ans3 = new Answer();
        ans3.content = "Microsoft";
        ans3.questionID = q3.questionID;
        ans3.isCorrect = true;

        // ===== TABLE 10: Exam =====
        Exam e1 = new Exam();
        e1.code = "EX001";
        e1.title = "Java Basic Test";
        e1.categoryID = cq1.categoryID;
        e1.duration = 60;
        e1.creatorID = a1.accountID;
        e1.createDate = new Date();

        Exam e2 = new Exam();
        e2.code = "EX002";
        e2.title = "SQL Fundamental";
        e2.categoryID = cq2.categoryID;
        e2.duration = 45;
        e2.creatorID = a2.accountID;
        e2.createDate = new Date();

        Exam e3 = new Exam();
        e3.code = "EX003";
        e3.title = ".NET Core Exam";
        e3.categoryID = cq3.categoryID;
        e3.duration = 90;
        e3.creatorID = a3.accountID;
        e3.createDate = new Date();

        // ===== TABLE 11: ExamQuestion =====
        ExamQuestion eq1 = new ExamQuestion();
        eq1.examID = e1.examID;
        eq1.questionID = q1.questionID;

        ExamQuestion eq2 = new ExamQuestion();
        eq2.examID = e1.examID;
        eq2.questionID = q2.questionID;

        ExamQuestion eq3 = new ExamQuestion();
        eq3.examID = e2.examID;
        eq3.questionID = q2.questionID;

        System.out.println("id of department 1: "+ d1.id);
        System.out.println("name of 1st user: " +a1);
        System.out.println("1st position: " + p1.name);
        System.out.println("1st group name: " + g1.name);
        System.out.println("group account id: " + ga1.accountID);
        System.out.println("1st type question: " + tq1.typeName);
        System.out.println("1st category question: " + cq1.categoryName);
        System.out.println("1st question: " + q1.content);
        System.out.println("1st answer: " + ans1.content);
        System.out.println("1st exam code: " + e1.code);
        System.out.println("1st exam question id: " + eq1.examID);
    }
}
