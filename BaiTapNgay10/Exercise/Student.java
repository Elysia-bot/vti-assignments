package BaiTapNgay10.Exercise;

class Student {

    private static int autoId = 1;

    private int id;
    private String name;

    public Student(String name) {
        this.id = autoId++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * @deprecated Không dùng method này nữa,
     * hãy sử dụng getIdWithPrefix()
     */
    @Deprecated
    public int getId() {
        return id;
    }

    public String getIdWithPrefix() {
        return "MSV: " + id;
    }
}

