import java.util.Scanner;

public class xPowerN {

    public double myPower(double x, int n) {
        if (n < 0) {
            return 1.0 / helper(x, n);
        }
        return helper(x, n);
    }

    public double helper(double x, int n) {
        if (n == 0) return 1.0;
        if (n == 1) return x;
        if (n % 2 == 0) {
            return helper(x * x, n / 2);
        }
        return x * helper(x * x, n / 2);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter base (x): ");
            double x = scanner.nextDouble();
            System.out.print("Enter exponent (n): ");
            int n = scanner.nextInt();
            xPowerN powerCalc = new xPowerN();
            System.out.println(powerCalc.myPower(x, n));
        }
    }
}
    
