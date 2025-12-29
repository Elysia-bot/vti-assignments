package DTN2508.com.vti.baiTapBuoi5.exercise2;

public class DienThoaiCoDien extends DienThoaiDiDong implements IVuKhi {
    @Override
    public void nghe() {
        System.out.println("Điện thoại cổ điển đang nghe cuộc gọi....");
    }

    @Override
    public void goi() {
        System.out.println("Điện thoại cổ điển đang gọi điện....");
    }

    @Override
    public void guiTinNhan() {
        System.out.println("Điện thoại cổ điển gửi tin nhắn");
    }

    @Override
    public void nhanTinNhan() {
        System.out.println("Điện thoại cổ điển nhận tin nhắn");
    }

    public void ngheRadio() {
        System.out.println("Điện thoại cổ điển nghe radio");
    }

    @Override
    public void tanCong() {
        System.out.println("Điện thoại cổ điển dùng làm vũ khí");
    }
}
