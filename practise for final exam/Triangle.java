public class Triangle 
{
	private int base;
	private int height;
	
	public Triangle (int x, int y)
	{
		base=x;
		height=y;
	}
			
	public void setBaseAndHeight(int m, int n)
	{
		base=m;
		height=n;
	}
	
	public double displayArea()
	{
		return 0.5*base*height;
	}
	
}

/* Coded by
   Md Aziz Hosen
   2053CSE00883
*/