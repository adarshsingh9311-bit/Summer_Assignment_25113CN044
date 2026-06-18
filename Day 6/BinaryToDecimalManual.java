public class BinaryToDecimalManual {
    public static void main(String[] args) {
        String binaryString = "1011";
        int decimal = 0;
        int base = 1; // Represents 2^0

        // Traverse the string from right to left
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += base;
            }
            base = base * 2; // Move to the next power of 2
        }

        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimal);
    }
}
