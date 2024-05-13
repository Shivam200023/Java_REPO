public class SumOfOddNumbers {
  public static void main(String[] args) {
      int[][] array = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };

      int sum = 0;

      
      for (int[] row : array) {
          for (int num : row) {
              if (num % 2 != 0) {
                  sum += num;
              }
          }
      }

      System.out.println("Sum of odd numbers in the 2D array: " + sum);
  }
}