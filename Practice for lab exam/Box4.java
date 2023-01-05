class Box4{
	private double height;
	private double width;
	private double depth;
	
	Box4 (){
		this.height = -1;
		this.width = -1;
		this.depth = -1;
	}
	
	Box4 ( double height, double width, double depth ){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	Box4 ( double heightWidthDepth ){
		this.height = this.width = this.depth = heightWidthDepth;
	}
	
	Box4 ( Box4 objects ){
		this.height = objects.height;
		this.width = objects.width;
		this.depth = objects.depth;
	}
	
	public double volume(){
		return height * width * depth;
	}
}