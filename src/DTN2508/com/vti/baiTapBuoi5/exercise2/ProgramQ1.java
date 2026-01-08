package DTN2508.com.vti.baiTapBuoi5.exercise2;

import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class ProgramQ1 {
    public static void main(String[] args) {
        ArrayList<Student> danhSachStudent = new ArrayList<>();
        danhSachStudent.add(new Student(1, "Nguyễn Văn A", 1));
        danhSachStudent.add(new Student(2, "Nguyễn Văn B", 1));
        danhSachStudent.add(new Student(3, "Nguyễn Văn C", 1));
        danhSachStudent.add(new Student(4, "Nguyễn Văn D", 2));
        danhSachStudent.add(new Student(5, "Nguyễn Văn E", 2));
        danhSachStudent.add(new Student(6, "Nguyễn Văn F", 2));
        danhSachStudent.add(new Student(7, "Nguyễn Văn G", 3));
        danhSachStudent.add(new Student(8, "Nguyễn Văn H", 3));
        danhSachStudent.add(new Student(9, "Nguyễn Văn I", 3));
        danhSachStudent.add(new Student(10, "Nguyễn Văn K", 3));


        for (Student sd : danhSachStudent){
            sd.diemDanh();
        }

        for (Student sd : danhSachStudent){
            if(sd.getGroup() == 1) {
                sd.hocBai();
            }
        }

        for (Student sd : danhSachStudent){
            if (sd.getGroup() == 2){
                sd.donVeSinh();
            }
        }

    }
}
