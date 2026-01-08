package DTN2508.com.vti.frontend;

import DTN2508.com.vti.entity.Student;

public class Program4 {
    public static void main(String[] args) {

        // Tạo student
        Student st1 = new Student("Nguyễn Văn A", "HCM");

        // Set điểm
        st1.setScore(8.5f);

        // Cộng thêm điểm
        st1.addScore(1.5f);

        // In thông tin
        st1.printInfo();
    }

}
