import java.util.*;
import  java.lang.Math;
class quad
{
	public static void main(String [] args) 
	{
		int a,b,c;
		double x1,x2;
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter Cofficient of a: ");
		a= sc.nextInt();
		System.out.print("Enter Cofficient of b: ");
		b= sc.nextInt();
		System.out.print("Enter Cofficient of c: ");
		c= sc.nextInt();
		System.out.println(a+"x^2 + "+b+"x + "+c+"is the given equation");
		x1=(-b+(Math.sqrt((b*b)-(4*a*c))))/(4*a*c);
		x2=(-b-(Math.sqrt((b*b)-(4*a*c))))/(4*a*c);
		if((Math.sqrt((b*b)-(4*a*c)))==0)
		{
			System.out.println("Roots of given equation are real and identical.");
			System.out.println("x1 = x2: "+x2);
		}
		else if((Math.sqrt((b*b)-(4*a*c)))>=0)
		{
			System.out.println("Roots of given equation are real and distinct.");
			System.out.println("x1: "+x1+"x2: "+x2);
		}
		else
		{
			System.out.println("Roots of given equation doesn't exist.");
		}
	}
}