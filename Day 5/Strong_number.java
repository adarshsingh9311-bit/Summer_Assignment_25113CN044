import java.util.Scanner;

public class Strong_number {
     public static void main(String[] args) {
        // Create a Scanner object for user input using try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int num = scanner.nextInt();

          
            int sum = 0;
           // it is used to extract last digit of a number input by user
            for(int temp = num;temp>0;temp/=10){

                int factorial = 1;
                int digit = temp %10;
               // the for loop is used to add factorials of a number
                for(int i = 1; i<=digit;i++){

                    factorial *= i;
                }
        
                sum += factorial;

}

                if (sum==num) {
                   System.out.println(num+ "is a Strong number");
                    
                }
                else{
                    System.out.println(num+ "not a strong number");
                }
            }
        }
    }