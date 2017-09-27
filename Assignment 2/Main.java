public class caesarEncrypt { //why does the class name have to be the same as new "Main" below)
  
  char[] ABC = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  
  public static void main(String[] args) { 
    new caesarEncrypt("hello", 3);
  }
  
  
  public caesarEncrypt(String originalMessage, int shift) { //dont understand this
    
    String output = caesarShift(originalMessage, shift);
    
    System.out.println(output);
    System.out.println("");
    
    System.out.println(caesarShift(output, -shift));
  }
 
  
  public String caesarShift(String originalMessage, int shift) {
  char[] useMe = originalMessage.toCharArray();
  
  String output = "";
  
  for(int i = 0; i != useMe.length; i++) {
    if( Character.isUpperCase(useMe[i])){
    output += Character.toUpperCase(calcShift(getIndex(useMe[i]), shift));
        }
    else {
      output += calcShift(getIndex(useMe[i]), shift);
    }
  }
return output;
}
  

 public int getIndex(char letter) {
  
  if(Character.isUpperCase(letter)){
     letter = Character.toLowerCase(letter);
  }
  
  for(int i = 0;i != ABC.length; i++) {
    if(ABC[i] == letter) {
    
      return i;
    }
  }
  return 999;
}


public char calcShift(int index, int shift) {
  if(index + shift < 0) {
    int newIndex = 26 + (index + shift);
    return ABC[newIndex];
  }
  
  if(index + shift > 25) {
    int newIndex = (index + shift) - 26;
    return ABC[index + shift];
  }
  
  if(index + shift < 25 && index + shift > 0) {
    return ABC[index + shift];
  }
  
  if(index + shift == 0) {
    return ABC[index + shift];
  }
  return 'X';
}
  }




                                    
                                    
  
  
  
  
      