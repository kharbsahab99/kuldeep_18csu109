class Box
{
	double width;
	double height;
	double depth;
	void setDim(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	{
		double volume=height*depth*width;
		return volume;
	}
}

class BoxDemo
{
	public static void main(String [] args)
	{
		Box b=new Box();
		b.setDim(1,2,3);
		double vol=b.volume();
		System.out.print(vol);
	}
}