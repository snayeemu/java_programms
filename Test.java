import java.util.Scanner;

class Test{
	public static void main( String[] args ){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius of th circle: ");
		double radius = scan.nextDouble();
		Circle circle = new Circle( radius );
		System.out.printf("Area of your circle is %.2f\n", circle.getArea() );
		
		System.out.print("Enter new radius of the circle: ");
		radius = scan.nextDouble();
		circle.setRadius( radius );
		System.out.printf("New area of the circle is %f\n", circle.getArea() );
		
		
		System.out.print("Enter length of the rectangle: ");
		double length = scan.nextDouble();
		System.out.print("Enter width of the rectangle: ");
		double width = scan.nextDouble();
		Rectangle rectangle = new Rectangle( length, width );
		System.out.printf("Area of the rectangle is %f\n", rectangle.getArea() );
		
		System.out.print("Enter new length of the rectangle: ");
		length = scan.nextDouble();
		System.out.print("Enter new width of the rectangle: ");
		width = scan.nextDouble();
		rectangle.setLengthWidth( length, width );
		System.out.printf("New area of the rectangle is %f\n", rectangle.getArea() );
	}
}