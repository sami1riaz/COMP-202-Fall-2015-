import java.util.Random;
public class Cryptography1 
{
  public static void main(String[] args) 
  {
    String encoded = encrypt("Hi my name is", 5);
    System.out.println(encoded);
    System.out.println(crackCyphar(encoded, 26));
    //System.out.println(encrypt("ABCD", 4));
    System.out.println(encrypt("ABC", -1));
    //System.out.println(encrypt("ABC", -4));
    //System.out.println(encrypt("ABC", -30));
    //System.out.println(encrypt("####", -30));
    System.out.println(permuteEncrypt("abca"));
    
  }
  
  public static String encrypt(String originalMessage, int shift)
  {
    String encryptedMessage = "";
    for (int i = 0; i < originalMessage.length(); i++)
    {
      char latest = originalMessage.charAt(i);
     // is it uppercase?
      if  (latest >= 'A' && latest <= 'Z') {
       // add shift to it. Then normalize it so that it's between A and Z still. 
       int letterCount = (latest - 'A'); 
       // Add the shift and take modulus to put it back between 0 and 25.
       int encrypted = (letterCount + shift) % 26;
       
       // if result is less than 0 then this is a negative number. add 26 to it
       if (encrypted < 0)
       {
        encrypted = encrypted + 26; 
       }
    
       // Now add back the letter A. Store into latest
       latest = (char)(encrypted + 'A');
      }
      else if (latest >='a' && latest <= 'z')
      {
       // same idea, but starting with 'a'
        int letterCount = latest - 'a';
        int encrypted = (letterCount + shift) % 26;

       // if encrypted is less than 0 then this is a negative number. add 26 to it
       if (encrypted < 0)
       {
        encrypted = encrypted + 26; 
       }

        latest = (char)(encrypted + 'a');
      }
      
      encryptedMessage = encryptedMessage + latest;
    }
    
    return encryptedMessage;
  }
  
  public static String decrypt(String originalMessage, int shift)
  {
   return encrypt(originalMessage, -shift); 
  }
  
  public static String crackCyphar(String encoded, int numLetters)
  {
   int maxOverlapSoFar = 0;
   String bestGuessSoFar = "";
   for (int i = 0; i < numLetters; i++)
   {
    String decrypted = decrypt(encoded, i); 
    int wordCounts = SentenceChecker.countEnglishWords(decrypted);
    if (wordCounts > maxOverlapSoFar)
    {
      maxOverlapSoFar = wordCounts;
      bestGuessSoFar = decrypted;
    }
   }
   
   return bestGuessSoFar;
  }
  
  public static char[] generatePermutation()
  {
    char[] random = new char[26];
   for (int i = 0; i < 26; i++)
   {
     random[i] = (char)('A' + i);
   }
   
   shuffle(random);
   
   return random;
  }
  
  public static void shuffle(char[] numbers)
  {
   int count = (int)Math.pow(numbers.length, 4);
   int seed = 12345;
   Random r = new Random(12345);
   for (int i = 0; i < count; i++)
   {
    int first = r.nextInt(numbers.length);
    int second = r.nextInt(numbers.length);
    char temp = numbers[first];
    numbers[first] = numbers[second];
    numbers[second] = temp;
   }
  }
  
  public static String permuteEncrypt(String message)
  {
   char[] permutation = generatePermutation();
      
   String builder = "";
   for (int i = 0; i < message.length(); i++)
   {
     if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z')
     {
    builder = builder + permutation[message.charAt(i) - 'A']; 
     }
     else if (message.charAt(i) >= 'a' && message.charAt(i) <= 'z')
     {
    builder = builder + permutation[message.charAt(i) - 'a']; 
       
     }
     else {
      builder = builder + message.charAt(i); 
     }
   }
   return builder;
  }
}