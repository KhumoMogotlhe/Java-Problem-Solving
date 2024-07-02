public class exercise8 {
    public static void main(String[] args) {
        int day = 6;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default: // specifies some code to run if there is no case match
                System.out.println("Looking forward to the Weekend");

        }
    }
}
/*
* Java Switch Statements
Instead of writing many if..else statements, you can use the switch statement.
*
* The break Keyword
- When Java reaches a break keyword, it breaks out of the switch block.
- This will stop the execution of more code and case testing inside the block.
- When a match is found, and the job is done, it's time for a break. There is no need for more testing.
* */
