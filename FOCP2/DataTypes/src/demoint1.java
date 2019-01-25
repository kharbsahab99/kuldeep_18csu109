//taking values from user
import java.util.*;
class demoint1
{
	public static void main(String [] args)
	{
		int add,sub,multi,div,mod;
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		int a = consoleInput.nextInt();
		System.out.print("Enter value of b: ");
		int b = consoleInput.nextInt();
		add=a+b;
		sub=a-b;
		multi=a*b;
		div=b/a;
		mod=b%a;
		System.out.println("a+b="+add);
		System.out.println("a-b="+sub);
		System.out.println("a*b="+multi);
		System.out.println("b/a="+div);
		System.out.println("b%a="+mod);
	}
}