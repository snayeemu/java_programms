import java.util.Scanner;

 class w3_basic_pr19 {
    static int decimalToBinary(int decimal){
        // 123 = 1111011
        int  reverseBinary = 0 ;
        int binary = 0;
        int remainder;
        while ( decimal != 0) {
            remainder = decimal % 2;
            decimal /= 2;
            reverseBinary = reverseBinary * 10 + remainder;
        }
        while ( reverseBinary != 0) {
            remainder = reverseBinary % 10;
            reverseBinary /= 10;
            binary = binary * 10 + remainder;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = scan.nextInt();
        System.out.println(decimal + " after converting to binary is " + decimalToBinary(decimal));
    }
}
