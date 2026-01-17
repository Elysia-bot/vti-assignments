package BaiTapNgay10.Exercise;

import java.util.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        System.out.println("=== Exercise 1: Internationalization ===");

        Locale viLocale = new Locale("vi", "VN");
        Locale enLocale = new Locale("en", "US");

        ResourceBundle viBundle =
                ResourceBundle.getBundle(
                        "BaiTapNgay10.messages",
                        viLocale
                );

        ResourceBundle enBundle =
                ResourceBundle.getBundle(
                        "BaiTapNgay10.messages",
                        enLocale
                );

        System.out.println("VI: " + viBundle.getString("hello"));
        System.out.println("EN: " + enBundle.getString("hello"));



        System.out.println("\n=== Exercise 2: Annotations ===");


        demoDeprecatedDate();


        Student s = new Student("Nguyễn Văn A");
        System.out.println("Tên student: " + s.getName());


        System.out.println("ID (cũ): " + s.getId());


        System.out.println("ID (mới): " + s.getIdWithPrefix());


        System.out.println("\n=== Exercise 3: Inner Class ===");


        CPU cpu = new CPU(1500);
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        CPU.Ram ram = cpu.new Ram(16, "Kingston");

        System.out.println("Cache Processor: " + processor.getCache());
        System.out.println("ClockSpeed Ram: " + ram.getClockSpeed());


        Car car = new Car("Mazda", "8WD");
        Car.Engine engine = car.new Engine();
        engine.setEngineType("Crysler");

        System.out.println("Động cơ xe: " + engine.getEngineType());


        System.out.println("Question 3:Day la inner class Day la inner class");
        System.out.println("Question 4:Ngay: 31/10/2021 Gio: 10:15:30");
    }


    @SuppressWarnings("deprecation")
    public static void demoDeprecatedDate() {
        Date date = new Date(120, 4, 18);
        System.out.println("Ngày (deprecated Date): " + date);
    }
}

