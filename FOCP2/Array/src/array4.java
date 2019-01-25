import java.util.*;
class array4
{
	static int [] arr = new int[10];
	static int opt,t,y,even=0;
	public static void input(int [] arr)
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter Value: ");
		for(int x=0;x<5;x++)
		{
			arr[x]=sc.nextInt();
		}
	}  
	public static void output(int [] arr)
	{
		for (int x=0;x<5;x++)
		{
			System.out.println("Value at arr("+x+") is: "+arr[x]);
		}
	}
	public static void sum(int [] arr)
	{
		for (int x=0;x<5;x++)
		{
			t=arr[x]+t;
		}
		System.out.println("Sum of Elements of an array is :"+t);
	}
	public static void gno(int [] arr)
	{
		for (int x=0;x<5;x++)
		{
			if(arr[x]>arr[x+1])
			{
				y=arr[x];
			}

		}
		System.out.println("Greatest no in an array is :"+y);
	}
	public static void sno(int [] arr)
	{
		for (int x=0;x<5;x++)
		{
			if(arr[x]<arr[x+1])
			{
				y=arr[x];
			}

		}
		System.out.println("Greatest no in an array is :"+y);
	}
	public static void slno(int [] arr)
	{
		for (int x=0;x<5;x++)
		{
			if(arr[x]>arr[x+1])
			{
				y=arr[x+1];
			}

		}
		System.out.println("Greatest no in an array is :"+y);
	}
	public static void asum(int [] arr)
	{
		for (int x=0;x<5;x++)
		{
			if(x%2==0)
			t=arr[x]+t;
		}
		System.out.println("Sum of alternate Elements of an array is :"+t);
	}
	public static void even(int [] arr)
	{
		for (int x=0;x<5;x++)
		{
			if(x%2==0)
			even++;
		}
		System.out.println("Sum of alternate Elements of an array is :"+t);
	}
	public static void frequency(int [] arr) 
{ 
    int count = 0,k;
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter element from array: ");
    k=sc.nextInt();
    for (int x=0; x < 5; x++) 
       {
       	if (arr[x] == k)  
          {count++;}} 
     System.out.println(k+" occurs "+count+" times");
} 
	public static void menu(int opt)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("1. Its elements");
		System.out.println("2. Sum of all the elements");
		System.out.println("3. Largest number in the array");
		System.out.println("4. Smallest number in the array");
		System.out.println("5. Second largest number in the array");
		System.out.println("6. Sum of alternate elements in the array");
		System.out.println("7. Count of even numbers in the array");
		System.out.println("8. Occurrence of a given number in the array and its frequency");
		System.out.print("Select from given option: ");
		opt=sc.nextInt();
		switch(opt)
		{
			case 1: output(arr);
					break;
			case 2: sum(arr);
					break;
			case 3: gno(arr);
					break;
			case 4: sno(arr);
					break;
			case 5: slno(arr);
					break;
			case 6: asum(arr);
					break;
			case 7: even(arr);
					break;
			case 8: frequency(arr);
					break;		
		}
	}
	public static void main(String[] args)
	{
		input(arr);
		menu(opt);
	}
}