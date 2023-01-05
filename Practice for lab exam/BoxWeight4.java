class BoxWeight4 extends Box4{
	public double weight;
	
	
	
	BoxWeight4 (){
		super();
		weight = -1;
	}
	
	BoxWeight4 ( double height, double width, double depth, double weight ){
		super ( height, width, depth );
		this.weight = weight;
	}
	
	BoxWeight4 ( double heightWidthDepth, double weight ){
		super ( heightWidthDepth );
		this.weight = weight;
	}
	
	BoxWeight4 ( BoxWeight4 objects ){
		super ( objects );
		this.weight = objects.weight;
	}
	
}