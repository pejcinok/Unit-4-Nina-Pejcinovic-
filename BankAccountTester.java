
public class BankAccountTester{
  public static void main (String[] args){
    BankAccount gAccount = new BankAccount("Gillian", "USAA",
    "Gillian's Checking", 510, 0.02,2222);
    BankAccount nAccount = new BankAccount("Nina", "Wells Fargo",
    "Nina's Checking", 612, 0.02, 4444);

    System.out.println(nAccount + "\n");
    System.out.println(gAccount);

    System.out.println("~ Transfer ~");
    gAccount.transfer(100, nAccount);
    System.out.println();
    System.out.println("Transferred $100 to Nina's Checking " + "\n" + gAccount);


    System.out.println("~ Withdrawing money from account ~");
    gAccount.withdraw(600);
    System.out.println();
    System.out.println("Withdrew $600 " + "\n" + gAccount);

    System.out.println("~ Depositing money into account ~");
    gAccount.deposit(400);
    System.out.println();
    System.out.println("Deposited $400 " + "\n" + gAccount);
    System.out.println();

    System.out.println("~ Withdrawing money from account ~");
    nAccount.withdraw(300);
    System.out.println();
    System.out.println("Withdrew $300 " + "\n" + nAccount);

    System.out.println("~ Depositing money into account ~");
    nAccount.deposit(400);
    System.out.println();
    System.out.println("Deposited $400 " + "\n" + nAccount);

    nAccount.setInterest();
    System.out.println();
    System.out.println("Interest at end of year " + "\n" + nAccount);
  }
}
