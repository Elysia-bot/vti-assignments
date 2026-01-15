package BaiTapNgay9.Exercise1;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Nam");
        students.put(2, "Huy");

        System.out.println(students.keySet());
        System.out.println(students.values());

        students.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        Set<Map.Entry<Integer, String>> set = students.entrySet();
    }
}

