/*
  This is the coin class.
  It is the blueprint for how to make a coin object
*/
public class Coin{
  //These are declarations for the attributes (instance variables) of a coin.
    private int face;

    private final int HEADS=0; // constants defining heads and tails
    private final int TAILS=1;
/*
  The coin constructor that defines what happens when a coin object is made.
  When a new coin is made, it gets flipped.
*/
    public Coin(){
      flip();
    }
    // This is the section of the class containing the methods of a Coin.

    //The flip method assigns a randomly chosen value to the face of the coin.
    public void flip(){
      face = (int)(Math.random() * 2);
    }

//The isHeads method tells us if the coin's face is heads or not.

public boolean isHeads(){
  return (face==HEADS);
}
//prints out information about the current state of a coin.
public String toString(){
    String result = "";
    if (face==HEADS){
      result= "HEADS";
    }
      else{
        result = "TAILS";
      }
      return result;
      }
}
