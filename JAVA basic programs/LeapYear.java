import java.util.*;
public class LeapYear
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    System.out.println("Enter any year");
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		if(year%100==0)
		{
		    if(year%400==0)
		    {
		       System.out.println("This is leap year"); 
		    }
		    else
		    {
		        System.out.println("This is not a leap year"); 
		    }
		}
		else
		{
		  if(year%4==0)
		    {
		       System.out.println("This is leap year"); 
		    }
		    else
		    {
		        System.out.println("This is not a leap year"); 
		    }  
		}
	}
}