class GoodMorning extends Thread{
    @Override
    public void run(){
        while ( true )
            System.out.println("good morning");
    }
}
class Welcome extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
                System.out.println("Welcome");
            }
            catch ( Exception e ){
                System.out.println(e);
            }
        }
    }
}


public class cwh_vd76_practise {
    public static void main(String[] args) {
        GoodMorning goodMorning = new GoodMorning();
        Welcome welcome = new Welcome();
        goodMorning.start();
        welcome.start();
    }
}
