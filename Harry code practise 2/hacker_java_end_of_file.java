import java.io.*;
import java.util.*;

class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count = 1;
        while (scan.hasNext() ){
            String str = scan.nextLine();
            System.out.println(count + " " + str);
            count++;
        }
    }
}