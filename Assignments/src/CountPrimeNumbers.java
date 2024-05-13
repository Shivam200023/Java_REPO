import java.util.Scanner;

public class CountPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the elements of the array
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Count prime numbers in the array
        int count = countPrimes(numbers);
        System.out.println("Number of prime numbers in the array: " + count);

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
}
