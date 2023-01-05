public class AreaOfHexagon {
    public double area( double lengthOfSide ){
        return (6 * Math.pow(lengthOfSide, 2))/(4*Math.tan(Math.PI/6));
    }
}
