import java.util.Scanner;

public class count {
   public static void main(String[] args) {
        // input
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a integer:");
            int n = scanner.nextInt();

            int count = 0;
            
            if (n == 0) {
                count = 1;
            } else {
                // it is used to convert negative number as positive number 
                n = Math.abs(n);
                while (n > 0) {
                   n /= 10;
                   count++;
            
            }
            }
               // output
            System.out.println("Digit count: " + count);
        }
    }
}
