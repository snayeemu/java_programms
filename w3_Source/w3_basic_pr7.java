import java.util.*;

public class w3_basic_pr7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scan.nextInt();
        for(int i = 1; i <= 10; i++)
            System.out.printf("%d x %d = %d\n", number, i, (number * i) );
    }
}
