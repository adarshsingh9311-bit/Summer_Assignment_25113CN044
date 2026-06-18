import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        // Create a Scanner object for user input using try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int num = scanner.nextInt();

            for(int i=1; i<=num;i++){

                if(num % i==0){
                    System.out.println(i+ "");
                }
            }
        }
    }
}
