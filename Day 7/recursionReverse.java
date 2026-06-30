public class recursionReverse{

     // Wrapper method for easy execution
    public static int reverse(int number) {
        return reverseHelper(number, 0);
    }

    // Recursive helper method
    private static int reverseHelper(int num, int reversed) {
        // Base case: when the remaining number becomes 0
        if (num == 0) {
            return reversed;
        }
        
        // Isolate the last digit of the number
        int lastDigit = num % 10;
        
        // Push the last digit to the end of the building reversed value
        int updatedReversed = (reversed * 10) + lastDigit;
        
        // Recursive call with the remaining digits
        return reverseHelper(num / 10, updatedReversed);
    }

    public static void main(String[] args) {
        int originalNumber = 54321;
        int reversedNumber = reverse(originalNumber);
        
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}