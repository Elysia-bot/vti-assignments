package BaiTapNgay8;


import BaiTapNgay8.utils.IOManager;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Student.college = "Đại học bách khoa";

        Student[] students = new Student[3];
        students[0] = new Student(1, "Nguyễn Văn A");
        students[1] = new Student(2, "Nguyễn Văn B");
        students[2] = new Student(3, "Nguyễn Văn C");

        for (Student s : students) {
            s.showInfo();
        }

        System.out.println("---- Đổi trường ----");
        Student.college = "Đại học công nghệ";

        for (Student s : students) {
            s.showInfo();
        }

        Student.moneyGroup = 0;


        Student.moneyGroup += 3 * 100_000;
        System.out.println("Sau B1: " + Student.moneyGroup);


        Student.moneyGroup -= 50_000;
        System.out.println("Sau B2: " + Student.moneyGroup);


        Student.moneyGroup -= 20_000;
        System.out.println("Sau B3: " + Student.moneyGroup);


        Student.moneyGroup -= 150_000;
        System.out.println("Sau B4: " + Student.moneyGroup);


        Student.moneyGroup += 3 * 50_000;
        System.out.println("Sau B5: " + Student.moneyGroup);


        MyMath.min(3, 5);
        MyMath.sum(4, 6);
        Student.count = 0;
        new PrimaryStudent(1, "A");
        new PrimaryStudent(2, "B");
        new SecondaryStudent(3, "C");
        new SecondaryStudent(4, "D");
        new SecondaryStudent(5, "E");
        new SecondaryStudent(6, "F");

        System.out.println(Student.count);
        System.out.println(PrimaryStudent.countPrimary);
        System.out.println(SecondaryStudent.countSecondary);

        Student.count = 0;
        Scanner sc = new Scanner(System.in);
        Student[] studentss = new Student[3];


        for (int i = 0; i < 3; i++) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            studentss[i] = new Student(id, name);
        }


        String path1 = "Student.txt";
        new File(path1).createNewFile();

        for (Student s : studentss) {
            IOManager.writeFile(path1, true, s.toString() + "\n");
        }

        System.out.println("===== READ FILE StudentInformation.txt =====");
        System.out.println(IOManager.readFile(path1));


        String path2 = "Student.txt";
        new File(path2).createNewFile();

        for (int i = 0; i < studentss.length; i++) {
            IOManager.writeFile(path2, true,
                    "Student " + (i + 1) + ":\n" +
                            "\tId: " + studentss[i].id + "\n" +
                            "\tHọ và tên: " + studentss[i].name + "\n\n");
        }

        System.out.println("===== DONE =====");

    }
}

