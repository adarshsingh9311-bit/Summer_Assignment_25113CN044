import java.util.*;

public class multiplication {
    public static void main(String[] args) {

         // input
        try ( Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            for(int i=1; i<11 ; i++){

                System.out.println(i*n);
            }
        }
    }
}

