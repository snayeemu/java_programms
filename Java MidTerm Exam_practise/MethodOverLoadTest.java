class MethodOverLoad

{
    public  int multiply(int x, int y)
    {
        System.out.printf("\nCalled multiply with int arguments: %d & %d\n",x,y);
        return x*y;
    }

    public  double multiply(int x, double y)
    {
        System.out.printf("\nCalled multiply with int and double argument: %d & %f\n",x,y);
        return x*y;
    }

    public double multiply(double x, int y)
    {
        System.out.printf("\nCalled multiply with double and int argument: %f & %d\n",x,y);
        return x*y;
    }

    public double multiply(double x, double y)
    {
        System.out.printf("\nCalled multiply with double arguments: %f & %f\n",x,y);
        return x*y;
    }
}

public class MethodOverLoadTest
{
    public static void main(String[] args)
    {
        MethodOverLoad m1 = new MethodOverLoad();

        System.out.printf("Multiplication of the integers x & y is %d\n",m1.multiply(7,5));
        System.out.printf("Multiplication of the integer x & double y ais %f\n",m1.multiply(7,5.512));
        System.out.printf("Multiplication of the double x & integer y is %f\n",m1.multiply(7.553,5));
        System.out.printf("Multiplication of the doubles x & y is %f\n",m1.multiply(7.553,5.512));
    }


}