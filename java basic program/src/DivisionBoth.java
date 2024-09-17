import java.util.*;
public class DivisionBoth
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    System.out.println("Enter any number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num%3==0 && num%5==0)
		{
		    
		        System.out.println("Given Number is divisible by 3 and 5"); 
		}
		else
		{
		   System.out.println("Given Number is not divisible by 3 and 5"); 
		}
	}
}