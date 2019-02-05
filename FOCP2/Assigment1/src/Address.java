class Address
{
	String line1;
	String line2;
	String city;
	String state;
	int pinCode;
	
	void setline1(String line1)
	{
		this.line1=line1;
	}
	String getline1()
	{
		return line1;
	}
	
	void setline2(String line2)
	{
		this.line2=line2;
	}
	String getline2()
	{
		return line2;
	}
	
	void setcity(String city)
	{
		this.city=city;
	}
	String getcity()
	{
		return city;
	}
	
	void setstate(String state)
	{
		this.state=state;
	}
	String getstate()
	{
		return state;
	}
	
	void setpinCode(int pinCode)
	{
		this.pinCode=pinCode;
	}
	int getpinCode()
	{
		return pinCode;
	}
}