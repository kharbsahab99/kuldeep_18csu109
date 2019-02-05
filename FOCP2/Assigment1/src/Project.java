import java.util.*;
class Project
{
	String name;
	Date startDate;
	Date endDate;
	String role;
	String [] responsibilities;
	
	void setname(String name)
	{
		this.name=name;
	}	
	String getname()
	{
		return name;
	}
	
	void setstartDate(Date startDate)
	{
		this.startDate=startDate;
	}
	Date getstartDate()
	{
		return startDate;
	}
	
	void setendDate(Date endDate)
	{
		this.endDate=endDate;
	}
	Date getendDate()
	{
		return endDate;
	}
	
	void setrole(String role)
	{
		this.role=name;
	}	
	String getrole()
	{
		return role;
	}
	
	void setresponsibilities(String [] responsibilities)
	{
		this.responsibilities=responsibilities;
	}
	String [] getresponsibilities()
	{
		return responsibilities;
	}
}