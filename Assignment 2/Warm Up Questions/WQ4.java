import java.util.Scanner;

public class WQ4 {
  public static void main(String[] args) {
    

 
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a String ");
     String original = reader.nextLine();
    
     reverseString(original);
  }
     public static String reverseString(String original) {
    String reverse= " ";
    int len = original.length();
    
    for(int i = len -1; i >= 0; i--) //
      
      reverse = reverse + original.charAt(i);

     System.out.println("Original String is: " + original);
     System.out.println("Reverse of String is: " + reverse);
    
     return reverse;
     }
}