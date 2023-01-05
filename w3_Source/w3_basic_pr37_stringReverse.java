import java.util.Scanner;

public class w3_basic_pr37_stringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter a string: ");
        String string = scan.nextLine();
        String_Reverse reverse = new String_Reverse();
        String afterReverse = reverse.stringReverse( string );
        System.out.println("After reversing the string is: " + afterReverse );
    }
}
