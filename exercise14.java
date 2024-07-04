public class exercise14 {
    public int factorial(int i){
        if ( i == 0)
            return 1;
        return i * factorial(i-1);
    }

    public static void main(String[] args) {
        int n = 4, i, j;
        exercise14 e = new exercise14();
        for (i = 0; i <= n - i; j++) {
            for (j = 0; j <= n - i; j++) {
                System.out.println(" ");
            }
            for (j=0; j<= i; j++){

            System.out.println(
                    " "
                            + e.factorial(i)
                            / (e.factorial(i - j)
                            * e.factorial(j))
            );}
        }
    }
}
