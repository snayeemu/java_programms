class Test2{
	public static void main( String[] args ){
		BoxWeight2 boxDefault = new BoxWeight2();
		BoxWeight2 box1 = new BoxWeight2( 3, 4, 5, 6 );
		BoxWeight2 box2 = new BoxWeight2( 5, 2, 8, 9 );
		BoxWeight2 boxCube = new BoxWeight2( 11, 18);
		BoxWeight2 boxClone = new BoxWeight2( box2 );
		
		System.out.println();
		System.out.println("Volume of box default is: " + boxDefault.volume() );
		System.out.println("Weight of box default is: " + boxDefault.weight );
		
		System.out.println();
		System.out.println("Volume of box1 is: " + box1.volume() );
		System.out.println("Weight of box1 is: " + box1.weight );
		
		System.out.println();
		System.out.println("Volume of box2 is: " + box2.volume() );
		System.out.println("Weight of box2 is: " + box2.weight );
		
		System.out.println();
		System.out.println("Volume of boxCube is: " + boxCube.volume() );
		System.out.println("Weight of boxCube is: " + boxCube.weight );
		
		System.out.println();
		System.out.println("Volume of boxClone is: " + boxClone.volume() );
		System.out.println("Weight of boxClone is: " + boxClone.weight );
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
}