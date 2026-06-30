public class repeatedCharacterPattern {
    public static void main(String[] args){

        int m =5;
        char alphabet = 'A'; 
         
          for(int i=1;i<=m;i++){         // Outer loop handles the number of row
        

            // Inner loop handles the characters printed in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet + " ");
               
            }
             alphabet++; // Move to the next character 
            System.out.println(); // Move to the next line
        }
    }
}


