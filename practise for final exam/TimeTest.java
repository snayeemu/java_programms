public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time( 2 );
        Time t3 = new Time( 21, 34 );
        Time t4 = new Time( 12, 25, 42 );
        Time t5 = new Time( t4 );

        System.out.println("Constructed with: ");
        System.out.println("t1: all arguments defaulted");
        System.out.printf("    %s\n", t1.toUniversalString() );
        System.out.printf("    %s\n", t1.toString() );

        System.out.println("t2: hour specified; minute and second defaulted");
        System.out.printf("    %s\n", t2.toUniversalString() );
        System.out.printf("    %s\n", t2.toString() );

        System.out.println("t3: hour and minute specified; second defaulted");
        System.out.printf("    %s\n", t3.toUniversalString() );
        System.out.printf("    %s\n", t3.toString() );

        System.out.println("t4: hour, minute and second specified");
        System.out.printf("    %s\n", t4.toUniversalString() );
        System.out.printf("    %s\n", t4.toString() );

        System.out.println("t5: Time object t4 specified");
        System.out.printf("    %s\n", t5.toUniversalString() );
        System.out.printf("    %s\n", t5.toString() );

        try{
            Time t6 = new Time( 27, 74, 99 );
        }
        catch ( IllegalArgumentException e ) {
            System.out.printf("\nException while initializing t6: %s\n",
                    e.getMessage() );
        }
    }
}

/*
* Typed by: Shaikh Nayeem Uddin
* Batch: 56
* */