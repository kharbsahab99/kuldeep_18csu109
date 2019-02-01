import java.lang.*;
public class FirstException
{
	public static void main(String[] args)
	{
		try
		{
			String exmessage="in valid";
			throw new Exception(exmessage); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("ok");
		}
	}
	}

