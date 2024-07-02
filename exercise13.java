public class exercise13 {
    static String binaryConversion(String binaryNumber){
        if (binaryNumber.matches("[01]+")){
            return "Error: Not a binary number.";
        }
        int decimalNumber = 0;
        int length = binaryNumber.length() - 1;
        for (int i = 0; i < length; i++){
            if (binaryNumber.charAt(length - 1 - i) == '1'){
                decimalNumber += Math.pow(2 , i);
            }
        }
        return String.valueOf(decimalNumber);
    }

}
