package BaiTapNgay9.Exercise3;

class Employee<T extends Number> {
    int id;
    String name;
    T[] salaries;

    void printInfo() {
        System.out.println(id + " " + name);
        for (T s : salaries) System.out.println(s);
    }

    void printLastSalary() {
        System.out.println(salaries[salaries.length - 1]);
    }
}

