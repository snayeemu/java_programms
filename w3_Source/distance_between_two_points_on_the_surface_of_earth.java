public class distance_between_two_points_on_the_surface_of_earth {
    public double distance( double x1, double x2, double y1, double y2 ){
        x1 = Math.toRadians( x1 );
        x2 = Math.toRadians( x2 );
        y1 = Math.toRadians( y1 );
        y2 = Math.toRadians( y2 );
        return 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }
}
