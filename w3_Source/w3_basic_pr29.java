import java.util.Scanner;

public class w3_basic_pr29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Hexadecimal Number : ");
        String hexaDecimal = scan.nextLine();
        HexaToBinary hexToBi = new HexaToBinary();
        System.out.printf("Equivalent Binary Number is: %d", hexToBi.hexaToBinary(hexaDecimal));
    }
}
