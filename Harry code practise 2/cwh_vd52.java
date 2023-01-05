class circle{
    public double radius;
    public double area(double radius){
        this.radius = radius;
        return 3.14 * Math.pow(this.radius, 2);
    }

}
class cylinder1 extends circle{
    public double height;
    public double volume(double height, double radius){
        this.height = height;
        this.radius = radius;
        return super.area(this.radius) * this.height;
    }
}
class rectangle1{
    public double length;
    public double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){ return width * length; }

}
class cuboid extends rectangle1{
    public double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area(){ return 2 * (length * width + width * height + length * height); }
    public double volume(){ return length * width * height; }
}

public class cwh_vd52 {
    public static void main(String[] args) {
        circle cir = new circle();
        System.out.printf("Area of the circle %.2f\n", cir.area(2.1));
        cylinder1 cyl = new cylinder1();
        System.out.printf("Volume of the cylinder is %.2f\n", cyl.volume(3.1, 2.1));
        rectangle1 rec = new rectangle1();
        rec.setLength(2.1);
        rec.setWidth(3.1);
        System.out.printf("Area of the rectangle is %.2f\n", rec.area());
        cuboid cub = new cuboid();
        cub.setLength(3.1);
        cub.setWidth(2.2);
        cub.setHeight(5.1);
        System.out.printf("Area of the cuboid is %.2f\n", cub.area());
        System.out.printf("Volume of the cuboid is %.2f\n", cub.volume());
    }
}
