import java.util.Arrays;
import java.util.Scanner;

public class exercise11 {
    // TODO: 3. Write a Java program that takes three numbers
    //  from the user and prints the greatest number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = {"first", "second", "third"};
        int[] numbers = new int[3];
        int num1 = numbers[0]; // initialising the big number
        System.out.println(Arrays.toString(numbers));
        for ( int i = 0; i < 3; i++){
            System.out.println("Enter the " + input[i] + " question:");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for ( int number : numbers){
            if ( number > num1 )
                num1 = number;
        }
        System.out.println("The greatest number is " + num1);
    }
}
