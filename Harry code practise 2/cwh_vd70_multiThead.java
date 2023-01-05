// arguments ar actual
// parameters are virtual
class MyThread extends Thread{
    @Override
    public void run(){
        while ( true ){
            System.out.println("My Thread is Running");
            System.out.println("I am Nayeem. ");
        }
    }
}
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while ( i < 40000 ){
            System.out.println("My cooking Thread is Running");
            System.out.println("I am Nayeem. ");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while ( i < 40000 ){
            System.out.println("My Thread2 for chatting with him");
            System.out.println("I am Saad. ");
            i++;
        }
    }
}
public class cwh_vd70_multiThead {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
