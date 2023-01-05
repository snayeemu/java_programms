


public class TryCatch {
	
	static int sum(int a, int b){
		return a+b;
	}

    public static void main(String[] args) {
    	//Try - Catch
    	String [] cars = {"Maruti Harry", "Maruti", "Suzuki", "Innova", "Ford Titanium"};
    	try{
    		System.out.println(cars[3]);
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
    	System.out.println("Masoom");
    	System.out.println(sum (5, 7));
    }
    
    
}