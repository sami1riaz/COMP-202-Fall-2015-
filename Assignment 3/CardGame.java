public class CardGame {
  public static void main(String[] args) { 

    int numofPlayers = Integer.parseInt(args[0]);
    
    CardPile gameDeck = CardPile.makeFullDeck();
    
      CardPile [] players = new CardPile[numofPlayers];
    
    for (int i = 0; i < numofPlayers; i++) {
      players[i]= new CardPile();
    }
    
    Card test = new Card(Suit.DIAMONDS, Value.SEVEN);
    
    //while(!gameDeck.isEmpty()){
      for(int i = 0; i < players.length; i++){
        if(!gameDeck.isEmpty()){
          players[i].addToBottom(gameDeck.remove(0));
          System.out.println("ran");
          i = 0;
        }//Running out of memory here. 
        //gameDeck.remove(0) is working and gameDeck.isEmpty() is working. idk why its running out of memory then, possibly an addToBottom() error, but 
        //it should work as it does below when I check for temp11.
      }
    //}
    
    /*for (int i= 0; i < 52; i++) {
      int numberofnum = i % numofPlayers;
      CardPile currentPlayer = players[i % numofPlayers];
      Card nextCard = gameDeck.get(i);
      players[numberofnum].addToBottom(nextCard); // add nextCard to currentPlayer's pile //; 

    }*/
    //Card temp11 = new Card(Suit.SPADES, Value.ACE);
    //players[0].addToBottom(temp11);
    for (int i = 0; i < numofPlayers; i++) {
      players[i].toString();
      if (players[i].find(Suit.SPADES, Value.ACE) != -1) {
        System.out.println("Player #" + i + " has won!");
      }
    }
  }
}
