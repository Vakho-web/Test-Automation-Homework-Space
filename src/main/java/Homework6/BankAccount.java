//@author Vakho Gvishiani

package Homework6;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Vakho", 100000);

        acc.deposit(50000);
        System.out.println(acc.owner + " has: " + acc.getBalance() + "GEL on balance");

        acc.withdraw(30000);
        System.out.println(acc.owner + " has: " + acc.getBalance() + "GEL on balance");

        acc.withdraw(200000);
        System.out.println(acc.owner + " has: " + acc.getBalance() + "GEL on balance");
    }
}
