import java.io.*;

public class ReadingFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Java Programs\\practise for final exam//Test.txt")
            );
            String s;
            while ( (s = br.readLine() ) != null )
                System.out.println(s);
            br.close();
        }
        catch( Exception e ){
            System.out.println("Failed");
        }
    }
}
