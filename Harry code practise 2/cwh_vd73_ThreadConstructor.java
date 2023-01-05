class MyThr extends Thread {
    public MyThr ( String name ) {
        super( name );
    }
    public void run () {
        int i = 34;
        System.out.println("Thank you");
//        while(true)
            System.out.println("I am a thread");
    }
}

public class cwh_vd73_ThreadConstructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Nayeem");
        t.start();
        MyThr t2 = new MyThr("Galib");
        t2.start();
        System.out.println("The ID of the thread is " + t.getId());
        System.out.println("The name of the thread is " + t.getName());
        System.out.println("The ID of the thread is " + t2.getId());
        System.out.println("The name of the thread is " + t2.getName());
    }
}
