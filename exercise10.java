import java.util.Scanner;

public class exercise10 {
    // TODO: 3. Write a Java program that takes three numbers
    //  from the user and prints the greatest number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the third number");
        int num3 = Integer.parseInt(scanner.nextLine());

        if ( num1 > num2 && num1 > num3 ){
            System.out.println("The greatest number is " + num1);
        } else if ( num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is "+ num2);
        } else {
            System.out.println("The greatest number is " + num3);
        }
    }
}
