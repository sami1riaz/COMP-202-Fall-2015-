import java.util.Scanner;

public class A1WQ7 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = sc.nextDouble();
    double e = sc.nextDouble();
    double f = sc.nextDouble();
    double g = sc.nextDouble();
    double h = sc.nextDouble();
    double i = sc.nextDouble();
    
    double m1 = (a * (i*e - f*h));
    double m2 = (b * (d*i - f*g));  
    double m3 = (c * (h*d - e*g));  
    double det = m1 - m2 + m3;
    System.out.println(det);
  }
}