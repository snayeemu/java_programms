import java.io.*;
import java.util.*;

public class hacker_java_loops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int [] a = new int [q];
        int [] b = new int [q];
        int [] n = new int [q];
        for (int i = 0; i < q; i++){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            n[i] = scan.nextInt();
        }
        for ( int i = 0; i < q; i++ ){
            int count = a[i];
            int power = 0;
            for ( int j = 0; j <= n[i] - 1; j++ ){
                    count += (int) (Math.pow(2, power++) * b[i]);
                    System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}