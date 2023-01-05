
class Employee1{
    int salary;
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}

public class cwh_vd38 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1  harry = new Employee1(); // Instantiating a new Employee object
        Employee1 john = new Employee1();
        // Setting Attributes for harry.
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John.
        john.id = 17;
        john.salary = 12;
        john.name = "John Khadelwal";
        int salary = john.getSalary();
        System.out.println(salary);
        // Printing the Attributes
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();
    }
}
