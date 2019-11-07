
// creates instances of the coin class and tests their attributes and behaviors.

public class CoinTester{
  public static void main(String[] args){
    Coin myCoin = new Coin();
    Coin yourCoin = new Coin();
    int count=0;
    for (int i=1; i<=10; i++){
      myCoin.flip();
      if(myCoin.isHeads()){
        count++; 
      }
      // flips a coin 10 times, print number of heads
    }
    System.out.println("Number of heads out of 10: " + count);
    System.out.println("My coin: " + myCoin.toString());
    System.out.println("Your coin: " + yourCoin.toString());
  }
}
