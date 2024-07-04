import java.util.Scanner;

public class exercise15 {
    // TODO: Write a Java program that takes a number as input and prints its multiplication table up to 10.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = scanner.nextInt();
        for (int i = 0; i < 10; i++){
            System.out.println(num1 + "x" + (i) + " = " + (num1 * i));
        }

    }

}
