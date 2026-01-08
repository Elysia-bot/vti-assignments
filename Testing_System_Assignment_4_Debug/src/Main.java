//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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

}
