package BaiTapNgay8.utils;

import BaiTapNgay8.MyException;

public class LogUtils {

    public static void writeLog(MyException e) throws Exception {
        IOManager.writeObject(e, "logs", "Exception.ser");
    }

    public static MyException readLog() throws Exception {
        return (MyException) IOManager.readObject("logs/Exception.ser");
    }
}

