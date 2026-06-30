import java.util.Scanner;

public class recursionSumDigit {

    public static int sumOfDigits(int n) {
        // Base case: if the number becomes 0, return 0
        if (n == 0) {
            return 0;
        }

        // Recursive case: last digit + sum of remaining digits
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        // input
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            int result = sumOfDigits(number);
            System.out.println("The sum of digits in " + number + " is: " + result);
        }
    }
}

