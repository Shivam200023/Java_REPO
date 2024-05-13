
import java.util.*;
public class far_cel {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter temperature in Fahrenheit:: ");

    double temp = reader.nextDouble();
    double cel = (temp-32)*5/9;

    System.out.print("Temperature in Celcius::"+cel);
  }
}
