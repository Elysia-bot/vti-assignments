package DTN2508.com.vti.entity;

public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void transferTo(Account account, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            account.balance += amount;
        }
    }
}

