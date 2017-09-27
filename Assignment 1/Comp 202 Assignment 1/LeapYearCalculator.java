import java.util.Scanner;

public class LeapYearCalculator{
  
  // main method won't be graded but important for testing methods
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);  // for checking isLeapYear method
    int year = sc.nextInt();              // for checking isLeapYear method
    
    printIsLeapYear(2000);                // test for printIsLeapYear
    printIsLeapYear(300);                 // test for printIsLeapYear
   
    // for checking isLeapYear method
    boolean leapYear;
    leapYear = isLeapYear(year); 
    
    if (leapYear == true) {                               
      System.out.println(year + " this is a leap year");  
    } 
    else {                                               
      System.out.println(year + " is NOT a leap year");  
      
     
      subsequentLeapYear(year);
     
    }
  }
  
  
  // Q2a
  public static void printIsLeapYear(int year) {
    
    
    if(year % 400 == 0) {
      System.out.println(year+ " is a leap year");
    }
    else if(year % 100 == 0) {
      System.out.println(year+ " is NOT a leap year");
    }
    else if(year % 4 == 0) { 
      System.out.println(year+ " is a leap year");
    }
    else {
      System.out.println(year+ " is NOT a leap year");
      
    }
  }
  
  
  // Q2b
  public static boolean isLeapYear(int year) {
    
    boolean isLeapYear;
    if (year % 400 == 0) {
      isLeapYear = true;
    }
    
    else if ((year % 100 == 0)) {
      isLeapYear = false;
    }
    
    else if (year % 4 == 0) {
      isLeapYear = true;
    }
    
    else { 
      isLeapYear = false;
    }
    
    return isLeapYear;
    
  }
 
 
// Q2c
  public static int subsequentLeapYear(int year) {
    
      if (isLeapYear(year) == true) {
        System.out.println(year + " is a leap year!");
        return nextLeapYear(year);
      }
      else {
        return nextLeapYear(year);
      }
    }
      
    public static int nextLeapYear(int year) {
      for (int i = 1; i < 9; i++) {
        int nextYear = year + i;
        if (isLeapYear(nextYear) == true) {
          System.out.println("NEXT leap yr: " + nextYear);
          return nextYear;
        }
      }
      System.out.println ("Sorry, not found");
      return 0;
  
}

}




