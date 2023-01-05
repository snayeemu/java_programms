import java.util.Scanner;

public class w3_basic_pr34_areaOfHexagon {
    public static void main(String[] args) {
        AreaOfHexagon area1 = new AreaOfHexagon();
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter the length of side: ");
        double lengthOfSide = scan.nextDouble();
        double area = area1.area(lengthOfSide);
        System.out.printf("Area of this hexagon is: %.2f\n", area);
    }
}
