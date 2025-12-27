package DTN2508.com.vti.frontend;

import DTN2508.com.vti.entity.HighSchoolStudent;
import DTN2508.com.vti.entity.QLTV;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        HighSchoolStudent hs = new HighSchoolStudent(
                1,
                "Cơ",
                "Toán nâng cao",
                "Đại học công nghệ Sài Gòn"
        );
        QLTV ql = new QLTV();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Thêm  2.Xóa  3.Hiển thị  4.Tìm theo loại  5.Thoát");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: ql.themTaiLieu(); break;
                case 2: ql.xoaTheoMa(); break;
                case 3: ql.hienThiTatCa(); break;
                case 4: ql.timTheoLoai(); break;
                case 5: return;
            }
        }
    }
}
