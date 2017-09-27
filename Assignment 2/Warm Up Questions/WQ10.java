//x is a factor of y
//y is a multiple of x
//method calculate factors containing all factors of int n
//input int n
//return int[]

import java .util.Scanner;

public class WQ10 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number ");
    
    int n = sc.nextInt();
   
    countFactors(n);
  }
    public static int[] countFactors(int n){
   
      int[] array = new int[n];
      
      for(int i = 1; i <= n; i++) {
      if(n % i == 0) {
        if(i == 1) {
          System.out.println(i);
        }
        else {
          System.out.println(i);
        }
      }
    }
  return array;
    }
}