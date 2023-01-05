interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void FourKVidieo(){
        greet();
        System.out.println("Recording in 4k");
    }
    private void greet(){
        System.out.println("Good Morning");
    }
}
interface MyWifi{
    String [] getNetworks();
    void connectToNetworks(String network);
}
interface MyWifi2{
    String [] getNetworks();
    void connectToNetworks(String network);
}
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void FourKVidieo(){
        greet();
        System.out.println("Recording in 4k");
    }
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
        public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video.");
    }
    public String [] getNetworks(){
        System.out.println("Getting list of networks.");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
                return networkList;
    }
    public void connectToNetworks(String network){
        System.out.println("Connecting to networks." + network);
    }
    @Override
    public void FourKVidieo() {
        System.out.println("taking snap and 4k recording.");
    }
    }
class MySmartPhone2 extends MyCellPhone implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video.");
    }
    public String [] getNetworks(){
        System.out.println("Getting list of networks.");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetworks(String network){
        System.out.println("Connecting to networks." + network);
    }
    @Override
    public void FourKVidieo() {
        System.out.println("taking snap and 4k recording.");
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}
    public class cwh_vd57/*plus 59*/ {
        public static void main(String[] args) {
            MySmartPhone ms = new MySmartPhone();
            MyCamera2 cam1 = new MySmartPhone2();
            MySmartPhone2 s = new MySmartPhone2(); // --> can be used for all methods.
            //            cam1.getNetworks(); --> not allowed
//                cam1.sampleMeth(); --> through error
            cam1.FourKVidieo();
            ms.FourKVidieo();
//        ms.greet(); --> through error
            String[] ar = ms.getNetworks();
            for (String item : ar) {
                System.out.println(item);
            }
        }
    }
