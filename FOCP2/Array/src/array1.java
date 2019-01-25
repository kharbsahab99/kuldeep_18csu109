import java.util.*;
class array1
{
	public static void main(String [] args)
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
		
		System.out.print("Enter Value to be searched:");
		int searchVal= sc.nextInt();
		int index=-1;
		for(int x=0;x<5;x++)
		{
			if(searchVal==arr[x])
			{
				index=x;
			}
		}
		System.out.print("index:" +index);
	}
}