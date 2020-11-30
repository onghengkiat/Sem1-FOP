public class L8Q2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("ONGHENGKIAT", 000510121234, 1000000);
        account1.displayBalance();
        account1.deposit(500);
        account1.displayBalance();
        account1.withdraw(312);
        account1.displayBalance();
    }
}

class BankAccount {

    private String name;
    private int IC, balance;

    public BankAccount(String name, int ic, int balance) {
        this.name = name;
        this.IC = ic;
        this.balance =balance;
    }

    public void deposit(int a) {
        System.out.println("Deposit: " + a);
        balance += a;
    }

    public void withdraw(int a) {
        System.out.println("Withdraw: " + a);
        balance -= a;
    }

    public void displayBalance() {
        System.out.println("The balance of the account is " + balance);
    }

}


