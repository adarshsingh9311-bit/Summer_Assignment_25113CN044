import java.util.Scanner;

public class palindrom {
    
    public static void main(String[] args) {
        // input
       
        try (Scanner scanner = new Scanner(System.in)) {
             
         System.out.print("Enter a integer:");
           int n = scanner.nextInt();

           int originalNumber = n;
           int reverse_number = 0;

           while(n>0){

            int lastDigit = n % 10 ;
            reverse_number = (reverse_number * 10) + lastDigit;
            n = n/10;

           }
           if(reverse_number == originalNumber ){

            System.out.print(originalNumber+" is a palidrome number");
           }
           else{
            System.out.print(originalNumber+" is not a palidrome number");
           }
}
    }
}