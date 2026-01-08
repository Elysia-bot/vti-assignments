package DTN2508.com.vti.baiTapBuoi5.exercise2;

import DTN2508.com.vti.entity.Student;
import DTN2508.com.vti.entity.gender;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentQ2 extends Person {
    private String maSV;
    private float gpa;
    private String email;

    public StudentQ2() {
        super();
    }

    public StudentQ2(String fullName, gender gender, LocalDate birthDate, String address, String maSV, float gpa,
                     String email){
        super(fullName, gender, birthDate, address);
        this.email = email;
        this.gpa = gpa;
        this.maSV = maSV;
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sinh viên: ");
        maSV = scanner.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        gpa = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Nhập email: ");
        email = scanner.nextLine();
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.printf("Mã sinh viên: %s%n", maSV);
        System.out.printf("GPA: %f%n", gpa);
        System.out.printf("Email: %s%n", email);
    }

    public boolean xetHocBong(float gpa){
        return gpa >= 8.0;
    }

}
