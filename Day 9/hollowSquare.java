import java.util.Scanner;

public class hollowSquare {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner (System.in)){
            System.out.println("Enter number of rows:");
            int m = scanner.nextInt();
            
            for(int i=1;i<=m;i++){

                for(int j=1;j<=m;j++){
              // Print star if on edge, otherwise space
                    if(i==1||i==m||j==1||j==m){

                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                    System.out.println(""); // move cursor for next row
                
              


            }

            
        }
    }
}
