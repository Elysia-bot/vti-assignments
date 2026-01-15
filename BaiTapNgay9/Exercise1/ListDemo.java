package BaiTapNgay9.Exercise1;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Nam"));
        students.add(new Student("Huy"));
        students.add(new Student("Nam"));
        students.add(new Student("Lan"));
        students.add(new Student("Nam"));

        System.out.println("Total: " + students.size());

        System.out.println("Phần tử thứ 4: " + students.get(3));

        System.out.println("First: " + students.get(0));
        System.out.println("Last: " + students.get(students.size() - 1));

        students.add(0, new Student("New First"));

        students.add(new Student("New Last"));

        Collections.reverse(students);

        System.out.println(findById(students, 2));


        System.out.println(findByName(students, "Nam"));

        printDuplicateNames(students);

        students.stream()
                .filter(s -> s.getId() == 2)
                .forEach(s -> s.setName(null));

        students.removeIf(s -> s.getId() == 5);

        ArrayList<Student> studentCopies = new ArrayList<>(students);
    }

    static Student findById(List<Student> list, int id) {
        for (Student s : list)
            if (s.getId() == id) return s;
        return null;
    }

    static List<Student> findByName(List<Student> list, String name) {
        List<Student> result = new ArrayList<>();
        for (Student s : list)
            if (name.equals(s.getName()))
                result.add(s);
        return result;
    }

    static void printDuplicateNames(List<Student> list) {
        Map<String, Integer> map = new HashMap<>();
        for (Student s : list)
            map.put(s.getName(), map.getOrDefault(s.getName(), 0) + 1);

        map.forEach((k, v) -> {
            if (v > 1) System.out.println("Trùng tên: " + k);
        });
    }
}

