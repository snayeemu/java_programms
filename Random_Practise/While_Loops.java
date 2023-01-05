
import java.util.Scanner;

public class While_Loops {

    public static void main(String[] args) {
    	int i=1;    	
    	while(i<=10)
    		System.out.println("Hello World" + i++);
    	String input = "";
    	Scanner scan = new Scanner(System.in);
    	while (!input.equals("quit")){
    		System.out.print("Input: ");
    		
    		input = scan.nextLine().toLowerCase();
    		System.out.println(input);
    	}
    }
    
    
}