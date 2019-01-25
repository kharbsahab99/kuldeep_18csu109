import java.util.*;   

class Vowel

{
	public static void main (String args[])

	{
		
		Scanner in =new Scanner(System.in);
		String a;
        System.out.print("enter a Character: ");
        a=in.next();
        int x= a.length();
        if(x >1)

        	System.out.print("Enter only one Char");
        	else{//starting else
                char c=a.charAt(0);
                if ((c>='a'&&c<='z') ||(c>='A'&&c<='Z'))//first if 
              { 
               
                    if(c==('a') || c==('e')||c==('i')||c==('o')||c==('u')||c==('A')||c==('E')||c==('I')||c==('O') || c==('U'))//second if
        	            System.out.println("Entered char is a vowel");
        
                     else //else of second if
        	
        	           System.out.println("Entered char in a consonent.");
    
            }//end of first if    
          else //else of second if
             System.out.println("ERROR: Enter a valid Character.");	
        }//end of starting else
        


		
    
}  

}