import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
                try {
                    BufferedWriter bw = new BufferedWriter(
                            new FileWriter("C:\\javaFileTest\\output-copy.txt"));
                    BufferedReader br = new BufferedReader(
                            new FileReader("C:\\javaFileTest\\output.txt"));
                    String s;
                    while( (s = br.readLine()) != null ){
                        bw.write( s + "\n");
                    }
                    br.close();
                    bw.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
