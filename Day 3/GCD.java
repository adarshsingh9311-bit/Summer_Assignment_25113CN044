import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
            
        System.out.print("Enter first number:");
            int m = scanner.nextInt();
        System.out.print("Enter second number:");
            int n = scanner.nextInt();

            int gcd=0;
            for(int i=1;i<=n && i<=m ;i++){

                if(m%i==0 && n%i==0){
                    gcd=i;
                }
            }

            System.out.print("GCD=" + gcd);
        }
        }   

}
