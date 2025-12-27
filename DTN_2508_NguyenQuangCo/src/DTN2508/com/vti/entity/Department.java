package DTN2508.com.vti.entity;

public class Department {
    private int id;
    private static int counter = 0;
    private String name;

 /*   Question 1:
    Tạo constructor cho department:
    a) Không có parameters
    b) Có 1 parameter là nameDepartment và default id của Department = 0
    Khởi tạo 1 Object với mỗi constructor ở trên*/
    public Department() {
        this.id = ++counter;
    }

    public  Department(String name){
        this.name = name;
        this.id = 0;
    }
    /*Exercise 5: Object’s Method
        DTN2508.entity.Question 1:
        In ra thông tin của phòng ban thứ 1 (sử dụng toString())*/
    @Override
    public String toString() {
        return "DTN2508.entity.Department{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department other = (Department) obj;
        return this.name.equals(other.name);
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
