class Test1{
	public static void main( String[] args ){
		BoxWeight1 box1 = new BoxWeight1( 3, 5, 6, 7 );
		BoxWeight1 box2 = new BoxWeight1( 2, 3, 9, 6 );
		BoxWeight1 boxCube = new BoxWeight1( 5, 8 );
		BoxWeight1 boxClone = new BoxWeight1( box2 );
		BoxWeight1 boxDefault = new BoxWeight1();
		
		System.out.println();
		System.out.println("The volume of box1 is: " + box1.volume());
		System.out.println("The weight of box1 is: " + box1.weight);
		
		System.out.println();
		System.out.println("The volume of box2 is: " + box2.volume());
		System.out.println("The weight of box2 is: " + box2.weight);
		
		System.out.println();
		System.out.println("The volume of boxCube is: " + boxCube.volume());
		System.out.println("The weight of boxCube is: " + boxCube.weight);
		
		System.out.println();
		System.out.println("The volume of boxClone is: " + boxClone.volume());
		System.out.println("The weight of boxClone is: " + boxClone.weight);
		
		System.out.println();
		System.out.println("The volume of box Default is: " + boxDefault.volume());
		System.out.println("The weight of box Default is: " + boxDefault.weight);
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
}