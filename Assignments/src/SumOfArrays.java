public class SumOfArrays {
  public static void main(String[] args) {
      int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      int[][] array2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

      int rows = array1.length;
      int cols = array1[0].length;

      int[][] sumArray = new int[rows][cols];

      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              sumArray[i][j] = array1[i][j] + array2[i][j];
          }
      }

      System.out.println("Sum of the two arrays:");
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              System.out.print(sumArray[i][j] + " ");
          }
          System.out.println();
      }
  }
}