package DTN2508.com.vti.entity;

public class VietnamesePhone extends Phone {

    @Override
    public void insertContact(String name, String phone) {
        // nếu đã tồn tại thì cập nhật số
        for (int i = 0; i < size; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                contacts[i].setPhone(phone);
                return;
            }
        }
        contacts[size++] = new Contact(name, phone);
    }

    @Override
    public void removeContact(String name) {
        for (int i = 0; i < size; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < size - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                contacts[--size] = null;
                return;
            }
        }
        System.out.println("Không tìm thấy liên hệ để xóa!");
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (int i = 0; i < size; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                contacts[i].setPhone(newPhone);
                return;
            }
        }
        System.out.println("Không tìm thấy liên hệ để cập nhật!");
    }

    @Override
    public void searchContact(String name) {
        for (int i = 0; i < size; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Tên: " + contacts[i].getName()
                        + ", SĐT: " + contacts[i].getPhone());
                return;
            }
        }
        System.out.println("Không tìm thấy liên hệ!");
    }
}
