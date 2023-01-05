class Base1{
    Base1(){
        System.out.println("I am a constructor.");
    }
    Base1(int a){
        System.out.println("I am a overloaded constructor with value of a as: " + a);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("I am a derived1 constructor.");
    }
    Derived1(int a, int b){
        super(a);
        System.out.println("I am an overloaded constructor of Derived1 with value of b as: " + b);
    }
//    public int y;
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
}

class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a child of derived1 constructor");;
    }
    childOfDerived(int a, int b, int c){
        super(a, b);
        System.out.println("I am an overloaded constructor of child of Derived1 with value of c as: " + c);;
    }
}

public class cwh_vd46 {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(14, 9);
        childOfDerived cd = new childOfDerived(12, 13, 15);
    }
}
