package DTN2508.com.vti.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class QLTV {

    private ArrayList<TaiLieu> danhSach = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public void themTaiLieu() {
        System.out.println("1. Sách | 2. Tạp chí | 3. Báo");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.print("Mã tài liệu: ");
        String ma = scanner.nextLine();

        System.out.print("Nhà xuất bản: ");
        String nxb = scanner.nextLine();

        System.out.print("Số bản phát hành: ");
        int soBan = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Tên tác giả: ");
                String tg = scanner.nextLine();
                System.out.print("Số trang: ");
                int trang = Integer.parseInt(scanner.nextLine());
                danhSach.add(new Sach(ma, nxb, soBan, tg, trang));
                break;

            case 2:
                System.out.print("Số phát hành: ");
                int soPH = Integer.parseInt(scanner.nextLine());
                System.out.print("Tháng phát hành: ");
                int thang = Integer.parseInt(scanner.nextLine());
                danhSach.add(new TapChi(ma, nxb, soBan, soPH, thang));
                break;

            case 3:
                System.out.print("Ngày phát hành: ");
                String ngay = scanner.nextLine();
                danhSach.add(new Bao(ma, nxb, soBan, ngay));
                break;
        }
    }


    public void xoaTheoMa() {
        System.out.print("Nhập mã tài liệu cần xóa: ");
        String ma = scanner.nextLine();

        boolean removed = danhSach.removeIf(tl -> tl.getMaTaiLieu().equals(ma));
        System.out.println(removed ? "Xóa thành công!" : "Không tìm thấy!");
    }


    public void hienThiTatCa() {
        for (TaiLieu tl : danhSach) {
            tl.hienThiThongTin();
        }
    }


    public void timTheoLoai() {
        System.out.println("1. Sách | 2. Tạp chí | 3. Báo");
        int choice = Integer.parseInt(scanner.nextLine());

        for (TaiLieu tl : danhSach) {
            if (choice == 1 && tl instanceof Sach
                    || choice == 2 && tl instanceof TapChi
                    || choice == 3 && tl instanceof Bao) {
                tl.hienThiThongTin();
            }
        }
    }
}
