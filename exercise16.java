public class exercise16 {
    // TODO: Java Program to Print Star Pascal’s Triangle

    // To find factorial of a number
    public int factorial(int a){

        // Edge case
        // Factorial of 0 is unity
        if (a == 0)
            // Hence return 1
            return 1;
        // else recursively call the function over the
        // number whose factorial is to be computed
        return a * factorial(a -1);
    }

    public static void main(String[] args) {
        // Declare and initialize number whose
        // factorial is to be computed
        int k = 4;
        int a, b;
        // Creating an object of GFG class
        exercise16 ex = new exercise16();

        // iterating using nested for loop to traverse over
        // matrix
        // Outer for loop
        for (a = 0; a <= k; a++) {

            // Inner loop 1
            for (b = 0; b <= k - a; b++) {

                // Print white space for left spacing
                System.out.println(" ");
            }

            // Inner loop 2
            for (b = 0; b <= a; b++) {

                // nCr formula
                System.out.println(
                        " "
                                + ex.factorial(a)
                                / (ex.factorial(a - b)
                                * ex.factorial(b)));
            }

            // By now, we are done with one row so
            // a new line
            System.out.println();

        }
    }


}

// Method 1: Using nCr formula
//
//Implementation: Follow the below algorithm for printing Pascal’s triangle using the nCr formula
//
//    Let n be the number of rows to be printed
//    Use outer iteration a from 0 to k times to print the rows
//    Make inner iteration for b from 0 to (K – 1).
//    Then print space as ” “.
//    Close the inner ‘b’ loop.
//    Make inner iteration for b from ‘0’ to ‘a’.
//    Output nCr of ‘a’ and ‘b’.
//    Close inner loop.
//    Print newline character (\n) after each inner iteration.