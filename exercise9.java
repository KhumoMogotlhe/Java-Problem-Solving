import java.util.Scanner;

public class exercise9 {
    //TODO : 1. Write a Java program to get a number from
    // the user and print whether it is positive or negative.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = Integer.parseInt(scanner.nextLine());

        if (input>0 ){
            System.out.println("Number is positive");
        } else if (input < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }

}
