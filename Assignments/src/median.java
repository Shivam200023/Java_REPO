//2.17
import java.util.Arrays;
import java.util.*;

public class median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the set
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input the elements of the set
        double[] numbers = new double[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sort the numbers
        Arrays.sort(numbers);

        // Find the median
        double median;
        if (n % 2 == 0) {
            // If even number of elements, average of two middle elements
            median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2;
        } else {
            // If odd number of elements, middle element
            median = numbers[n / 2];
        }

        // Display the median
        System.out.println("Median: " + median);

    }
}
