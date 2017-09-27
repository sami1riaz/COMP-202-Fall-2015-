import java.util.Random;


public class Cryptography {
  private static char[] abc = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  private static char[] ABC = { 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
  
 public static void main (String[] args) {
  System.out.println("Solution Q1");
  String a1 = caesarEncrypt("Give Me Easier Assignments", 3);
  System.out.println("A1: " +a1);
  
  System.out.println("\nSolution Q2");
  String a2 = caesarDecrypt(a1, 3);
  System.out.println("A1: " +a2);
  
  System.out.println("\nSolution to Q3\n");
  String mostWordsDecrypted = crackCipher ("J Ibwf puifs Bttjhonfout upp Hvzt", abc.length+1);
  
  char[] n = {'A','B','C','D','E'};
  shuffle(n);
        
  generatePermutation();
  System.out.println("\nSolution to Q5\n");
  System.out.println(generatePermutation());
 }
 
// Method for Q3
 public static String crackCipher (String encoded, int numberLetters) {
  int[] wordsArray = new int[27];
  int highestNumberOfWords = 0;
  String mostWords = "";
  
  for (int i = 0; i < numberLetters - 1; i ++) {
   String decryptedWord = caesarDecrypt(encoded, i);
   int count = SentenceChecker.countEnglishWords(decryptedWord);
   wordsArray[i] = count;
   
   if (i > 0) {
    //if current number is greater than previous highest number
    if (wordsArray[i] > highestNumberOfWords) {
     highestNumberOfWords = wordsArray[i];
     mostWords = decryptedWord;
    }
   }
   //if the first element is highest number
   else {
    highestNumberOfWords = wordsArray[i];
    mostWords = decryptedWord;
   }
   System.out.println("Decrypted String: " +decryptedWord+ ".   Number of English Words? = " + count); 
  }
  System.out.println("Highest number of words in a string is " +highestNumberOfWords+ ": " +mostWords);
  return mostWords;
 }
 
 public static void test(String originalMessage, int shift) {
  caesarEncrypt(originalMessage, shift);
  caesarDecrypt(originalMessage, shift);
 }
 
// Method for Q1
 public static String caesarEncrypt (String originalMessage, int shift) {
  return caesarShift(originalMessage, shift);
 }
 
 // Method for Q2
 public static String caesarDecrypt (String originalMessage, int shift) {
  return caesarShift(originalMessage, -shift);
 }
 
 //convert to upperCase character
 public static char toUpperCase (char c) {
  for (int i = 0; i < abc.length - 1; i++) {
   if (abc[i] == c) {
    return ABC[i];
   }
  }
  return c;
 }
 
 // Check if Upper Case character
 public static boolean isUpperCase(char c) {
  if ((c >= 'A') && (c <= 'Z')) {
   return true;
  }
  else {
   return false;
  }
 }
 
 // Check if lower case Character
 public static boolean isLowerCase (char c) {
  if ((c >= 'a') && (c <= 'z')) {
   return true;
  }
  else {
   return false;
  }
 }
 
 // Converting String into seperate chars
  public static String caesarShift(String originalMessage, int shift) {
    char[] useMe = originalMessage.toCharArray();
    
    String output = "";
    
    for(int i = 0; i != useMe.length; i++) {
     //if an uppercase character
     if(isUpperCase(useMe[i])){
      output += toUpperCase(calcShift(getIndex(useMe[i]), shift));
          }
     //if lower case character
     else if (isLowerCase(useMe[i])) {
      output += calcShift(getIndex(useMe[i]), shift);
     }
     //if any other character, dont shift
     else {
      output += useMe[i];
     }
    }
    return output;
  }
  
  public static int getIndex(char letter) {
   // if uppercase char
    if(isUpperCase(letter)){
     for(int i = 0;i != ABC.length; i++) {
      if(ABC[i] == letter) {
       return i;
      }
     }
    }
    // or if char is lower case
    else {
     for(int i = 0;i != abc.length; i++) {
      if(abc[i] == letter) {
       return i;
      }
     }
    }
    return 999;
  }

  public static char calcShift(int index, int shift) {
  // Method for looping shifts
    
    // Loop to Z from A
    if(index + shift < 0) {
      int newIndex = 26 + (index + shift);
      return abc[newIndex];
    
    }
    
    // Loop to A from Z
    if(index + shift > 25) {
      int newIndex = (index + shift) - 26;
      return abc[newIndex];
    }
    
    // No Looping done
    if(index + shift < 25 && index + shift > 0) {
      return abc[index + shift];
    }
    
    // Landed on A
    if(index + shift == 0) {
      return abc[index + shift];
    }
    return 'X';
  }

public static void shuffle(char[] n)
   {
       Random generator = new Random(12345);
       int numOfShuffles = (int)Math.pow(n.length, 4);
       
       for(int i = 0; i < numOfShuffles; i++)
       {
           // so now we have to select the 2 random indices that we want to swap
           int firstIndex = generator.nextInt(n.length);
           int secondIndex = generator.nextInt(n.length);
           
           // now we have to make the actual swap
           // we want to swap input[firstIndex] and input[secondIndex]
           // but if I set one equal to the other, I lose one of the values.
           
           char temp = n[firstIndex];
           n[firstIndex] = n[secondIndex];
           n[secondIndex] = temp;
       }
} 
       public static char[] generatePermutation(){
       
         char [] X =  { 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
         shuffle(X); 
         
   return X;
       }
      // Q6 attempt
      
      // public static String permuteEncrypt(String input) {
        // generatePermutation();
         
      //    input = ("Hello World");
         
          
          // I've been stuck on this question for 3 hours now and the deadline is in 1 hour
          // but I have other courses and quizzes to study for
          // Therefore I have not been able to complete this assignment
          // Hopefully this will not happen again.Sorry. 
          // Next time I will try to manage my time better.
          // (Please don't cut too many marks. My gpa has been pretty good so far)
          // Please do not give questions like this in the midterm. 
          // It takes ages to solve one. I'm just a beginner.
             
           
           
       }

