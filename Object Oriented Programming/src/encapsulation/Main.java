package encapsulation;

public class Main {
  static void main() {
    System.out.println("====================================== Encapsulation ======================================");
    /* What is Encapsulation ? */
    // Encapsulation = Hiding Internal Data of a class and allows access only through methods
    // Encapsulation == Data Hiding + Controlled Access
    BankAccount bankAccount = new BankAccount();
    bankAccount.deposit(1000);
    bankAccount.withdraw(500);
    bankAccount.showBalance();
  }
}
class BankAccount{
  private int balance;
  // setter
  public void deposit(int amount){
    this.balance += amount;
  }
  // withdraw
  public void withdraw(int amount){
    if (amount>balance) {
      System.out.println("You can't Sufficient balance to withdraw");
    }
    else {
      balance -= amount;
      System.out.println(amount + "$ withdrawn. Remaining balance: " + balance + "$");
    }
  }
  public void showBalance(){
    System.out.print("You have "+balance+"$ in your bank Account");
  }
}
