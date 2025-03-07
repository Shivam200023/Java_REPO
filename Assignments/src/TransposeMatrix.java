public class TransposeMatrix {
  public static void main(String[] args) {
      // Define a matrix
      int[][] matrix = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };

      // Calculate and print the transpose of the matrix
      int[][] transpose = calculateTranspose(matrix);
      System.out.println("Transpose of the matrix:");
      printMatrix(transpose);
  }

  // Method to calculate the transpose of a matrix
  public static int[][] calculateTranspose(int[][] matrix) {
      int rows = matrix.length;
      int cols = matrix[0].length;
      int[][] transpose = new int[cols][rows];

      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              transpose[j][i] = matrix[i][j];
          }
      }
      return transpose;
  }

  // Method to print a matrix
  public static void printMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[0].length; j++) {
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }
  }
}
