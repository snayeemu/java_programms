class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int n){
        this.id = n;
    }
    public int getId(){
        return id;
    }
}

public class cwh_vd40 {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
//        harry.id = 45;
//        harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        harry.setId(101);
        System.out.println(harry.getName());
        System.out.println( harry.getId());
    }
}
