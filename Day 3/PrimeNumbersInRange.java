import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
 try (Scanner scanner = new Scanner(System.in)) {

    // starting number in range
            System.out.print("Enter a number:");
            int start = scanner.nextInt();

            // ending number in range
        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();
        
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
     
    }
    }

     static boolean isPrime(int num) {
        
        // number less than one will not be prime number
        if (num <= 1) {
            return false;
        }
        
        // Check for factors from 2 up to the square root of the number
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        
        return true; 
    }
}
