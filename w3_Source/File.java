import java.io.*;

public class File {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\javaFileTest\\output.txt"));
            bw.write("karen\n");
            bw.write("chad\n");
            bw.write("backy\n");
            bw.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
