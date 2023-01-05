public class Triangle {
    private double base;
    private double height;
    Triangle( double base, double height ){
        this.base = base;
        this.height = height;
    }
    public void setBaseAndHeight( double base, double height  ){
        this.base = base;
        this.height = height;
    }
    public double getArea(){ return 0.5 * base * height; }
}
