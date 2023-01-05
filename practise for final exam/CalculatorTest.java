import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        Calculator cal1 = new Calculator();

        int validator = 0;

        while (  validator != -1 ){
            System.out.print("Enter first number: ");
            double firstNumber = scan.nextDouble();
            cal1.setFirstNumber( firstNumber );

            System.out.print("Enter second number: ");
            double secondNumber = scan.nextDouble();
            cal1.setSecondNumber( secondNumber );

            System.out.print("Enter operator ( +, -, *, / ) :  ");
            String operator = scan.next();
            switch ( operator ){
                case "+":
                    System.out.printf("\nSummation of %.3f and %.3f is %.3f\n", firstNumber, secondNumber, cal1.summation());
                    break;
                case "-":
                    System.out.printf("\nSubtraction  of %.3f and %.3f is %.3f\n", firstNumber, secondNumber, cal1.subtraction ());
                    break;
                case "*":
                    System.out.printf("\nMultiplication of %.3f and %.3f is %.3f\n", firstNumber, secondNumber, cal1.multiplication());
                    break;
                case "/":
                    System.out.printf("\nDeviation of %.3f and %.3f is %.3f\n", firstNumber, secondNumber, cal1.deviation());
                    break;
                default:
                    System.out.println("Invalid operator.");
            }
            System.out.print("Enter '0' to continue or '-1' to exit : ");
            validator = scan.nextInt();
        }
    }
}
/* Shaikh Nayeem Uddin
 * Batch : 56 */
