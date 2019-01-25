class Cylinder extends Circle
{
	private double height;
	public Cylinder()
	{
		super();
		this.height=h;
	}
	public Cylinder(double r)
	{
		super();
		this.height=10;
	}
	public Cylinder(double r,double h)
	{
		super(r);
		this.height=h;
	}
	public Cylinder(double r,double c)
	{
		super(r,c);
		this.h=h;
	}
	public double getVolume()
	{
		return super.getArea()*height;
	}
}