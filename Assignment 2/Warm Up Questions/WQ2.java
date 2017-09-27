import java.util.Scanner;

public class WQ2 {
  public static void main(String[] args) {
   
     Scanner keyboard = new Scanner(System.in);
        System.out.println("Give a string "); //entered string
        String input = keyboard.nextLine();
  
        countUpperCase(input);
  }
  
        public static int countUpperCase(String input) {
        
        int upperCaseCounter= 0; //variable to keep track of uppercase letters counted
        

        for (int i = 0; i < input.length(); i++) { 
//loop so that all the uppercase letters can be counted till the string length is finished
        char ch = input.charAt(i); // every letter in the string is checked one by one because of this

//The method charAt(int index) returns the character at the specified index.
//The index value should lie between 0 and length()-1.
//For e.g. s.charAt(0) would return the first character of the string ÒsÓ.
       
        if(ch >= 'A' && ch <= 'Z') { // if the letter is uppercase, check for next uppercase letter and update counter
          upperCaseCounter++;
        }
        
        }
  System.out.println("Number of Uppercase letters is  "+ upperCaseCounter);
  return upperCaseCounter;
        }
}
    

    