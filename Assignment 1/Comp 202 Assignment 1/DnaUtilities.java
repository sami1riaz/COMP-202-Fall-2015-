import java.util.Scanner;

public class DnaUtilities {
  
  public static void main(String[] args) {
    
    //Test for 3.1
    Scanner sc = new Scanner(System.in);
    char base = sc.next(".").charAt(0);
    
    if(isValidBase(base)){
      System.out.println("True");
    }
    else {
      System.out.println("False");
    }
    
    // Test for 3.2
    watsonCrickComplement(base);
    
    // Test for 3.3
    String userString = getStringInput();
    System.out.println("User entered: " + userString);
    
    String complementAnswer = watsonCrickTripletComplement(userString);
    System.out.println("Complete WatsonCrickComplement is " + complementAnswer);
    
    
  }
  
  // 3.1
  public static boolean isValidBase(char base) {
    
    if (base == 'A') {
      return true;
    }
    if (base == 'C') {
      return true;
    }
    if (base == 'G') {
      return true;
    }
    if (base == 'T') {
      return true;
    }
    else {
      return false;
    }
  }
  
// 3.2
  public static char watsonCrickComplement(char base) {
    
    if(isValidBase(base)) {
      if(base == 'A') {
        System.out.println("T");
      }
      if(base == 'T') {
        System.out.println("A");
      }
      if(base == 'C') {
        System.out.println("G");
      }
      if(base == 'G') {
        System.out.println("C");
      }
    }
    else {
      System.out.println(base);
      
    }
    return base;
  }
  
// 3.3
  public static String getStringInput () {
    System.out.println("Enter a String");
    Scanner scanner = new Scanner (System.in);
    String userString = scanner.nextLine();
    return userString;
  }
  
  public static String watsonCrickTripletComplement(String dnaSequence) {
    
    if (dnaSequence.length() == 3) {
      char firstChar = dnaSequence.charAt(0);
      char secondChar = dnaSequence.charAt(1);
      char thirdChar = dnaSequence.charAt(2);
      char firstComp, secondComp, thirdComp;
      if (isValidBase(firstChar)) {
        firstComp = watsonCrickComplement(firstChar);
        
        if (isValidBase(secondChar)) {
          secondComp = watsonCrickComplement(secondChar);
          
          if (isValidBase (thirdChar)) {
            thirdComp = watsonCrickComplement(thirdChar);
            
            //now create string from 3 chars
            String completeComplement = "" + firstComp + secondComp + thirdComp;
            return completeComplement;
          }
          else {
            return "";
          }
        }
        else {
          return "";
        }
      }
      else {
        return "";
      }
    }
    else {
      return "";
    }
  }
  
  
}

