import java.util.Scanner;

public class cwh_chp5_pr4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scan.nextInt();
        System.out.print("The multiplication table of n is: \n");
        for(int i = 10; i >= 1; i--)
            System.out.printf("%d x %d = %d\n", n, i, (n * i) );
    }
}
