package BaiTapNgay8;

import BaiTapNgay8.utils.LogUtils;

public class Program2 {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            try {
                MyException myEx =
                        new MyException(e.getMessage(), "Chia cho 0");
                LogUtils.writeLog(myEx);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

