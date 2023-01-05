import java.util.Scanner;

public class w3_basic_pr35_areaOfPolygon {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print("Input the number of sides of the polygon: ");
        int numberOfSides = scan.nextInt();
        System.out.print("Input the length of one of the sides: ");
        int lengthOfSide = scan.nextInt();
        AreaOfHPolygon area1 = new AreaOfHPolygon();
        double area = area1.area( numberOfSides, lengthOfSide );
        System.out.println("Area of this Polygon is: " + area );
    }
}

class AreaOfHPolygon{
    public double area( int numberOfSides, int lengthOfSide ){
        return (numberOfSides*Math.pow(lengthOfSide, 2))/(4*Math.tan(Math.PI/numberOfSides));
    }
}