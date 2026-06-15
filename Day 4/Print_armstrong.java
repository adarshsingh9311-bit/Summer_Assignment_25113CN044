public class print_armstrong {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 500;

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + " are:");

        // For loop to iterate through the range of numbers
        for (int i = lowerBound; i <= upperBound; i++) {
            int originalNumber = i;
            int sum = 0;
            
            // 1. Find the total number of digits
         int digits = 0;
            for (int temp = i; temp != 0; temp /= 10) {
                digits++;
            }

            // 2. Calculate the sum of the powers of its digits
            for (int temp = i; temp != 0; temp /= 10) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, digits);
            }

            // 3. If the sum matches the original number, print it
            if (sum == originalNumber) {
                System.out.print(originalNumber + " ");
            }
        }
    }
}
