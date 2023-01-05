import java.util.Arrays;

interface Bicycle {
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int x = 15;
    void blowHorn3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle, HornBicycle{
    int x = 5; // allowed
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo.");
    }
    int speed = 7;
    public void applyBrake(int decrement){
        System.out.println("Applying Brake.");
        speed = speed - decrement;
    }
    public void speedUp(int increment){
        System.out.println("Applying Speed Up.");
        speed = speed + increment;
    }
    public  void blowHorn3g(){
        System.out.println("Joto khushi toto gum. Pee Pee Pee.");
    }
    public void blowHornmhn(){
        System.out.println("I am here po po po.");
    }
}

// topic interfaces
//In Java interface is a group of related methods with empty bodies
public class cwh_vd54 {
    public static void main(String[] args) {
        AvonCycle avon = new AvonCycle();
        avon.applyBrake(2);
        // You can create properties in Interfaces
        System.out.println(avon.a);
        // You cannot modify the properties in Interfaces as they are final
//        avon.a = 8; // not allowed
        avon.blowHorn3g();
        avon.blowHornmhn();
        System.out.println(avon.x); // allowed
    }
}
