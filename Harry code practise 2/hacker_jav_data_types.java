import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long[] n = new long[t];
        String[] str = new String[t];
        for (int i = 0; i < t; i++) {
            str[i] = scan.next();
        }
            for (int i = 0; i < t; i++) {
            try {
                n[i] = Long.parseLong(str[i]);
                if (n[i] <= Math.pow(2, 63) - 1 && n[i] >= Math.pow(-2, 63)) {
                    System.out.println(n[i] + " can be fitted in:");
                    if (n[i] <= Math.pow(2, 7) - 1 && n[i] >= Math.pow(-2, 7))
                        System.out.println("* byte");
                    if (n[i] <= Math.pow(2, 15) - 1 && n[i] >= Math.pow(-2, 15))
                        System.out.println("* short");
                    if (n[i] <= Math.pow(2, 31) - 1 && n[i] >= Math.pow(-2, 31))
                        System.out.println("* int");
                    if (n[i] <= Math.pow(2, 63) - 1 && n[i] >= Math.pow(-2, 63))
                        System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(str[i] + " can't be fitted anywhere.");
            }
        }
    }
}