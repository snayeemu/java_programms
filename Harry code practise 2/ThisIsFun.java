public class ThisIsFun {
    int a, b;
    String food;
    char size;

    public void setData (String food, char size ){
        this.food = food;
        this.size = size;
    }


    public void setData( int a, int b){
        ThisIsFun t = new ThisIsFun();
        this.a = a;
        this.b = b;
    }
    public static void main(String[] args) {
        ThisIsFun t = new ThisIsFun();
        t.setData( "soup", 'L' );

        System.out.println(t.food);
        System.out.println(t.size);
    }
}
