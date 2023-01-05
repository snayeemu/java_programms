class BoxWeight1 extends Box{
	public double weight;
	BoxWeight1( BoxWeight1 objects ){
		super ( objects);
		weight = objects.weight;
	}
	BoxWeight1 ( double height, double width, double depth, double weight ){
		super ( height, width, depth );
		this.weight = weight;
	}
	BoxWeight1( double heightWidthDepth, double weight ){
		super ( heightWidthDepth );
		this.weight = weight;
	}
	BoxWeight1( ){
		super();
		this.weight = -1;
	}
}