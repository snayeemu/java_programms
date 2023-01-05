class Test4{
	public static void main( String[] angs ){
		BoxWeight4 defaultBox = new BoxWeight4();
		BoxWeight4 box1 = new BoxWeight4( 2.2, 3.3, 5.5, 5);
		BoxWeight4 box2 = new BoxWeight4( 5, 2, 4, 34);
		BoxWeight4 boxCube = new BoxWeight4( 5, 6 );
		BoxWeight4 boxCopy = new BoxWeight4( box2 );
		
		System.out.printf("%s%.2f\n", "Volume of box1 is: ", box1.volume() );
		System.out.printf("%s%.2f\n\n", "Weight of box1 is: ", box1.weight );
		
		System.out.printf("%s%.2f\n", "Volume of box2 is: ", box2.volume() );
		System.out.printf("%s%.2f\n\n", "Weight of box2 is: ", box2.weight );
		
		System.out.printf("%s%.2f\n", "Volume of boxCube is: ", boxCube.volume() );
		System.out.printf("%s%.2f\n\n", "Weight of boxCube is: ", boxCube.weight );
		
		System.out.printf("%s%.2f\n", "Volume of defaultBox is: ", defaultBox.volume() );
		System.out.printf("%s%.2f\n\n", "Weight of defaultBox is: ", defaultBox.weight );
		
		System.out.printf("%s%.2f\n", "Volume of boxCopy is: ", boxCopy.volume() );
		System.out.printf("%s%.2f\n\n\n", "Weight of boxCopy is: ", boxCopy.weight );
	}
}