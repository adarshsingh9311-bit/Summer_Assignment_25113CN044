import java.util.Scanner;

public class largest_prime_factor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int num = scanner.nextInt();

            if (num <= 1) {
                System.out.println("No prime factors.");
                return;
            }

            long largestPrime = 0;
            int n = num;

            for (int i = 2; (long) i * i <= n; i++) {
                while (n % i == 0) {
                    largestPrime = i;
                    n /= i;
                }
            }

            if (n > 1) {
                largestPrime = n;
            }

            System.out.println("Largest prime factor: " + largestPrime);
        }
    }
}


