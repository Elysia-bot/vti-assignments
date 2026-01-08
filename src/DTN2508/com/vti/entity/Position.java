
package DTN2508.com.vti.entity;

import DTN2508.com.vti.frontend.ScannerUtils;

public class Position {
    private static int counter = 0;
    private int positionID;
    private positionName name;
    public Position() {
        this.positionID = ++counter;
        System.out.print("Nhập tên phòng ban: ");
        this.name = positionName.valueOf(ScannerUtils.inputString());
    }


    public int getPositionID() {
        return positionID;
    }

    public positionName getName() {
        return name;
    }


    public void setName(positionName name) {
        this.name = name;
    }
}
