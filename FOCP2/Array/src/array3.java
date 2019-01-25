import java.util.*;
class array3
{
	public static void main(String[] args)
	{
		int [] arr = new int[10];
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter Value: ");
		for(int x=0;x<5;x++)
		{
			arr[x]=sc.nextInt();
		}
		for (int x=0;x<5;x++)
		{
			System.out.println("Value at arr("+x+") is: "+arr[x]);
		}
		for (int x=0;x<5;x++)
		{
			if((arr[x]%2)==0)
			{
				System.out.println("Value at arr("+x+") divisible by 2 is: "+arr[x]);
			}
		}
	}
}