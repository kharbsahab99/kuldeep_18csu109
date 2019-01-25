import java.util.*;   

class Sprint

{
	public static void main (String args[])

	{
		String ch;
		Scanner in =new Scanner(System.in);
    do{
    System.out.println("enter a five digit number");

    int a=in.nextInt();
    int n=a;
    int t=0;
    int rev=0,x;
    while(n!=0)
	{ 

	n=n/10;
	t++;
	} 

	if(t==5)
	{
		while(a!=0)

		{
			x=a%10;
		    rev =(rev*10)+x;
		    a=a/10;
		}
		while(rev!=0)
		{
			t=rev%10;
			System.out.print(t+"   ");
			rev=rev/10;
		}
	


	}
	else
		System.out.println("ERROR: Ennter a five digit number only");
	System.out.println(" \n do you want to continue?(press N if no, press any kye ton continue.)");
	ch= in.next();
}while (!(ch.equals("N")));

}  

}