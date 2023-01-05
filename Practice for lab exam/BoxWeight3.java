class BoxWeight3 extends Box3{
	public double weight;
	BoxWeight3(){
		super();
		weight = -1;
	}
	BoxWeight3( double length, double width, double depth, double weight ){
		super ( length, width, depth );
		this.weight = weight;
	}
	
	
	BoxWeight3( double lengthWidthDepth, double weight ){
		super ( lengthWidthDepth );
		this.weight = weight;
	}
	
	BoxWeight3( BoxWeight3 objects ){
		super ( objects );
		weight = objects.weight;
	}
}