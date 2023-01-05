class Box2{
	private double length;
	private double width;
	private double depth;
	Box2(){
		length = -1;
		width = -1;
		depth = -1;
	}
	Box2 ( double length, double width, double depth ){
		this.length = length;
		this.width = width;
		this.depth = depth;
	}
	Box2( double lengthOfACube ){
		length = width = depth = lengthOfACube;
	}
	Box2( Box2 objects ){
		length = objects.length;
		width = objects.width;
		depth = objects.depth;
	}
	public double volume(){
		return length * width * depth;
	}
}