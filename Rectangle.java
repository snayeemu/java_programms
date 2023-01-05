class Rectangle{
	double length;
	double width;
	Rectangle( double length, double width){
		this.length = length;
		this.width = width;
	}
	public void setLengthWidth( double length, double width ){
		this.length = length;
		this.width = width;
	}
	public double getArea(){
		return length * width;
	}
}