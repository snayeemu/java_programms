abstract class Pen{
    abstract void write();
    abstract void refill();
} // abstract pen class ended

class FountainPen extends Pen{
    void write(){
        System.out.println("Writing with Fountain Pen");
    } // write method ended
    void refill(){
        System.out.println("Refilling Fountain Pen");
    } // refill method ended
    void changeNib(){
        System.out.println("Changing Nib");
    } // changeNib method ended
} // FountainPen class ended

class Monkey{
    void jump(){
        System.out.println("Jumping");
    } // jump method ended
    void bite(){
        System.out.println("Biting");
    } // bite method ended
} // Monkey class ended

class Human extends Monkey{
    void eat(){
        System.out.println("Eating");
    } // eat method ended
    void sleep(){
        System.out.println("Sleeping");
    } // sleep method ended
} // Human class ended

abstract class TelePhone{
    void ring(){
        System.out.println("Ringing");
    } // ring method ended
    void light(){
        System.out.println("Lighting");
    } // light method ended
    abstract void disconnect(); // abstract method
} // TelePhone class ended

class SmartTelePhone extends TelePhone{
    void disconnect(){
        System.out.println("Disconnected");
    } // disconnect method ended
} // SmartTelePhone class ended

interface TVRemote{
    void Remote();
} // TVRemote interface ended

interface SmartTVRemote extends TVRemote{
    void smart();
} // SmartTVRemote interface  ended

class TV implements TVRemote{
    public void Remote(){
        System.out.println("This is a remote");
    } // Remote method ended
} // TV class ended

public class cwh_vd60_chapter11PractiseSet {
    public static void main(String[] args) {
        TelePhone sm = new SmartTelePhone();
        sm.disconnect();
        Monkey hu = new Human();
        hu.jump();
        hu.bite();
    }
}
