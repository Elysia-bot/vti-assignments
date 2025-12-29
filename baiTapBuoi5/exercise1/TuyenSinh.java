package DTN2508.com.vti.baiTapBuoi5.exercise1;

import java.util.ArrayList;

public class TuyenSinh implements ITuyenSinh {
    private ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();

    @Override
    public void addThiSinh(ThiSinh thiSinh){
        danhSachThiSinh.add(thiSinh);
    }

    @Override
    public void hienThiDanhSach(){
        for (ThiSinh thiSinh : danhSachThiSinh){
            thiSinh.hienThiThongTin();
            System.out.println(       );
        }
    }

    @Override
    public void timKiemTheoSDB(String soBaoDanh){
        for (ThiSinh thiSinh : danhSachThiSinh){
            if(thiSinh.getSoBaoDanh().equals(soBaoDanh)){
                System.out.println("Tim thay thi sinh: ");
                thiSinh.hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh");
    }
}
