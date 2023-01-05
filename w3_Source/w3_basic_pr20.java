import java.util.Scanner;

public class w3_basic_pr20 {
    static String decimalToHexaDecimal(int decimal){
        String [] elementsOfHexa = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String hexaDecimal = "";
        int remainder;
        while ( decimal != 0 ){
            remainder = decimal % 16;
            decimal /= 16;
            hexaDecimal = elementsOfHexa[remainder] + hexaDecimal;
        }
        return hexaDecimal;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scan.nextInt();
        String hexaDecimal = decimalToHexaDecimal(decimalNumber);
        System.out.println(hexaDecimal);
    }
}
