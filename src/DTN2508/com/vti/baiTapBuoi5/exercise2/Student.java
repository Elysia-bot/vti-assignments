package DTN2508.com.vti.baiTapBuoi5.exercise2;

import java.util.ArrayList;

public class Student implements IStudent {
    private int studentID;
    private String fullName;
    private int group;

    public Student(int studentID, String fullName, int group){
        this.fullName = fullName;
        this.group = group;
        this.studentID = studentID;
    }

    public String getFullName(){
        return fullName;
    }

    public int getStudentID(){
        return studentID;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public void diemDanh() {
        System.out.println(fullName + " điểm danh");
    }

    @Override
    public void hocBai() {
        System.out.println(fullName + " đang học bài");
    }

    @Override
    public void donVeSinh() {
        System.out.println(fullName + " đi dọn vệ sinh");
    }
}
