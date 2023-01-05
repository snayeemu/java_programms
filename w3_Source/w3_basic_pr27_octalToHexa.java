import java.util.Scanner;

public class w3_basic_pr27_octalToHexa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int octal = scan.nextInt();
        int decimanl = w3_basic_pr25_octalToDecimal.octalToDecimal(octal);
        String hexaDecimal = w3_basic_pr20.decimalToHexaDecimal(decimanl);
        System.out.printf("%d octal number in hexadecimal is %s\n", octal, hexaDecimal);
    }
}