public class ArrayRange {
  public static void main(String[] args) {
      int[] array = {5, 10, 15, 20, 25};
      
      int min = array[0];
      int max = array[0];
    
      for (int i = 1; i < array.length; i++) {
          if (array[i] < min) {
              min = array[i];
          }
          if (array[i] > max) {
              max = array[i];
          }
      }
     
      int range = max - min;
      
      System.out.println("Array Range: " + range);
  }
}