import java.util.*;

public class W3_Basic_Pr5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scan.nextInt();
        System.out.printf("%d x %d = %d", firstNumber, secondNumber, (firstNumber * secondNumber) );

    }
}
