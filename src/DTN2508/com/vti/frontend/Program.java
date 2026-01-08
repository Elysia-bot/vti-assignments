package DTN2508.com.vti.frontend;

import DTN2508.com.vti.entity.Department;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        float result = divide(7,0);
        System.out.println(result);

        //q3
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    //q1 q2
    public static float divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("cannot divide 0");
            return 0;
        } finally {
            System.out.println("divide completed!");
        }
    }

    //q4
    static Department[] departments = new Department[3];
    public static void getIndex(int index) {
        try {
            System.out.println(departments[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department.");
        }
    }

    //q5
    //q6
    public static int inputAge() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int age = Integer.parseInt(scanner.nextLine());
                if (age > 0) {
                    return age;
                }
                System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
            } catch (NumberFormatException e) {
                System.out.println("wrong inputing! Please input an age as int, input again.");
            }
        }
    }


}
