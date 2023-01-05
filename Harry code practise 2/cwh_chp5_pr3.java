import java.util.*;

public class cwh_chp5_pr3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scan.nextInt();
        System.out.print("The multiplication table of n is: \n");
        for(int i = 1; i <= 10; i++)
            System.out.printf("%d x %d = %d\n", n, i, (n * i) );
    }
}
