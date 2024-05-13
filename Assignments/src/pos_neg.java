import java.util.*;

public class pos_neg {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.print("Enter  number:: ");
    int num1 = read.nextInt();

    if (num1<0){
      System.out.println(num1 + " is negative!");
    }else if(num1 == 0){
      System.out.println(num1 + " is Zero!");
    }else {
      System.out.println(num1 + " is positive!");
    }
  }
}
