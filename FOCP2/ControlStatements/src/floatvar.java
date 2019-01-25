import java.util.*;
import java.text.DecimalFormat;
class floatvar
{
	public static void main(String [] args) 
	{
		float x1,x2;
		int i;
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter x1: ");
		x1=sc.nextFloat();
		System.out.print("Enter x2: ");
		x2=sc.nextFloat();
		DecimalFormat df= new DecimalFormat("#0.000");
		if (x1==x2)
		{
			System.out.println("x1: "+df.format(x1)+" is equal to x2: "+df.format(x2));	
		}
		else
		{
			System.out.println("x1 is not equal to x2");	
		}

	}
}