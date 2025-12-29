package DTN2508.com.vti.baiTapBuoi5.exercise1;

public class ThiSinhKhoiA extends ThiSinh {
    public ThiSinhKhoiA (String soBaoDanh, String fullName, String address, int mucUuTien){
        super(soBaoDanh, fullName, address, mucUuTien);
    }

    @Override
    public String getKhoi() {
        return "Khối A (Toán - Lý - Hóa)";
    }


}
