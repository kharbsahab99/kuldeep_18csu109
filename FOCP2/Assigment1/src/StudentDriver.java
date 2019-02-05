import java.util.*;
import java.text.SimpleDateFormat;
class StudentDriver
{
	public void student()
	{
		Scanner sc=new Scanner(System.in);
		Student d1=new Student();
		System.out.println("\t\t\tSTUDENT FORM\n");
		System.out.print("Enter Student first name : ");
		d1.setfirstName(sc.next());
		System.out.print("\nEnter Student last name  : ");
		d1.setlastName(sc.next());
		System.out.println("\nEnter Address : ");
		System.out.print("LINE 1  : ");
		d1.addr.setline1(sc.next());
		System.out.print("LINE 2  : ");
		d1.addr.setline2(sc.next());
		System.out.print("City    : ");
		d1.addr.setcity(sc.next());
		System.out.print("State   : ");
		d1.addr.setstate(sc.next());
		System.out.print("PinCode : ");
		d1.addr.setpinCode(sc.nextInt());
		System.out.print("\nE-Mail : ");
		d1.seteMail(sc.next());
		System.out.print("\nContact No. : ");
		d1.setcontactNo(sc.next());
		
		
		System.out.print("Enter Student Date of Birth : ");
			sc.nextLine();
			SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
			String dob=sc.nextLine();
			try
			{
				d1.setdob(sdf.parse(dob));
			}
			catch(Exception e){ };
		System.out.print("\nNo. of Skills you want to enter : ");
		int sno=sc.nextInt();
		sc.nextLine();
		d1.skills=new String[sno];
		System.out.println("Enter Skills : ");
		for(int i=0;i<sno;i++)
		{
			System.out.print("\t"+(i+1)+". : ");
			d1.skills[i]=sc.nextLine();
		}
		System.out.print("\nNo. of Qualification you have done : ");
		int qno=sc.nextInt();
		sc.nextLine();
		d1.qual=new Qualification[qno];
		System.out.println("\nEnter Qualification : ");
		for(int j=0;j<qno;j++)
		{
			d1.qual[j]= new Qualification();
			System.out.print("Qualification Name : ");
			d1.qual[j].setqualName(sc.nextLine());
			System.out.print("University Name    : ");
			d1.qual[j].setuniversity(sc.nextLine());
			System.out.print("Institute Name     : ");
			d1.qual[j].setinstitute(sc.nextLine());
			System.out.print("CGPA               : ");
			d1.qual[j].setcgpa(sc.nextFloat());
		}
		System.out.print("\nNo. of Projects you have done : ");
		int pno=sc.nextInt();
		sc.nextLine();
		int rno=0;
		d1.projects=new Project[pno];
		System.out.println("\nEnter Projects:: ");
		for(int l=0;l<pno;l++)
		{
			d1.projects[l]= new Project();
			System.out.print("Name           : ");
			d1.projects[l].setname(sc.next());
			System.out.print("Start Date     : ");
			//String projects[l].setDate=sc.nextLine();
			//SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
			sc.nextLine();
			try
			{
				d1.projects[l].setstartDate(sdf.parse(sc.nextLine()));
			}
			catch(Exception e){ };
			
			System.out.print("End Date       : ");
			//String projects[l].endDate=sc.nextLine();
			//SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
			try
			{
				d1.projects[l].setendDate(sdf.parse(sc.nextLine()));
			}
			catch(Exception e){ };
			System.out.print("Enter no. of Responsibility: ");
			rno=sc.nextInt();
			d1.projects[l].responsibilities=new String[rno];
			System.out.println("Responsibility : ");
			for(int k=0;k<rno;k++)
			{
				//d1.projects[k]= new Project();
				System.out.print("\t"+(k+1)+". : ");
				d1.projects[l].responsibilities[k]=sc.next();
			}
		}






//_________________________________________________________________________________________________________________
		
		System.out.println("________________________");
		System.out.println("\nFirst Name       : "+d1.getfirstName());
		System.out.println("\nLast Name        : "+d1.getlastName());
		System.out.println("\nAddress          : ");
		System.out.println("Line1     : "+d1.addr.getline1());
		System.out.println("Line2     : "+d1.addr.getline2());
		System.out.println("City      : "+d1.addr.getcity());
		System.out.println("State     : "+d1.addr.getstate());
		System.out.println("PinCode   : "+d1.addr.getpinCode());
		System.out.println("DOB        : "+d1.getdob());
		System.out.println("\nE-Mail           : "+d1.geteMail());
		System.out.println("\nContact No.      : "+d1.getcontactNo());
		System.out.println("\nSkills           :");
		for(int i=0;i<sno;i++)
		{
			System.out.println("\t"+(i+1)+". : "+d1.skills[i]);
		}
		System.out.println("\nQualification    : ");
		for(int j=0;j<qno;j++)
		{
			System.out.println("QName      : "+d1.qual[j].getqualName());
			System.out.println("University : "+d1.qual[j].getuniversity());
			System.out.println("Institute  : "+d1.qual[j].getinstitute());
			System.out.println("CGPA       : "+d1.qual[j].getcgpa());
		}
		System.out.println("\nProjects         : ");
		for(int l=0;l<pno;l++)
		{
			System.out.println("Name       : "+d1.projects[l].getname());
			System.out.println("Start Date           : "+d1.projects[l].getstartDate());
			System.out.println("End Date             : "+d1.projects[l].getendDate());
			for(int k=0;k<rno;k++)
			{
				System.out.println("\t"+(k+1)+". : "+d1.projects[l].responsibilities[k]);
			}
		}

	}
	
	public static void main(String [] args)
	{
		
		StudentDriver s1=new StudentDriver();
		s1.student();
	}
	
}