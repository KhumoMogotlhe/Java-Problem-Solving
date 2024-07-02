import java.util.Scanner;

public class exercise12 {
    // TODO : convert a binary number to a decimal number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binaryNumber, decimalNumber = 0, j = 1, reminder;

        System.out.println("Input a binary number: ");
        binaryNumber = sc.nextLong();

        while (binaryNumber != 0){
            reminder = binaryNumber % 10;
            decimalNumber = decimalNumber + reminder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);
    }



}
