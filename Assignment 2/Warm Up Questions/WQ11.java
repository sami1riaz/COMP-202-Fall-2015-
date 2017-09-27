

import java.util.Scanner;

public class WQ11 {
  public static void main(String[] args) {
  
  //input String array
  // Output Strings on separate lines
  
  String[] something = new String[5];
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a string ");
  
  something[0] = sc.next(); 
  something[1] = sc.next();
  something[2] = sc.next();
  something[3] = sc.next();
  something[4] = sc.next();
  
  System.out.println(something[0]);
  System.out.println(something[1]);
  System.out.println(something[2]);
  System.out.println(something[3]);
  System.out.println(something[4]);
  }
}
  