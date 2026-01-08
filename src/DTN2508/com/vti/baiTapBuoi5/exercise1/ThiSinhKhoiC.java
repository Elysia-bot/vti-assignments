package DTN2508.com.vti.baiTapBuoi5.exercise1;

public class ThiSinhKhoiC extends ThiSinh {
    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String getKhoi() {
        return "Khối C (Văn - Sử - Địa)";
    }
}
