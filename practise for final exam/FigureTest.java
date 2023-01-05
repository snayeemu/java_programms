import java.util.Scanner;  

public class FigureTest 
{
	public static void main (String[] args)  
	{
		
		Triangle T=new Triangle(4, 7);
		
		System.out.printf("The Area of Triangle =%f\n", T.displayArea());
		
		Circle C=new Circle(2.6);
		
		System.out.printf("The Area of Circle =%f\n", C.displayArea()); 	
		
		
		
		Scanner input=new Scanner(System.in); 
		
		int Base;
		int Height;
		
		double Radius;
		
		
		
		System.out.printf("\nEnter new base :"); 
		Base=input.nextInt();	
		
		
		System.out.printf("\nEnter new height: "); 
		Height=input.nextInt();	
		
	    T.setBaseAndHeight(Base, Height);
	   	System.out.printf("\nThe New Area of Triangle= %f\n", T.displayArea());  
	    
	   	System.out.printf("\nEnter new radius :"); 
		Radius=input.nextDouble();
		
		C.setRadius(Radius);
		
	
		System.out.printf("\nThe New Area of Circle= %f\n", C.displayArea()); 
		
	}
}


/* Coded by
   Md Aziz Hosen
   2053CSE00883
*/