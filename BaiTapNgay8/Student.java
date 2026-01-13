package BaiTapNgay8;

import java.io.Serializable;

public class Student implements Serializable {
    public final int id;
    public String name;
    public static String college;
    public static int moneyGroup = 0;
    public static int count = 0;

    public Student(int id, String name) {
        if (count >= 7) {
            throw new RuntimeException("Không thể tạo quá 7 học sinh");
        }
        this.id = id;
        this.name = name;
        count++;
    }




    public void showInfo() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", College: " + college);
    }

    public static void setCollege(String newCollege) {
        college = newCollege;
    }

    public static String getCollege() {
        return college;
    }

    public final void study() {
        System.out.println("Đang học bài...");
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

}


