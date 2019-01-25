import java.util.* ;

class Point1
{
	private double x ;
	private double y ;
	Point1()
	{
		this.x = 0 ;
		this.y = 0 ;
	}
	Point1(double x)
	{
		this.x = x ;
		this.y = 0 ;
	}
	Point1(double x, double y)
	{
		this.x = x ;
		this.y = y ;
	}
	public void setX (double x)
	{
		this.x = x ;
	}
	public double getX()
	{
		return this.x ;
	}
	public void setY(double y)
	{
		this.y= y ;
	}
	public double getY()
	{
		return this.y;
	}
	public static double calculateDistance(Point p1,Point p2)
	{
		double distance = Math.sqrt((p1.getX() - p2.getX())*(p1.getX() - p2.getX()) + (p1.getY() - p2.getY())*(p1.getY() - p2.getY())) ;
		return distance ;
	}
}