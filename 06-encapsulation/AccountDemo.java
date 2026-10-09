class BankAccount {
private double balance;
BankAccount(double balance) {
this.balance = balance;
}
void deposit(double amount) {
if (amount > 0) balance += amount;
}
double getBalance() {
return balance;
}
}
public class AccountDemo {
public static void main(String[] args) {
BankAccount account = new BankAccount(500);
account.deposit(200);
System.out.println("Balance = " + account.getBalance());
}
}