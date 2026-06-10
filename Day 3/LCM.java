import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
        System.out.print("Enter first number:");
            int m = scanner.nextInt();
        System.out.print("Enter second number:");
            int n = scanner.nextInt();

            int max = (m > n) ? m : n; // ternary operator
            int lcm = max;
            
            while (true) {

             if (lcm % m == 0 && lcm % n == 0){

                System.out.println("LCM of entered numbers is:" + lcm);
                 break;}
                lcm++;
              
            }
        }

    }

}
