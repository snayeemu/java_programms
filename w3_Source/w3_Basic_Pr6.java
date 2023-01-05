import java.util.*;

public class w3_Basic_Pr6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scan.nextInt();
        System.out.printf("Input second number: ");
        int secondNumber = scan.nextInt();
        System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, (firstNumber + secondNumber) );
        System.out.printf("%d - %d = %d\n", firstNumber, secondNumber, (firstNumber - secondNumber) );
        System.out.printf("%d x %d = %d\n", firstNumber, secondNumber, (firstNumber * secondNumber) );
        System.out.printf("%d / %d = %d\n", firstNumber, secondNumber, (firstNumber / secondNumber) );
        System.out.printf("%d mod %d = %d\n", firstNumber, secondNumber, (firstNumber % secondNumber) );
    }
}
