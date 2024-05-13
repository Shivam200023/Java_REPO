
import java.util.*;

public class cel_far {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter temperature in Celcius:: ");

    double temp = reader.nextDouble();

    double fer = (temp*1.8)+32;

    System.out.println("Temperature in Fahrenheit:: "+fer);
  }
}
