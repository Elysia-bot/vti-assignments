package BaiTapNgay8;

public final class PrimaryStudent extends Student {
    public static int countPrimary = 0;

    public PrimaryStudent(int id, String name) {
        super(id, name);
        countPrimary++;
    }
}

