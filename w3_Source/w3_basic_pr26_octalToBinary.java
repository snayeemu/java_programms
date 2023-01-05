import java.util.Scanner;

public class w3_basic_pr26_octalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int octal = scan.nextInt();
        System.out.print("Enter an octal number: ");
        int decimal = w3_basic_pr25_octalToDecimal.octalToDecimal(octal);
        int binary = w3_basic_pr19.decimalToBinary(decimal);
        System.out.printf("%d octal number in binary is %d \n", octal, binary);
    }
}
