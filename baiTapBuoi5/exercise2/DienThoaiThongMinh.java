package DTN2508.com.vti.baiTapBuoi5.exercise2;

public class DienThoaiThongMinh extends DienThoaiDiDong implements IVuKhi {
    @Override
    public void nghe(){
        System.out.println("Điện thoại thông minh đang nghe.....");
    }

    @Override
    public void goi(){
        System.out.println("Điện thoại thông minh đang gọi.....");
    }

    @Override
    public void guiTinNhan() {
        System.out.println("Điện thoại thông minh gửi tin nhắn");
    }

    @Override
    public void nhanTinNhan() {
        System.out.println("Điện thoại thông minh nhận tin nhắn");
    }

    public void suDung3G() {
        System.out.println("Điện thoại thông minh sử dụng 3G");
    }

    public void chupHinh() {
        System.out.println("Điện thoại thông minh chụp hình");
    }

    @Override
    public void tanCong() {
        System.out.println("Điện thoại thông minh dùng làm vũ khí");
    }
}
