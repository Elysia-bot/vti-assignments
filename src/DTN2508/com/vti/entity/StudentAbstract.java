package DTN2508.com.vti.entity;

public abstract class StudentAbstract extends Person {

    protected int id;

    public StudentAbstract(int id, String name) {
        super(name);
        this.id = id;
    }
}