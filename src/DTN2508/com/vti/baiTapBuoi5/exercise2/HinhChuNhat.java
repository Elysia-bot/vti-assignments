package DTN2508.com.vti.baiTapBuoi5.exercise2;

public class HinhChuNhat {
    private double dai;
    private double rong;

    public HinhChuNhat(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }

    public double tinhChuVi(){

        return (dai + rong)*2;
    }

    public  void hienThiChuVi() {
        System.out.println("Tính chu vi theo Hình Vuông");
        System.out.println(tinhChuVi());
    }
    public double tinhDienTich(){

        return dai*rong;
    }

    public void hienThiDienTich() {
        System.out.println("Tính diện tích theo Hình Vuông");
        System.out.println(tinhDienTich());
    }
}
