interface sampleInterface{
    void meth1();
    void meth2();
}
// we can extend interfaces in interfaces but not in interfaces to class.
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
}

public class cwh_vd58 {
    public static void main(String[] args) {
        MySampleClass sam = new MySampleClass();
        sam.meth1();
        sam.meth2();
        sam.meth3();
        sam.meth4();
    }
}
