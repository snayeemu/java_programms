import java.util.Scanner;

class BinaryToDecimal{
    public int binaryToDecimal(int binary){
        int decimal = 0;
        int power = 0;
        while ( binary != 0 ){
            int remainder = binary % 10;
            binary /= 10;

            if ( remainder != 0)
            decimal = decimal + (int) Math.pow( 2, power );

            power++;
        }
        return decimal;
    }
}

public class w3_basic_pr22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinaryToDecimal binToDec = new BinaryToDecimal();
        int decimal = scan.nextInt();
        System.out.println(binToDec.binaryToDecimal(decimal));
    }
}
