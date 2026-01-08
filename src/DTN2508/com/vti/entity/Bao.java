package DTN2508.com.vti.entity;

public class Bao extends TaiLieu {

    private String ngayPhatHanh;

    public Bao(String ma, String nxb, int soBan, String ngay) {
        super(ma, nxb, soBan);
        this.ngayPhatHanh = ngay;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("BÁO | Mã: " + getMaTaiLieu()
                + ", NXB: " + getNhaXuatBan()
                + ", Số bản: " + getSoBanPhatHanh()
                + ", Ngày PH: " + ngayPhatHanh);
    }
}
