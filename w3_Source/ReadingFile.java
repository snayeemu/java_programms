import java.io.*;

public class ReadingFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
            new FileReader("C:\\javaFileTest\\output.txt") );
            String s;
            while( (s = br.readLine()) != null ){
                System.out.println(s);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
