public class Position {
    static int counter = 0;
    int positionID;
    positionName name;
    public Position() {
        this.positionID = ++counter;
    }
}
