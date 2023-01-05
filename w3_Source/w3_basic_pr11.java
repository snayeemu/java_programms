import java.util.*;

public class w3_basic_pr11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Radius = ");
        float radius = scan.nextFloat();
        final float pi = 3.14F;
        System.out.println("Perimeter is = " + (2 * pi * radius) );
        System.out.println("Area is = " + (pi * radius * radius) );
    }
}
