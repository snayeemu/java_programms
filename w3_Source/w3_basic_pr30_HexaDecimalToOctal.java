import java.util.Scanner;

public class w3_basic_pr30_HexaDecimalToOctal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexaDecimal = scan.next();
        HexaDecimalToOctal hexToDe = new HexaDecimalToOctal();
        System.out.printf("%s hexadecimal number in octal %d \n",  hexaDecimal, hexToDe.hexaToOctal(hexaDecimal));
    }
}
