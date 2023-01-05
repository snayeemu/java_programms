public class Circle {
    private double radius;
    Circle( double radius ){ this.radius = radius; }
    public void setRadius( double radius ){ this.radius = radius; }
    public double getArea(){ return Math.PI * Math.pow( radius, 2 ); }
}
