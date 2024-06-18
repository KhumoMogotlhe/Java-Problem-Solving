import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name, age and salary");
        String myName = obj.nextLine();
        int myAge = obj.nextInt();
        double mysalary = obj.nextDouble();
        System.out.println("My name is:" + myName);
        System.out.println("My age is:" + myAge);
        System.out.println("My salary is:" + mysalary);
    }
}

/* nextLine() - reads Strings
* nextBoolean()	Reads a boolean value from the user
* nextByte()	Reads a byte value from the user
* nextDouble()	Reads a double value from the user
* nextFloat()	Reads a float value from the user
* nextInt()	Reads a int value from the user
* nextLine()	Reads a String value from the user
* nextLong()	Reads a long value from the user
* nextShort()	Reads a short value from the user
* */