package BaiTapNgay8;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MyException extends Exception implements Serializable {
    public String reason;
    public LocalDateTime time;

    public MyException(String message, String reason) {
        super(message);
        this.reason = reason;
        this.time = LocalDateTime.now();
    }
}

