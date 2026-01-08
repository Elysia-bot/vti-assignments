
package DTN2508.com.vti.entity;

public class Sach extends TaiLieu {

    private String tenTacGia;
    private int soTrang;

    public Sach(String ma, String nxb, int soBan, String tenTacGia, int soTrang) {
        super(ma, nxb, soBan);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("SÁCH | Mã: " + getMaTaiLieu()
                + ", NXB: " + getNhaXuatBan()
                + ", Số bản: " + getSoBanPhatHanh()
                + ", Tác giả: " + tenTacGia
                + ", Số trang: " + soTrang);
    }
}

