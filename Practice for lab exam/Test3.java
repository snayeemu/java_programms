class Test3{
	public static void main( String[] args ){
		BoxWeight3 defaultBox = new BoxWeight3();
		BoxWeight3 box1 = new BoxWeight3( 4.1, 5.5, 9.2 ,2.6 );
		BoxWeight3 box2 = new BoxWeight3( 4.3, 2.2, 8.5, 9.2 );
		BoxWeight3 cubeBox = new BoxWeight3( 9, 78 );
		BoxWeight3 boxClone = new BoxWeight3( box1 );
		
		System.out.printf("%s %.2f\n", "Volume of default box is:", defaultBox.volume() );
		System.out.printf("%s %.2f\n", "Weight of default box is:", defaultBox.weight );
		
		System.out.printf("\n%s %.2f\n", "Volume of box1 is:", box1.volume() );
		System.out.printf("%s %.2f\n", "Weight of box1 is:", box1.weight );
		
		System.out.printf("\n%s %.2f\n", "Volume of box2 is:", box2.volume() );
		System.out.printf("%s %.2f\n", "Weight of box2 is:", box2.weight );
		
		System.out.printf("\n%s %.2f\n", "Volume of cubeBox is:", cubeBox.volume() );
		System.out.printf("%s %.2f\n", "Weight of cubeBox is:", cubeBox.weight );
		
		System.out.printf("\n%s %.2f\n", "Volume of boxClone is:", boxClone.volume() );
		System.out.printf("%s %.2f\n\n\n\n", "Weight of boxClone is:", boxClone.weight );
	}
}