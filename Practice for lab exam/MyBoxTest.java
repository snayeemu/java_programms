public class MyBoxTest {
    public static void main(String[] args) {
        MyBoxWeight myBox1 = new MyBoxWeight( 2, 3, 4,5);
        MyBoxWeight myBox2 = new MyBoxWeight();
        MyBoxWeight myBox3 = new MyBoxWeight( myBox1 );
        MyBoxWeight myCube = new MyBoxWeight( 3, 8 );

        System.out.println();
        System.out.println("Volume of my box1 is " + myBox1.volume());
        System.out.println("Weight of my box1 is " + myBox1.weight);

        System.out.println();
        System.out.println("Volume of my box2 is " + myBox2.volume());
        System.out.println("Weight of my box1 is " + myBox2.weight);

        System.out.println();
        System.out.println("Volume of my box3 is " + myBox3.volume());
        System.out.println("Weight of my box3 is " + myBox3.weight);

        System.out.println();
        System.out.println("Volume of my cube is " + myCube.volume());
        System.out.println("Weight of my cube is " + myCube.weight);
    }
}
/*
* Coded by: Shaikh Nayeem Uddin
* */