class MyMainEmployee{
    private int id;
    private String name;
    private  int salary;

    public MyMainEmployee(){
        id = 45;
        name = "Your_Name_Here";
        salary = 10_000;
    }
    // method overloading also work with constructor.
    // and can take parameters without over loading.
    // can be over load multiple time...
    public MyMainEmployee(String myName, int myId, int Salary){
        id = myId;
        name = myName;
        salary = Salary;
    }
    public String getName() { return name; }
    public void setName(String n){ this.name = n;}
    public void setId(int i){ this.id = i; }
    public int getId(){ return id; }
    public int gatSalary(){ return salary; }
}

public class cwh_vd42 {
    public static void main(String[] args) {
//        MyMainEmployee nayeem = new MyMainEmployee("ProgrammingWithNayeem", 500);
        MyMainEmployee nayeem = new MyMainEmployee();
//        nayeem.setName("CodeWithNayeem");
//        nayeem.setId(34);
        System.out.println(nayeem.getName());
        System.out.println(nayeem.getId());
        System.out.println(nayeem.gatSalary());
    }
}
