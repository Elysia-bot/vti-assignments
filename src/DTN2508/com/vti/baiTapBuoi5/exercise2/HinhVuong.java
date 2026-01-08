package DTN2508.com.vti.baiTapBuoi5.exercise2;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(double canh){
        super(canh, canh);
    }

    @Override
    public double tinhChuVi() {
        System.out.println("Tính chu vi theo Hình Vuông");
        return super.tinhChuVi();
    }

    @Override
    public double tinhDienTich() {
        return super.tinhDienTich();
    }

    @Override
    public void hienThiDienTich() {
        System.out.println("Tính diện tích theo Hình Vuông");
        System.out.println(tinhDienTich());
    }

}
