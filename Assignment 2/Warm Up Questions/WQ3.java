import java.util.Scanner;

public class WQ3 {
  public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a String ");
      String s = reader.nextLine();
  
  toUpperCase(s);
  }
      public static String toUpperCase(String s) {
      for(int i = 0; i < s.length(); i++) {
      
        char ch = s.charAt(i); // new variable created which checks the below statement for every char in s
        if('a' <= ch && ch <= 'z') {
          ch += 'A' - 'a'; //+=Add AND assignment operator, 
                           //It adds right operand to the left operand and assign the result to left operand.

                            //Example: C += A is equivalent to C = C + A
          
         
        }
      System.out.print(ch);
      }
      
  return s;
      }
}
          
    
    