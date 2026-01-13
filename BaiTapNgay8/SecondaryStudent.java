package BaiTapNgay8;

public final class SecondaryStudent extends Student {
    public static int countSecondary = 0;

    public SecondaryStudent(int id, String name) {
        super(id, name);
        countSecondary++;
    }
}

