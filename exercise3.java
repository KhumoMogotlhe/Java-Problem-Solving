import java.util.Scanner;

public class exercise3 {
    // TODO 3. Write a Java program to divide two numbers and print them on the screen.
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int diff = x / y;
        System.out.println(diff);

        // TODO 4. Write a Java program to print the results of the following operations.
        // Test Data:
        // a. -5 + 8 * 6
        // b. (55+9) % 9
        // c. 20 + -3*5 / 8
        // d. 5 + 15 / 3 * 2 - 8 %
        int results1 = -5 + 8 * 6;
        int results2 = (55+9) % 9;
        int results3 = 20 + -3*5 / 8;
        int results4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(results1);
        System.out.println(results2);
        System.out.println(results3);
        System.out.println(results4);

        // TODO 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
        //Test Data:
        //Input first number: 25
        //Input second number: 5
        int product = 25 * 5;
        System.out.println(product);

        // TODO 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        // Input a number: 8
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Input a number: ");

        // Read and store the input number
        int num1 = in.nextInt();

        // Use a loop to calculate and print the multiplication table for the input number
        for (int i = 0; i < 10; i++) {
            // Calculate and print the result of num1 multiplied by (i+1)
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }
    }



}
