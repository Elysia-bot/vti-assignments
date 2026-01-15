package BaiTapNgay9.Exercise1;

public class Student {
    private static int autoId = 1;
    private int id;
    private String name;

    public Student(String name) {
        this.id = autoId++;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

