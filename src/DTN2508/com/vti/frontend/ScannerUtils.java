package DTN2508.com.vti.frontend;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner = new Scanner(System.in);
    //q7
    public static int inputInt(String errorMessage) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    //q8
    public static float inputFloat(String errorMessage) {
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static double inputDouble(String errorMessage) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static String inputString() {
        return scanner.nextLine();
    }
}

