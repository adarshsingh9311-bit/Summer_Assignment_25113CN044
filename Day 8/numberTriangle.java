public class numberTriangle {
    public static void main(String[] args){

        int m =5;
         for(int i=1;i<=m;i++){         // Outer loop handles the number of row

            for(int j=1;j<=i;j++){       // inner loop for no. of number in each row
                System.out.print(j+"");
            }
            System.out.println();
         }
    }
}
