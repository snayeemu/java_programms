import java.util.Objects;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        Calculator calculator1 = new Calculator();

        String validator = "0";

        while ( !Objects.equals( validator, "-1" ) ){
            System.out.print("Enter first number: ");
            double firstNumber = scan.nextDouble();
            calculator1.setFirstNumber( firstNumber );

            System.out.print("Enter second number: ");
            double secondNumber = scan.nextDouble();
            calculator1.setSecondNumber( secondNumber );

            System.out.print("Enter operator ( +, -, *, / ) :  ");
            String operator = scan.next();
            switch ( operator ){
                case "+":
                    System.out.printf("\nSummation of %.3f and %.3f is %.3f\n", firstNumber, secondNumber, calculator1.summation());
                    break;
                case "-":
                    System.out.printf("\nSubtraction  of %.3f and %.3f is %.3f\n", firstNumber, secondNumber, calculator1.subtraction ());
                    break;
                case "*":
                    System.out.printf("\nMultiplication of %.3f and %.3f is %.3f\n", firstNumber, secondNumber, calculator1.multiplication());
                    break;
                case "/":
                    System.out.printf("\nDeviation of %.3f and %.3f is %.3f\n", firstNumber, secondNumber, calculator1.deviation());
                    break;
                default:
                    System.out.println("Invalid operator.");
            }
            System.out.print("Enter '0' to continue or '-1' to exit : ");
            validator = scan.next();
        }
    }
}
/* Shaikh Nayeem Uddin
* Batch : 56 */
