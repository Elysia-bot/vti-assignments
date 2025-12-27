package DTN2508.com.vti.entity;

public class Position {
    private static int counter = 0;
    private int positionID;
    private positionName name;
    public Position() {
        this.positionID = ++counter;
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
