import java.util.*;

public class cwh_chp5_pr5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Input the number: ");
        int givenNumber = scan.nextInt();
        int factorial = givenNumber;
        for(int i = 1; i < givenNumber; i++)
            factorial = factorial * (givenNumber - i);
        System.out.printf("Factorial of %d is: %d\n", givenNumber, factorial);
    }
}
