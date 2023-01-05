import java.util.Scanner;

public class w3_basic_pr28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hexa = scan.nextLine();
        HexaDecimalToDecimal hexTode = new HexaDecimalToDecimal();
        System.out.printf("%s hexa decimal number in decimal is %d \n", hexa, hexTode.hexaToDecimal(hexa));
    }
}
