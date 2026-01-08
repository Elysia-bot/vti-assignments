
package DTN2508.com.vti.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

    private ArrayList<CanBo> danhSachCanBo = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void themCanBo() {
        System.out.println("Chọn loại cán bộ:");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");

        int choice = Integer.parseInt(scanner.nextLine());

        System.out.print("Họ tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Tuổi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());

        System.out.print("Giới tính: ");
        String gioiTinh = scanner.nextLine();

        System.out.print("Địa chỉ: ");
        String diaChi = scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Bậc (1-10): ");
                int bac = Integer.parseInt(scanner.nextLine());
                danhSachCanBo.add(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                break;

            case 2:
                System.out.print("Ngành đào tạo: ");
                String nganh = scanner.nextLine();
                danhSachCanBo.add(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganh));
                break;

            case 3:
                System.out.print("Công việc: ");
                String congViec = scanner.nextLine();
                danhSachCanBo.add(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    public void timKiemTheoTen() {
        System.out.print("Nhập họ tên cần tìm: ");
        String ten = scanner.nextLine();

        boolean found = false;
        for (CanBo cb : danhSachCanBo) {
            if (cb.getHoTen().equalsIgnoreCase(ten)) {
                cb.hienThiThongTin();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy cán bộ!");
        }
    }

    public void hienThiDanhSach() {
        if (danhSachCanBo.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (CanBo cb : danhSachCanBo) {
            cb.hienThiThongTin();
            System.out.println("                 ");
        }
    }

    public void xoaCanBoTheoTen() {
        System.out.print("Nhập họ tên cán bộ cần xóa: ");
        String ten = scanner.nextLine();

        boolean removed = danhSachCanBo.removeIf(
                cb -> cb.getHoTen().equalsIgnoreCase(ten)
        );

        if (removed) {
            System.out.println("Đã xóa cán bộ");
        } else {
            System.out.println("Không tìm được cán bộ");
        }
    }
}
