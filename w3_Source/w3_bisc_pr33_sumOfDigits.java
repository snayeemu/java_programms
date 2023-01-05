import java.util.Scanner;

class w3_basic_pr33_sumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter an integer number: ");
        int number = scan.nextInt();

        SumOfTheDigits sumOfTheDigits1 = new SumOfTheDigits();
        int sumOfDigits = sumOfTheDigits1.sumOfDigits( number );
        System.out.println("Sum of digits of given integer is: " + sumOfDigits);
    }
}
