import java.util.Scanner;

public class w3_basic_pr41_AsciiValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter a character: ");
        char character = scan.next().charAt(0);
        System.out.printf("Ascii value of character is %c %d", character, (int) character);
    }
}
