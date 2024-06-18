import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

// TODO : Write a Java program that accepts four
//  integers from the user and prints equal if all four are equal, and not equal otherwise.
public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] question = {"first", "second", "third", "fourth"}; // array with questions
        int[] numbers = new int[4];
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the "+question[i]+" integer");
            numbers[i] = scanner.nextInt();

        }

        boolean equals = false; // set boolean to false
        int temp = numbers[0]; // the first number in n numbers
        for ( int number : numbers){ // loop through numbers
            if ( number == temp ) equals = true; // check if the 1st index is equals to whatever number
            else {
                temp = number; // if not
                equals = false; // set equals to false
                break;
            }
        }
        System.out.println("Equals :"+equals);
        System.out.println(Arrays.toString(numbers));
    }

}
