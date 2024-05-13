import java.util.*;
public class swap_2 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter 1st number = ");
    int num1 = reader.nextInt();
    System.out.print("Enter 2nd number = ");
    int num2 = reader.nextInt();

    int temp = num1;
    num1 = num2;
    num2 = temp;

    System.out.println("After Swap :: "+ num1 + " " + num2);

  }
}
