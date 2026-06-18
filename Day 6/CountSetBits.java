
public class CountSetBits {

public static int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        n &= (n - 1); // Clears the rightmost set bit
        count++;
    }
    return count;
}

public static void main(String[] args) {
        
    int i=8;

              System.out.println(countSetBits(i));
        }
    }

