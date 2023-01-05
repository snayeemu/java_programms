import java.util.Scanner;

public class w3_basic_pr25_octalToDecimal {
    static int octalToDecimal(int octal){
        int decimal = 0;
        int power = 0;
        while( octal != 0){
            int remainder = octal % 10;
            decimal += remainder * Math.pow( 8, power++);
            octal /= 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int octal = scan.nextInt();
        System.out.printf("%d octal number in decimal is %d \n", octal, octalToDecimal(octal));
    }
}
