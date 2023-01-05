

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle Rectangle = new Rectangle();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of your rectangle: ");
        int length = scan.nextInt();
        Rectangle.setLength(length);
        System.out.print("Enter width of your rectangle: ");
        int width = scan.nextInt();
        Rectangle.setWidth(width);
        System.out.println("Area of this rectangle is : " + Rectangle.area());
    }
}
