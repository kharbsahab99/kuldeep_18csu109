class DistanceSum 
{
 public static void main(String[] args) 
	{
		Distance d1=new Distance();
		Distance d2=new Distance(10,20);
		float sum = d1.sum(d1,d2);
		System.out.println("sum of Distance is " + sum);
	}
}
