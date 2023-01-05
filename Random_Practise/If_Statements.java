
import java.util.Scanner;

public class If_Statements {

    public static void main(String[] args) {
    	System.out.println("Enter temperature");
    	Scanner scan = new Scanner(System.in);
    	int temperature = scan.nextInt();
    	if(temperature>30){
    		System.out.println("It's a hot day");
    		System.out.println("Drink Water");
    	} 
    	else if(temperature>=20)
    		System.out.println("It's a nice day");
    	else System.out.println("It's a cold day");
    }
    
    
}