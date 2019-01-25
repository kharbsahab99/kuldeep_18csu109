import java.util.*;
class calander
{
	static int i,opt;
	public static void month(int i)
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter Value: ");
		i=sc.nextInt();
		if(i>=0&&i<=12)
		{
			switch(i)
			{
				case 1: System.out.println("Entered month is: Jan");
						break;
				case 2: System.out.println("Entered month is: Feb");
						break;
				case 3: System.out.println("Entered month is: Mar");
						break;
				case 4: System.out.println("Entered month is: Apr");
						break;
				case 5: System.out.println("Entered month is: May");
						break;
				case 6: System.out.println("Entered month is: Jun");
						break;
				case 7: System.out.println("Entered month is: July");
						break;
				case 8: System.out.println("Entered month is: Aug");
						break;
				case 9: System.out.println("Entered month is: Sept");
						break;
				case 10: System.out.println("Entered month is: Oct");
						break;
				case 11: System.out.println("Entered month is: Nov");
						break;
				case 12: System.out.println("Entered month is: Dec");
						break;
			}
		}
		else
		{
			System.out.println("ERROR: Enter b/w 1-12");
		}
	}
	public static void menu(int opt)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Select from given option: ");
		System.out.println("1. Continue");
		System.out.println("2. Exit");
		opt=sc.nextInt();
		if(opt==1)
		{
			month(i);
			menu(opt);
		}
		else
		{
			System.out.print("Thank You");
		}
	}
	public static void main(String [] args) 
	{
		month(i);
		menu(opt);
	}
}