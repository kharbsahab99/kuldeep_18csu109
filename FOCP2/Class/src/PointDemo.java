class PointDemo 
{
 public static void main(String[] args) 
	{
		Point p1 = new Point();
		Point p2 = new Point(10,15);
		double distance = p1.calculateDistance(p1,p2);
		System.out.println("Distance is " + distance);
	}
}
