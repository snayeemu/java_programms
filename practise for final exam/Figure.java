abstract class Figure {
    double dimension1;
    double dimension2;
    Figure( double dimension1, double dimension2){
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    abstract public double area();
}

class Rectangle extends Figure{
    Rectangle( double dimension1, double dimension2 ){
        super( dimension1, dimension2 );
    }

    public double area(){
        return dimension1 * dimension2;
    }
}

class Triangle1 extends Figure{
    Triangle1( double dimension1, double dimension2 ){
        super( dimension1, dimension2);
    }

    @Override
    public double area() {
        return 0.5 * dimension1 * dimension2;
    }
}

class AbstractAreaTest{
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle( 3, 4 );
        Triangle1 tri1 = new Triangle1( 5, 7 );
        Figure reference;

        reference = rec1;
        System.out.printf("Area of the rectangle is: %.2f\n", reference.area());
        reference = tri1;
        System.out.printf("Area of the triangle is: %.2f\n", reference.area());
    }
}