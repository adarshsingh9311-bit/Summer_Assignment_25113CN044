
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // input
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("the factorial is not for negative number");
            } else {
                int factorial = 1;
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }
                //output
                System.out.println("Factorial of " + n + " is: " + factorial);
            }
        }
    }
}
