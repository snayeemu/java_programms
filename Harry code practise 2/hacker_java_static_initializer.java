import java.io.*;
import java.util.*;

class Solution3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int h = scan.nextInt();
        int a = ( b > 0 && h > 0)? ( b * h ) : 0;
        if (  a != 0)
            System.out.print(a);
        else System.out.print("java.lang.Exception: Breadth and height must be positive");
    }
}