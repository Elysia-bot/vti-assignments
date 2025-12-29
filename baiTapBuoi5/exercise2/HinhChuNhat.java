package DTN2508.com.vti.baiTapBuoi5.exercise2;

public class HinhChuNhat {
    private double dai;
    private double rong;

    public HinhChuNhat(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }

    public double tinhChuVi(){
        System.out.println("Tính chu vi theo Hình Chữ Nhật");
        return (dai + rong)*2;
    }

    public double tinhDienTich(){
        System.out.println("Tính diện tích theo Hình Chữ Nhật");
        return dai*rong;
    }
}
