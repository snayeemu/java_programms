import java.io.*;
import java.util.*;

class Solution4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s;
        if ( n >= -100 && n <= 100){
            s = Integer.toString(n);
            System.out.print("Good job");
        }
    }
}