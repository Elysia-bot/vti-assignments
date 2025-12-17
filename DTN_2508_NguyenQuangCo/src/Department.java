public class Department {
    int id;
    static int counter = 0;
    String name;
    public Department() {
        this.id = ++counter;
    }

}
