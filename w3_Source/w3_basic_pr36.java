import java.util.Scanner;

public class w3_basic_pr36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Data: ");
        System.out.println("Input the latitude of coordinate 1: ");
        double x1 = scan.nextDouble();
        System.out.println("Input the longitude of coordinate 1: ");
        double x2 = scan.nextDouble();
        System.out.println("Input the latitude of coordinate 2: ");
        double y1 = scan.nextDouble();
        System.out.println("Input the latitude of coordinate 2: ");
        double y2 = scan.nextDouble();
        distance_between_two_points_on_the_surface_of_earth distance1 = new distance_between_two_points_on_the_surface_of_earth();
        double distance = distance1.distance(x1, x2, y1, y2);
        System.out.println("The distance between those points is: " + distance);
    }
}
