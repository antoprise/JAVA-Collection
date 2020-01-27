
package bankaccount;


public class SITBank01 {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.deposit(20000);
        System.out.println(bank.toString());
        bank.withdraw(500);
        System.out.println(bank.toString());
        bank.addInterest(0.4);
        System.out.println(bank.toString());
    
        BankAccount antoprise = new BankAccount(12086,0000);
        antoprise.setOwnerName("Antoprise");
        System.out.println(antoprise.toString());
        antoprise.withdraw(500);
        System.out.println(antoprise.toString());
        antoprise.addInterest(0.4);
        System.out.println(antoprise.toString());
    
    }
    
}
