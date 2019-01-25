class Distance
{
	public float inch,feet;
	Distance()
	{
		this.inch=0;
		this.feet=0;
	} 
	Distance(float inch,float feet)
	{
		this.inch=inch;
		this.feet=feet;
	}
	public void setInch (float inch)
	{
		this.inch = inch;
	}
	public float getInch()
	{
		return this.inch ;
	}
	public void setFeet(float feet)
	{
		this.feet= feet ;
	}
	public float getFeet()
	{
		return this.feet;
	}
	public float sum(Distance d1,Distance d2)
	{
		float sum = (d1.getInch()+d2.getFeet());
		return sum ;
	}
}