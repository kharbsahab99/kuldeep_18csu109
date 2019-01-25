class Circle
{
	private double radius,c1,c2,c3;
	private String color;
	public Circle()
	{
		this.radius=1.0;
		this.color="red";
	}
	public Circle(double r,String c)
	{
		this.radius=r;
		this.color=c;
	}
	public Circle(double r)
	{
		this.radius=r;
		this.color="red";
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		this.radius=r;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String c)
	{
		this.color=c;
	}
	public double getArea(double r)
	{
		return 3.14*r*r;
	}
}