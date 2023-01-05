import java.util.Scanner;
public class w3_basic_pr24_binaryToOctal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int binary = scan.nextInt();
        BinaryToDecimal biToDe = new BinaryToDecimal();
        int decimal = biToDe.binaryToDecimal(binary);
        int octal = DecimalToOctal.decimalToOctal(decimal);
        System.out.printf("%d in octal is %d \n", binary, octal);
    }
}
