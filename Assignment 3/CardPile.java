public class CardPile {
  
  private Card[] cards;
  private int numCards;
  
  public CardPile() {
    
    cards = new Card[52];
    
    int numCards = 0;
  }

 public void addToBottom(Card c) {
   for(int i = 0; i < cards.length; i++){
     if(cards[i] == null){
       cards[i] = c;
       numCards++;
       break;
     }
   }
  }
        
 public boolean isEmpty() {
   for(int x = 0; x < cards.length; x++)
   {
     if(cards[x] != null)
     {
       return false;
     }
   }
   return true;
 }
 
 public Card get(int i){
   
   if(i < cards.length && i > numCards){
     return null;
   }
   return cards[i];
 }
   
 //public Card remove(int i){
   
 //set a temp value = cards[i]
 //set cards[i] = cards[i+1] 
 //set last value of cards = null
//}
 
 public Card remove(int i){
  Card tempCard = cards[i];
  for(; i < cards.length; i++){
   if(i + 1 < cards.length)
    cards[i] = cards[i+1];
  }
  
  numCards--;
  
  cards[cards.length - 1] = null;
  
  return tempCard;
 }

 public int find(Suit s, Value v) {
   for(int i = 0; i < numCards; i++){
     if(cards[i].getSuit() == s && cards[i].getValue() == v){
       return i;
     }
   }
   return -1;
 }
   
 public String toString() {
   
   String cardPileString = "";
   for(int i = 0; i < 52; i++){
     if(cards[i] != null){
     cardPileString += cardPileString + i + "." + cards[i].toString() + " "; 
   }
   
   }
 return cardPileString;
 }

 public static CardPile makeFullDeck() {
   
   CardPile myPile = new CardPile();
   int i = 0;
   Card[] temp = new Card[52];
   
   for(Value v : Value.values()) {
     for(Suit s : Suit.values()) {
       temp[i] = new Card(s, v);
       i++;
     }
   }
   
   UtilityCode.shuffle(temp, 52);
   
   for(int a = 0; a < temp.length; a++){
     myPile.addToBottom(temp[a]);
   }
   return myPile;
 }
}