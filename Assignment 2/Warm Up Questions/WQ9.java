import java.util.Random;

public class WQ9 {
  public static void main(String[] args) {
    Random rand = new Random();
    int n[] = new int[10];
  
   
    for(int max = 51; max < 100; max++) {
    System.out.println(n[max]);
  }
    for(int min = 0; min > 50; min++) {
      System.out.println(n[min]);
  }
    for(int i = 0; i < 500; i++) {
      ++n[rand.nextInt(10)];
   }
  }
}
//do this again
//not working