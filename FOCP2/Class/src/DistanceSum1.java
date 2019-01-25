class DistanceSum1
{
 public static void main(String[] args) 
	{
		Distance1 d1=new Distance1();
		Distance1 d2=new Distance1(10,20);
		float sum = Distance1.sum(d1,d2);
		System.out.println("sum of Distance is " + sum);
	}
}
