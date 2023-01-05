class BoxWeight2 extends Box2{
	public double weight;
	BoxWeight2(){
		super();
		weight = -1;
	}
	BoxWeight2 ( double length, double width, double depth, double weight ){
		super ( length, width, depth );
		this.weight = weight;
	}
	BoxWeight2( double lengthOfACube, double weight ){
		super ( lengthOfACube );
		this.weight = weight;
	}
	BoxWeight2( BoxWeight2 objects ){
		super ( objects );
		weight = objects.weight;
	}
}