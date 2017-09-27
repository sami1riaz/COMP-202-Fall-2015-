// Warm-up Question 6

// Write a method swap which takes as input two int values x and y. Your method should do 3 things: 
// 1. Print the value of x and y 
// 2. Swap the values of the variables x and y, so that whatever was in x is now in y and whatever was in y is now in x 
// 3. Print the value of x and y again. 
// For example, if your method is called as follows: swap(3,4) the effect of calling your method should be the following printing 
// inside swap: x is: 3, y is: 4 
// inside swap: x is: 4, y is: 3 
// Now, create 2 int (integer) variables in the main method. Call them x and y. Assign values to them and call the swap method you wrote in the previous part.
// After calling the swap() method- inside the main method- print the values of x and y. Are they different than before? Why or why not?

public class swap {
  
  public static void swap(int x, int y) {                         // swap method which takes two ints, x and y, as inputs
    
    System.out.println("inside swap: x is: " +x+ ", y is: " +y);  // Print original values 
    int temp = x;                                                 // store value of x in temporary variable
    x = y;                                                        // store value of y in x
    y = temp;                                                     // store value of temp in y
    System.out.println("inside swap: x is: " +x+ ", y is: " +y);
    
  }
  
  public static void main(String[] args) {
    
    int x = 3;      // declare and initialize x to 3
    int y = 4;      // declare and initialize y to 4
    swap(x,y);      // call swap method
 
    System.out.println(x);
    System.out.println(y);
    
    // The values of x and y are the same because the print statement is in the main method and the two values are not being swapped in the main method
 }

}
    