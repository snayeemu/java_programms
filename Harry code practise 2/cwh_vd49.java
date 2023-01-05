class phone{
    public void showTime(){
        System.out.println("Showing time on the phone.");
    }
    public void on(){
        System.out.println("Turnig on phone.");
    }
}
class smartPhone extends phone{
    public void vocalOnly(){
        System.out.println("Playing songs vocal only.");
    }
    @Override
    public void on(){
        System.out.println("Turning on smart phone.");
    }
}

public class cwh_vd49 {
    public static void main(String[] args) {
//        phone obj = new phone(); // Allowed
//        smartPhone smobj = new smartPhone(); // Allowed
//        obj.on();

        phone obj = new smartPhone(); // Allowed // object will be made in run time.
//        smartPhone obj2 = new phone(); // not allowed
        obj.showTime();
        obj.on();
//        obj.vocalOnly(); // Not Allowed
    }
}
