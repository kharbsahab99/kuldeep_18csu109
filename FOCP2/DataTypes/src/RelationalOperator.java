import java.util.*;
class RelationalOperator
{
	public static void main(String[] args) 
    {
    	int num1 = 12;
    	short num2 = 10;
    	boolean check1 ;
    	boolean check2 ;
    	check1 = num1>0?true:false;
    	check2= num1<0?true:false;
    	boolean check3 = (!check1 == check2);
    	boolean check4 = (check1 != check2 && false);
    	boolean check5 = (check1 || check2);
    	
    	System.out.println("check1 : " + check1);
		System.out.println("check2 : " + check2);
		System.out.println("check3 : " + check3);
		System.out.println("check4 : " + check4);
		System.out.println("check5 : " + check5);
    }
}