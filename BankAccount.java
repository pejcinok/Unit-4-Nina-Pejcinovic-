/*
Attributes:
- Balance
- Account Name
- owners
- Interest
- bank name
Behaviors:
- Transfer
- Deposit
- withdraw
- check balance
*/

public class BankAccount{
  //attributes of a bank account (instance variables)
  private double balance;
  private double interest;
  private String accountName;
  private String owners;
  private String bankName;
  private int pin;


  //constructor for BankAccount class.Initializes instance variables
  public BankAccount (String accOwners, String accBank, String accName,
  double accBalance, double accInterest, int thePin){
    balance = accBalance;
    accountName = accName;
    owners = accOwners;
    bankName = accBank;
    interest = accInterest;
    pin = thePin;

  }
  //getter methods for instance variables
  public String getAccName(){
    return accountName;
  }
  public String getOwners(){
    return owners;
  }
  public String getBank(){
    return bankName;
  }
  public double getInterest(){
    return interest;
  }
  public double getBalance(){
    return balance;
  }

  //setter methods for instance variables
  public void setBalance(double theBalance){
         balance = theBalance;

  }

  public void setInterest(){
      {
            setBalance(balance * (1 + interest));
        }

  }
  //methods for what a bank account does

  //lets client transfer money to another bank account
  public void transfer(double amount, BankAccount other){
    other.setBalance(other.getBalance() + amount);
    this.setBalance(getBalance() - amount);
  }

  //lets client withdraw money
  public void withdraw(double subWithdraw) {

    setBalance(getBalance() - subWithdraw);
  }

  // lets client deposit money
  public void deposit(double addDeposit){

    setBalance(getBalance() + addDeposit);

  }

  //prints current state of bank account
  public String toString(){
  String result = "";
  result += "    Account Owners: " + owners + "\nBank Name: " + bankName + "\n";
  result += "    Account Name: " + accountName + "\n";
  result += "    Account Balance: " + balance + "\n";
  return result;
  }
}
