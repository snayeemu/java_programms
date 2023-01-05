import java.util.Scanner;

public class Illegal {
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter a number between 0 to 100 : ");
        int number = scan.nextInt();
        if ( number < 100 && number > 0 )
             {System.out.printf("The number is %d \n", number);}
           else {throw new IllegalArgumentException("\nEnter a number between 0 to 100.");}
        System.out.println("It is a demo of IllegalArgumentException.");
    }
}
