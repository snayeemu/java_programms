import java.util.*;
public class AreaDisplay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of your rectangle: ");
        int length = scan.nextInt();
        System.out.println("Enter width of your rectangle: ");
        int width = scan.nextInt();
        Rectangle object = new Rectangle();
        object.setValue(length, width);
        System.out.print("The are of your rectangle is: ");
        System.out.println(object.area() + "\n");
    }//main
}//class
