//import java.util.Arrays;

public class Sudoku {
  public static void main(String[] args) {
    
    int[][] sudokuArray = new int[][] { // 2d array to create a 9*9 sudoku grid
      {5,3,4,6,7,8,9,1,2},              // [horizontal][vertical]
      {6,7,2,1,9,5,3,4,8},
      {1,9,8,3,4,2,5,6,7},
      {8,5,9,7,6,1,4,2,3},
      {4,2,6,8,5,3,7,9,1},
      {7,1,3,9,2,4,8,5,6},
      {9,6,1,5,3,7,2,8,4},
      {2,8,7,4,1,9,6,3,5},
      {3,4,5,2,8,6,1,7,9}
    };
    
    print(sudokuArray);
    
    System.out.println("\n");
    
    // int [] a = {1,5,6,3,8,7,9,2,4,};
    // sort(a); // calling method for part 1
    
    // for(int i = 0; i < a.length; i++){
    //  System.out.print(a[i]); // since sort is being called in uniqueEntries, array is printed in main method
    // }                      // to prevent sorted array being printed twice.     
    
    // System.out.println("\n");
    
    // uniqueEntries(a); //calling method for part 2
 
  
    // System.out.println(Arrays.toString(getColumn(sudokuArray, 1))); // prints the jth column
  
    System.out.print("Answer: ");
    System.out.println(isSudoku(sudokuArray));
  }
  
  public static boolean isSudoku(int[][] sudokuArray){
   
    
    for(int i = 0; i < sudokuArray.length; i++){
      for(int j = 0; j < sudokuArray.length; j++){
        if(sudokuArray[i][j] < 1){
          return false;
        }
      }
    }
    
    for(int i = 0; i < 7; i = i + 3){
      for(int j = 0; j < 7; j = j + 3){
        if(uniqueEntries(flatten(subGrid(sudokuArray, i, j, 3))) == false){
           return false;
        }
      }
    }
    
    if(sudokuArray.length != 9){
          return false;
    }
    for(int i = 0; i < sudokuArray.length; i++){
      
        if(sudokuArray[i].length * sudokuArray.length != 81){
          return false;
        }
    }
    for(int i = 0; i < sudokuArray.length; i++){
      for(int j = 0; j < sudokuArray.length; j++){
        if(sudokuArray[i][j] > 9){
          return false;
        }
      }
    }
    for(int i = 0; i < sudokuArray.length; i++)
      if(uniqueEntries(sudokuArray[i]) == false){
      return false;
    }
    for(int i = 0; i < sudokuArray.length; i++)
      if(uniqueEntries(getColumn(sudokuArray, i)) == false){
      return false;
    }
    return true;      
  }
       
  
  public static void print(int[][] sudokuArray){ //not necessary
    System.out.println();
    for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
        System.out.print(sudokuArray[i][j]);
      }
      System.out.println();
    }
  }

  
  public static int[] sort(int[] a) {
    
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a.length; j++) {
        if(a[i] < a[j]) {
          int temp;
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }     
    }
   return a;
  }
 
  
  public static boolean uniqueEntries(int[] a){
   
    for(int i = 1; i < a.length; i++){
      if(a[i - 1] == a[i]) {
        //System.out.println("false");
        return false;
      }
    }
   // System.out.println("true");
  return true;
  }
  
  
  public static int[] getColumn(int[][] array, int j){
    
    int[] column = new int[array.length];
    for(int i = 0; i < array.length; i++){
      column[i] = array[i][j];
      
    }
    return column;
  }
  
  public static int[] flatten(int[][] x){
    //Find total length of x
    int arrayLength = 0;
    for(int i = 0; i < x.length; i++){ 
      arrayLength = arrayLength + x[i].length;
    }
      int[] array = new int[arrayLength];
      
      int i = 0; 
      for (int j = 0; j < x.length; j++){
        for(int k = 0; k < x[j].length; k++){
          array[i] = x[j][k];
          i++;
        }
      }
  return array;
  }
  
  public static int[][] subGrid(int[][] input, int i, int j, int m) {
    int[][] grid = new int[m][m];
    
    for(int a = 0; a < m; a++){
      for(int b = 0; b < m; b++) {
      grid[a][b] = input[i+a][j+b];
      }
    }
    return grid;
  }
        
}
      
      
      
 


