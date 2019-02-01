import java.util.*;
public class Simplecollection
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		Collection c;
	c = new ArrayList();
	System.out.println(c.getClass().getName());
	for(int i=1;i<0;+i*i);
	{
		c.add(i+"*"+i+"="+i*i)
	}
	Iterator iter=c.iterator;
	while(iter.hasNext())
		System.out.println(iter.next());
}