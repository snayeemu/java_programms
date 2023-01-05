class Box1{
	private double height;
	private double width;
	private double depth;
	Box1( Box1 objects ){
		height = objects.height;
		width = objects.width;
		depth= objects.depth;
	}
	Box1( double height, double width, double depth ){
		this.height = height;
		this.width = width;
		this.depth= depth;
	}
	Box1( double heightWidthDepth ){
		this.height = this.width = this.depth= heightWidthDepth;
	}
	Box1( ){
		this.height = -1;
		this.width = -1;
		this.depth= -1;
	}
	public double volume(){
		return height * width * depth;
	}
}