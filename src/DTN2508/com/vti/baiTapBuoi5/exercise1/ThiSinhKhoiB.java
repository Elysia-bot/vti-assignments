package DTN2508.com.vti.baiTapBuoi5.exercise1;

public class ThiSinhKhoiB extends ThiSinh {
    public ThiSinhKhoiB(String soBaoDanh, String fullName, String address, int mucUuTien) {
        super(soBaoDanh, fullName, address, mucUuTien);
    }

    @Override
    public String getKhoi() {
        return "Khối B (Toán - Hóa - Sinh)";
    }
}
