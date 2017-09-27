public class Card {
  
  private Suit suit;
  private Value value;
  
  public Card(Suit theSuit, Value theValue) {
    suit = theSuit;
    value = theValue;
    
  }
  
  public Suit getSuit() {
    return suit;
  }
  
  public Value getValue() {
    return value;
  }
  
  public String toString(){
    //System.out.println(suit + "of" + value);
    
    return value + " of " + suit;
  }
}
    