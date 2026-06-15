import java.util.Scanner;

public class fibbonacci_nterm {
     public static int getNthFibonacci(int n) {
     
        if(n<=0){
            return 0;
        } 
        else if(n==1){
            return 1;
        }    
             int first = 0;
            int second = 1;
            int fib= 0;

            for(int i=2;i<=n;i++){

                fib=first+second;
                first=second;
                second=fib;
            }
    
            return fib;
}

public static void main(String[] args){

    try (Scanner scanner = new Scanner(System.in)) {
            
        System.out.print("Enter  number:");
            int n = scanner.nextInt();
        System.out.println("The " + n + "th Fibonacci number is: " + getNthFibonacci(n));
    }
}
}
