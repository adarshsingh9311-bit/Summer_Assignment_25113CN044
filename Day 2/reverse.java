import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        // input
       
        try (Scanner scanner = new Scanner(System.in)) {
             
         System.out.print("Enter a integer:");
           int n = scanner.nextInt();

           int reverse = 0;

           while(n!=0){

            int digit = n % 10;
            reverse = reverse * 10 + digit ;
            n/=10;
           }
             System.out.println("Reversed Number: " + reverse);
        }
    }
}
