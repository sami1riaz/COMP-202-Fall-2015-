// Warm-up Question 8

// Now consider the same question except on a 3x3 matrix: 
//  ( a b c )
//  ( d e f )
//  ( g h i ) 
// Write a Java program that first reads 9 doubles, representing the 9 letters above from the keyboard. 
// It then outputs to the screen the determinant of the matrix. 
// For a 3x3 matrix, the determinant is always equal to a(i*e - f*h) - b(d*i- f*g) + c(d*h - e*g)

import java.util.Scanner;

public class determinant2 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);          // sc = scanner variable
    
    double a = sc.nextDouble();                   // read value of a from keyboard
    double b = sc.nextDouble();                   // read value of b from keyboard
    double c = sc.nextDouble();                   // read value of c from keyboard
    double d = sc.nextDouble();                   // read value of d from keyboard
    double e = sc.nextDouble();                   // read value of e from keyboard
    double f = sc.nextDouble();                   // read value of f from keyboard
    double g = sc.nextDouble();                   // read value of g from keyboard
    double h = sc.nextDouble();                   // read value of h from keyboard
    double i = sc.nextDouble();                   // read value of i from keyboard
    
    System.out.println("( "+a+ " " +b+ " " +c+ ")");      // print matrix
    System.out.println("( "+d+ " " +e+ " " +f+ ")");
    System.out.println("( "+g+ " " +h+ " " +i+ ")");     
    
    double determinant = a*(i*e - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    System.out.println(determinant);
    
  }
  
}
   
    
    
    
    
    