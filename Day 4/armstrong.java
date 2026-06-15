import java.util.Scanner;
public class armstrong {
     public static void main(String[] args){
  try (Scanner scanner = new Scanner(System.in)) {
            
        System.out.print("Enter  number:");
            int n = scanner.nextInt();

            int originalNumber = n;
            int sum=0;

            int digits = String.valueOf(n).length();// find total number of digits

            for(int temp = n;temp!=0;temp/=10){

                int remainder = temp%10;
                sum += Math.pow(remainder,digits);
            }
            if(sum==originalNumber){
                System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
}
    
     