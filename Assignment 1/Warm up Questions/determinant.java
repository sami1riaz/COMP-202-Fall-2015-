// Warm-up Question 7

// Consider the following 2-d matrix:  ( a b )
//                                     ( c d )   
// Write a Java program that first reads 4 doubles, representing a,b,c, and d from the keyboard. 
// It then outputs to the screen the determinant of the matrix. For a 2x2 matrix, the determinant is always equal to a*d - b*c

import java.util.Scanner;                        // import scanner library for reading from keyboard

public class determinant {
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);          // sc = scanner variable
    
    double a = sc.nextDouble();                   // read value of a from keyboard
    double b = sc.nextDouble();                   // read value of b from keyboard
    double c = sc.nextDouble();                   // read value of c from keyboard
    double d = sc.nextDouble();                   // read value of d from keyboard
    
    System.out.println("( "+a+ " " +b+ ")");      // print matrix
    System.out.println("( "+c+ " " +d+ ")");
    
    double determinant = a*d - b*c;              // calculate determinant
    System.out.println(determinant);             // print determinant
  }
}
    