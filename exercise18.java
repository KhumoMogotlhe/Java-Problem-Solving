import java.util.Scanner;

public class exercise18 {
    //TODO: Write a Java program to convert an integer number to a binary number.
    public static void main(String[] args) {
        // Declare variables to store decimal number, quotient, and an array for binary digits
        int decNum, quote, i = 1, j;
        int binNum[] = new int[100];
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        decNum = scan.nextInt();

        // Initialize the quotient with the decimal number
        quote = decNum;

        // Convert the decimal number to binary and store binary digits
        while (quote != 0) {
            binNum[i++] = quote % 2;
            quote = quote / 2;
        }

        // Display the binary representation of the decimal number
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(binNum[j]);
        }
        System.out.print("\n");
    }

}
