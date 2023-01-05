


public class codewithharryj {

    public static void main(String[] args) {
    	// Java Arrays
    	int [] marks = {1, 2, 3, 5
    	};
    	marks[3] = 34; // this will update marks[3]
    	System.out.println(marks[0]);
    	System.out.println(marks[3]);
    	
    	//Classical way to iterate an array
    	for(int i=0; i<marks.length; i++)
    		System.out.println(marks[i]);
    		
    		System.out.println("This is for each loop:");
    		//for each loop
    		for(int value:marks)
    			System.out.println(value);
    			
    			int [][] matrix = {{1,2,3},{4,5,6}
    };
    System.out.println(matrix[0][1]);
    
    String [] cars = { "Maruti Harry", "Maruti", "Suzuki", "Innova", "Ford tittanium"};
    for(String value:cars){
    	System.out.println(value);
    }
}
}