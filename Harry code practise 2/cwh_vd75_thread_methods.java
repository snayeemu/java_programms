import java.sql.SQLOutput;

class MyNewThr1 extends Thread {
    public void run () {
        int i = 0;
        while ( true ) {
            System.out.println("Thank you " + this.getName());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;

        }
//        while(true)
    }
}
class MyNewThr2 extends Thread {
    public void run () {
        int i = 34;
        while ( true )
            System.out.println("Thank you" + this.getName() + " I am thread two");
//        while(true)
    }
}

public class cwh_vd75_thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        t2.start();
    }
}
