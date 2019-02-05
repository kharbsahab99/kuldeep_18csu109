import java.util.*;
class Student
{
	String firstName;
	String  lastName;
	Address  addr;
	Date dob;
	String [] skills;
	Qualification [] qual;
	Project [] projects;
	String eMail;
	String contactNo;
	
	Student()
	{
		addr=new Address();
	}
	Student(int qsize,int psize)
	{
		qual=new Qualification[qsize];
		projects=new Project[psize];	
	}
		
	void setfirstName(String firstName)
	{
		this.firstName=firstName;
	}
	String getfirstName()
	{
		return firstName;
	}
	
	void setlastName(String lastName)
	{
		this.lastName=lastName;
	}
	String getlastName()
	{
		return lastName;
	}
	
	void setdob(Date dob)
	{
		this.dob=dob;
	}
	Date getdob()
	{
		return dob;
	}
	
	void seteMail(String eMail)
	{
		this.eMail=eMail;
	}
	String geteMail()
	{
		return eMail;
	}
	
	void setskills(String [] skills)
	{
		this.skills=skills;
	}
	String[] getskills()
	{
		return skills;
	}
	
	void setcontactNo(String contactNo)
	{
		this.contactNo=contactNo;
	}
	String getcontactNo()
	{
		return contactNo;
	}	
}