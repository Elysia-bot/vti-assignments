package DTN2508.com.vti.entity;

public abstract class TaiLieu {

    private String maTaiLieu;      // duy nhất
    private String nhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public abstract void hienThiThongTin();
}
