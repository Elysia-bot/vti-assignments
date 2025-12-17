public class Position {
    static int counter = 0;
    int id;
    positionName name;
    public Position() {
        this.id = ++counter;
    }
}
