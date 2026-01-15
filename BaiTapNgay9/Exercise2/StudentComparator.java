package BaiTapNgay9.Exercise2;

import java.util.Comparator;

class StudentComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 a, Student2 b) {
        int c = a.name.compareTo(b.name);
        if (c == 0) c = a.dob.compareTo(b.dob);
        if (c == 0) c = Double.compare(a.score, b.score);
        return c;
    }
}

