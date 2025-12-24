public class Department {
    int id;
    static int counter = 0;
    String name;
    public Department() {
        this.id = ++counter;
    }

    /*Exercise 5: Object’s Method
        Question 1:
        In ra thông tin của phòng ban thứ 1 (sử dụng toString())*/
    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department other = (Department) obj;
        return this.name.equals(other.name);
    }
}
