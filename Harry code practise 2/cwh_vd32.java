public class cwh_vd32 {
    // methods over loading.
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(3000, 4000);
        // arguments are actual!
    }
}
