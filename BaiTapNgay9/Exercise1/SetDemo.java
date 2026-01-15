package BaiTapNgay9.Exercise1;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Nam"));
        students.add(new Student("Nam"));
        students.add(new Student("Huy"));

        Set<String> names = new HashSet<>();
        for (Student s : students) names.add(s.getName());

        TreeSet<String> sortedNames = new TreeSet<>(names);
        System.out.println(sortedNames);
    }
}

