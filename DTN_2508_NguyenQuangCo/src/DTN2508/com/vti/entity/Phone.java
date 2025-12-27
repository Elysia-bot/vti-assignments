package DTN2508.com.vti.entity;

public abstract class Phone {

    protected Contact[] contacts;
    protected int size = 0;

    public Phone() {
        contacts = new Contact[100]; // giả sử tối đa 100 liên hệ
    }

    public abstract void insertContact(String name, String phone);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String newPhone);
    public abstract void searchContact(String name);
}

