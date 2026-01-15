package BaiTapNgay9.Exercise2;

import java.time.LocalDate;
import java.util.*;

class Student2 implements Comparable<Student2> {
    int id;
    String name;
    LocalDate dob;
    double score;

    @Override
    public int compareTo(Student2 o) {
        return this.name.compareTo(o.name);
    }
}

