import java.util.Scanner;

public class Test {
    public static void main( String[] args){
        Circle circle = new Circle ( 3 );
        System.out.printf("Area of circle is %.2f \n", circle.getArea());
        System.out.print("Enter new radius for circle: ");
        Scanner scan = new Scanner( System.in );
        double radius = scan.nextDouble();
        circle.setRadius ( radius );
        System.out.printf("New area of circle is %.2f \n", circle.getArea());

        Triangle triangle = new Triangle ( 4, 5 );
        System.out.printf("Area of circle is %.2f \n", triangle.getArea());
        System.out.print("Enter new base and height for tringle: ");
        double base = scan.nextDouble();
        double height = scan.nextDouble();
        triangle.setBaseAndHeight ( base, height );
        System.out.printf("New area of triangle is %.2f \n", triangle.getArea());
    }
}
