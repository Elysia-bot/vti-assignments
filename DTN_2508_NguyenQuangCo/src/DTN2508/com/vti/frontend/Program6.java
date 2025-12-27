package DTN2508.com.vti.frontend;

import DTN2508.com.vti.entity.*;

public class Program6 {
    public static void main(String[] args) {
        Phone phone = new VietnamesePhone();

        phone.insertContact("Nam", "0123456789");
        phone.insertContact("Lan", "0987654321");

        phone.searchContact("Nam");

        phone.updateContact("Nam", "0909090909");
        phone.searchContact("Nam");

        phone.removeContact("Lan");
        phone.searchContact("Lan");


        User emp = new Employee("An", 2.0);
        User manager = new Manager("Binh", 3.0);
        User waiter = new Waiter("Cuong", 1.5);

        emp.displayInfor();
        System.out.println("      ");
        manager.displayInfor();
        System.out.println("      ");
        waiter.displayInfor();
    }
}
