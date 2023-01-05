class Box3{
	private double length;
	private double width;
	private double depth;
	
	Box3(){
		length = -1;
		width = -1;
		depth = -1;
	}
	Box3( double length, double width, double depth ){
		this.length = length;
		this.width = width;
		this.depth = depth ;
	}
	
	
	Box3( double lengthWidthDepth){
		this.length = this.width = this.depth = lengthWidthDepth;
	}
	
	Box3( Box3 objects ){
		this.length = objects.length;
		this.width = objects.width;
		this.depth = objects.depth;
	}
	
	public double volume(){
		return length * width * depth;
	}
}