public class MakingChange {
  
  public static void main(String[] args) { 
    
    int money = Integer.parseInt(args[0]);
    
    //int money = 146;              // for checking
    
    System.out.println("Change for " +money+ " cents is: "); 
    
    // initialize variables
    int toonies = 0;
    int loonies = 0;
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    int pennies = 0;
    
    int remainder;                 // temporary variable to store value of money
    
    // check for # of toonies
    if (money >= 200) {
      remainder = money % 200;
      toonies = money/200;
      money = remainder;
    }
    
    // check for # of loonies
     if (money >= 100) {
      remainder = money % 100;
      loonies = money/100;
      money = remainder;
    }
    
     // check for # of quarters
      if (money >= 25) {
      remainder = money % 25;
      quarters = money/25;
      money = remainder;
    }
    
      // check for # of dimes
       if (money >= 10) {
      remainder = money % 10;
      dimes = money/10;
      money = remainder;
    }
    
       // check for # of nickels
        if (money >= 5) {
      remainder = money % 5;
      nickels = money/5;
      money = remainder;
    }
    
        // check for # of pennies
         if (money >= 1) {
      remainder = money % 1;
      pennies = money/1;
      money = remainder;
    }
         
         
      System.out.println("Number of toonies is: " +toonies);
      System.out.println("Number of loonies is: " +loonies);
      System.out.println("Number of quarters is: " +quarters);
      System.out.println("Number of dimes is: " +dimes);
      System.out.println("Number of nickels is: " +nickels);                                                                                                              
      System.out.println("Number of pennies is: " +pennies);
         
  }
}
    