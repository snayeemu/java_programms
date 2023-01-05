
class employee{
    int salary;
    String name;
    public void setName(String Name){
        name = Name;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
}

class cellphone{
    public void ring(){
        System.out.println("Ringing.");
    }
    public void vibrate(){
        System.out.println("Vibrating.");
    }
}

class square{
    double side;
    public void initiate(double SIDE){
        side = SIDE;
    }
    public double area(){
        return Math.pow(side, 2);
    }
    public double perimeter(){
        return ( 4 * side );
    }
}

class rectangle{
    int length;
    int width;
    public void setLW(int Length, int Width){
        length = Length;
        width = Width;
    }
    public int area(){
        return ( length * width );
    }
    public int perimeter(){
        return 2 * ( length * width );
    }
}

public class cwh_vd39 {
    public static void main(String[] args) {

        // problem no 1:
//        employee emp1 = new employee();
//        employee emp2 = new employee();
//        emp1.setName("Nayeem");
//        emp2.setName("Galib");
//        emp1.salary = 150_000;
//        emp2.salary= 200_000;
//        System.out.printf("Salary of employee name %s is %d\n", emp1.getName(), emp1.getSalary());
//        System.out.printf("Salary of employee name  %s is %d\n", emp2.getName(), emp2.getSalary());

        // problem no 2:
//        cellphone display = new cellphone();
//        display.ring();
//        display.vibrate();

        // problem no 3:
//        square obj = new square();
//        obj.initiate(10);
//        System.out.println(obj.area());
//        System.out.println(obj.perimeter());

        // problem no 4;
        rectangle obj = new rectangle();
        obj.setLW(10, 5);
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
    }
}
