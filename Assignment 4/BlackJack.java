import java.util.Scanner;
import java.util.ArrayList;

public class BlackJack {
  
  public static void main(String[] args){
    
    CardPile deck = new CardPile();
    deck.makeFullDeck(4);
    
    while(deck.getNumCards() > 10){
      playRound(deck);
    
    }
    
  }
  
  public static int getScore(Card c) {  
    
    //setting the score for each card
    
    if(c.getValue() == Value.TWO){
      return 2;
    }
    if(c.getValue() == Value.THREE){
      return 3;
    }
    if(c.getValue() == Value.FOUR){
      return 4;
    }
    if(c.getValue() == Value.FIVE){
      return 5;
    }
    if(c.getValue() == Value.SIX){
      return 6;
    }
    if(c.getValue() == Value.SEVEN){
      return 7;
    }
    if(c.getValue() == Value.EIGHT){
      return 8;
    }
    if(c.getValue() == Value.NINE){
      return 9;
    }
    if(c.getValue() == Value.TEN){
      return 10;
    }
    if(c.getValue() == Value.JACK){
      return 10;
    }
    if(c.getValue() == Value.QUEEN){
      return 10;
      }
    if(c.getValue() == Value.KING){
      return 10;
    }
    if(c.getValue() == Value.ACE){
      return 11;
    }
  return 0;
  }
                          
                       
  public static int countValues(CardPile total){
    
    //counting the total score of the cards in hand.
    
    int score = 0;
    
    int numOfAces = 0; //need to calculate Aces because Aces can have diff values and 2 Aces will bust
      
    for(int i = 0; i < total.getNumCards(); i++){
      total.get(i);
      score +=  getScore(total.get(i));
      
      if(getScore(total.get(i)) == 11){
        numOfAces++;
      }
    }
  
      while(score > 21 && numOfAces > 0){
        
        score -= 10;
      
        numOfAces--;
      }
      
      return score;
  }
                                  
  public static void playRound(CardPile deck){
    
    CardPile player = new CardPile();
    
    CardPile dealer = new CardPile();
   
    
    player.addToBottom(deck.remove(0));
    dealer.addToBottom(deck.remove(0));
    player.addToBottom(deck.remove(0));
    dealer.addToBottom(deck.remove(0));
    
    System.out.println("Player: ");
    System.out.println(player);
    System.out.println("Dealer ");
    System.out.println(dealer.get(1));
    
   
    Scanner sc = new Scanner(System.in);
     String input = sc.next();
    while(!input.equals("STAY")|| !input.equals("HIT")){
    System.out.println("Would you like to HIT or STAY? ");
    
    
    if(input.equals("HIT")){
      player.addToBottom(deck.remove(0));
      System.out.println(player);
    }
    if(input.equals("STAY")){
      if(countValues(dealer) < 18){
        dealer.addToBottom(deck.remove(0));
      System.out.println(dealer);
      
      
      if(countValues(player) > countValues(dealer)){
        System.out.println("Player Wins");
      }
      else if(countValues(player) == countValues(dealer)){
        System.out.println("Tie");
      }
      else{
        System.out.println("Dealer Wins");
      
       }
      }
    }
    }
  } 
}