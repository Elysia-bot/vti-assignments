package DTN2508.com.vti.baiTapBuoi5.exercise1;

public abstract class ThiSinh {
    private String soBaoDanh;
    private String fullName;
    private String address;
    private int mucUuTien;

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.fullName = hoTen;
        this.address = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getHoTen() {
        return fullName;
    }
    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public abstract String getKhoi();

    public void hienThiThongTin() {
        System.out.println("SBD: " + soBaoDanh);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Mức ưu tiên: " + mucUuTien);
        System.out.println("Khối thi: " + getKhoi());
    }
}
