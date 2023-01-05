class cylinder{
    double volume;
    double height;
//    public void setters(double Volume, double Height){
//        volume = Volume;
//        height = Height;
//    }

    // constructor
    public cylinder( double Volume, double Height){
        volume = Volume;
        height = Height;
    }

    public double getVolume(){
        return Math.sqrt( volume / (3.14 * height) );
    }

    public double getSurface(){
        return ( 2 * 3.14 * getVolume() * height + 2 * 3.14 * Math.pow( getVolume(), 2 ));
    }
}

class myRectangle{
    double length;
    double width;

    public myRectangle(){
        length = 4;
        width = 5;
    }

    public myRectangle(double Length, double Width){
        length = Length;
        width = Width;
    }

    public double getLength(){return length;}
    public double getWidth(){return width;}
}

class sphere{
    double radius;

    public void setters(double Radius){ radius = Radius;}
    public double volume(){ return (4 / 3F) * 3.14 * Math.pow(radius, 3);}
    public double surface(){ return 4 * 3.14 * Math.pow(radius, 2);}
}


public class cwh_vd44 {
    public static void main(String[] args) {

        // problem 1 and 2 and 3
//        cylinder obj = new cylinder(8, 11);
//        obj.setters(8, 11);
//        System.out.printf("Radius of the cylinder is %.2f\n", obj.getVolume());
//        System.out.printf("Surface of the cylinder is %.2f\n", obj.getSurface());

        // problem 4
//        myRectangle obj = new myRectangle();
//        System.out.printf("Length of the rectangle is %.2f\n", obj.getLength());
//        System.out.printf("Width of the rectangle is %.2f\n", obj.getWidth());
//        myRectangle obj2 = new myRectangle(11, 12);
//        System.out.printf("New length of the rectangle is %.2f\n", obj2.getLength());
//        System.out.printf("New width of the rectangle is %.2f\n", obj2.getWidth());

        // problem 5
        sphere obj = new sphere();
        obj.setters(1.5);
        System.out.printf("The volume of the sphere is %.2f\n", obj.volume());
        System.out.printf("The surface area of the sphere is %.2f\n", obj.surface());
    }
}
