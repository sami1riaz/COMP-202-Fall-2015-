  //Write a method that takes as input an int n and an int max and 
  //returns an int[].
  //The array you return should be an array of size n and 
  //filled with n random numbers between 0 and max, counting 0, but not counting max. 
  //Assume max is a positive number.
import java.util.Random;

public class WQ8 {
  public static void main(String[] args) {
    
    int n = 5;
    int max = 20;
      randomNumbers(n,max);
 
  }
   
  public static int[] randomNumbers(int n, int max) {
    int[] random = new int[n];
    Random rand = new Random();
   
    for(int i = 0; i < max; i++) {
     int num = rand.nextInt(max);
      
      System.out.print(random);
  
    }
    
    return random;
   
  }
}

