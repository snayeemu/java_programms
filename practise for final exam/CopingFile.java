import java.io.*;

public class CopingFile {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Java Programs\\practise for final exam\\Copied.txt")
            );
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Java Programs\\practise for final exam\\Test.txt")
            );
            String s;
            while ((s = br.readLine()) != null)
                bw.write(s + "\n");
            bw.close();
            br.close();
        }
        catch ( Exception e ){
            System.out.println("Failed");
        }
    }
}
