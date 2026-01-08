package DTN2508.com.vti.entity;

public class TapChi extends TaiLieu {

    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String ma, String nxb, int soBan, int soPhatHanh, int thang) {
        super(ma, nxb, soBan);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thang;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("TẠP CHÍ | Mã: " + getMaTaiLieu()
                + ", NXB: " + getNhaXuatBan()
                + ", Số bản: " + getSoBanPhatHanh()
                + ", Số PH: " + soPhatHanh
                + ", Tháng: " + thangPhatHanh);
    }
}
