import java.util.Scanner;

public class product_digit {
    public static void main(String[] args) {
        // input
       
        try (Scanner scanner = new Scanner(System.in)) {
             
         System.out.print("Enter a integer:");
           int n = scanner.nextInt();

            int product = 1;
        
        int temp = Math.abs(n); 
        
        while (temp > 0) {
            product *= temp % 10; 
            temp /= 10;       
    
}
          System.out.println("product of digits: " + product);
        } 
     }
    }
