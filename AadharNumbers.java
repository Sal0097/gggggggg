public class AadharNumbers {
    public static void main(String[] args) {
        // Create an array to store 5 Aadhaar numbers
        long[] aadharNumbers = new long[5];

        // Add Aadhaar numbers to the array
        aadharNumbers[0] = 123456789012l;
        aadharNumbers[1] = 234567890123l;
        aadharNumbers[2] = 345678901234l;
        aadharNumbers[3] = 456789012345l;
        aadharNumbers[4] = 567890123456l;

        // Print each Aadhaar number
        for (int i = 0; i < aadharNumbers.length; i++) {
            System.out.println("Aadhaar number at index " + i + ": " + aadharNumbers[i]);
        }
    }
}