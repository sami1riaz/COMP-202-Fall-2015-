import java.util.Scanner;

public class WQ5 {
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    int n = sc.nextInt();
    
  isPrime(n);
   System.out.println(isPrime(n));
  }
    public static boolean isPrime(int n) {
    if (n <= 2) {
      return false;
    
    }
   
    int i = 2;
    while(i < n) {
      if(n % i == 0) {
        return false;
      }
    
    return true;
  }
    return true; 
    }
    
}