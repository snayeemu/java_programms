
import java.util.Scanner;

public class Break_and_Continue {

    public static void main(String[] args) {
    	String input = "";
    	Scanner scan = new Scanner(System.in);
			while (true){	
    		System.out.print("(Enter \"quit\" to exit)\nInput: ");
    		input = scan.nextLine().toLowerCase();
    		if(input.equals("pass"))
    			continue;
    		if(input.equals("quit"))
			break;
			System.out.println(input);
    	}
    }
    
    
}