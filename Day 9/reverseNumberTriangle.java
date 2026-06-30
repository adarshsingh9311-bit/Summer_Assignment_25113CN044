

public class reverseNumberTriangle {
        public static void main(String[] args){

        int m =5;
         for(int i=m;i>=1;i--){         // Outer loop handles the number of row

            for(int j=1;j<=i;j++){       // inner loop for no. of number in each row
                System.out.print(j+"");
            }
            System.out.println();
         }
    }
}


