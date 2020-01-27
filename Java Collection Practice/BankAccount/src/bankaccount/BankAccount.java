package bankaccount;

public class BankAccount {

    private int accID;
    private double balance;
    private String ownerName;

    public BankAccount() {
    }

    public BankAccount(int accID, double balance) {
        this.accID = accID;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance = this.balance + amount;
        } else {
            System.out.println("Cannot deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0 && amount <= this.balance) {
            this.balance = this.balance - amount;
        } else {
            System.out.println("Cannot withdraw!");
        }
    }

    public void addInterest(double interest) {
        if (interest >= 0) {
            this.balance = this.balance + (this.balance * interest / 100);
        } else {
            System.out.println("Cannot add interest");
        }

    }

    @Override
    public String toString() {
        return "BankAccount{" + "Owner name :" + ownerName + "AccountID :" + accID + ", Balance :" + balance + '}';
    }

}
