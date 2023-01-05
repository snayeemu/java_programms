

abstract class Parent2{
    public Parent2(){
        System.out.println("I am a constructor of base2.");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning.");
    }
    public void greet2(){
        System.out.println("Good evening.");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good.");
    }
}

public class cwh_vd53 {
    public static void main(String[] args) {
//        Parent2 p = new Parent2(); // Can't
//        abstract class can only make class.
        Child2 c = new Child2();
//        Child3 c3 = new Child3(); // can't
    }
}
