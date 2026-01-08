package DTN2508.com.vti.baiTapBuoi5.exercise2;

public class ProgramQ4 {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        System.out.println("Sum int: " + myMath.sum(1,2));
        System.out.println("Sum byte: " + myMath.sum((byte) 2, (byte) 4));
        System.out.println("Sum float: " + myMath.sum(2.0f, 5.0f));
    }
}
