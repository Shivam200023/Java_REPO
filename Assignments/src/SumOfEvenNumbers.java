public class SumOfEvenNumbers {
  public static void main(String[] args) {
      int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int sumOfEvens = 0;

     
      for (int num : array) {
          if (num % 2 == 0) {
              sumOfEvens += num;
          }
      }

      System.out.println("Sum of even numbers: " + sumOfEvens);
  }
}