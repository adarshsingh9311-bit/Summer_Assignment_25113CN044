public class recursionFibbonacci {

    // Recursive method to find the nth Fibonacci number
    public static int findFibonacci(int n) {
        // Base case: returns 0 for n=0 and 1 for n=1
        if (n <= 1) {
            return n;
        }
        // Recursive case: sum of the previous two numbers
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        
        // Loop to print the sequence
        for (int i = 0; i < terms; i++) {
            System.out.print(findFibonacci(i) + " ");
        }
    }
}

