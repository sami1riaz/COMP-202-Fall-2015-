public class A1WQ6 {
  public static void main(String[] args) {
   
     
    
    int x = 3;
    int y = 4;
    
    System.out.println( x + " " + y);
    
    swap(x, y);
      
  }
  
  public static void swap(int x, int y){
  int temp = x;
  x = y;
  y = temp;
  System.out.println( x + " " + y);
  }
}