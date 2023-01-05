import  java.util.*;

public class cwh_chp5_pr2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Input the number: ");
        int n = scan.nextInt();
        System.out.printf("Sum of 1 to %d is ", n);
        int sum = 0;
        for(int i= 1; i <= n; i++)
            sum = sum + i;
        System.out.printf("Sum of 1 to %d is %d\n", n, sum);
    }
}
