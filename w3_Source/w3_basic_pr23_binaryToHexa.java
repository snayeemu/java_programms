import java.util.Scanner;

public class w3_basic_pr23_binaryToHexa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = scan.nextInt();
        BinaryToDecimal BiToDe = new BinaryToDecimal();
        w3_basic_pr20 decTohex = new w3_basic_pr20();
        System.out.println(binary + " binary number in HexDecimal is: " + decTohex.decimalToHexaDecimal(BiToDe.binaryToDecimal(binary)));
    }
}