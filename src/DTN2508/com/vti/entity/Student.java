package DTN2508.com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float score;

    private static int counter = 0;

    public Student(String name, String hometown) {
        this.id = ++counter;
        this.name = name;
        this.hometown = hometown;
        this.score = 0;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void addScore(float score) {
        this.score += score;
    }

    public void printInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Quê: " + hometown);
        System.out.println("Điểm: " + score);
        System.out.println("Học lực: " + getRank());
    }

    private String getRank() {
        if (score < 4.0) {
            return "Yếu";
        } else if (score < 6.0) {
            return "TB";
        } else if (score < 8.0) {
            return "Khá";
        } else {
            return "Giỏi";
        }
    }
}