import java.util.*;
public class
AvgMarks
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    System.out.println("Enter the marks of Physics, Chemistry and Math");
		Scanner scan=new Scanner(System.in);
		int Phy=scan.nextInt();
		int Chem=scan.nextInt();
		int Math=scan.nextInt();
		int avg=(Phy+Chem+Math)/3;
		if(avg<30)
		{
		    System.out.println("You are failed.");
		}
		else if(avg>=30 && avg<60)
		{
		    
		        System.out.println("You passed with Second division"); 
		}
			else if(avg>=60 && avg<80)
		{
		    
		        System.out.println("You passed with Fiear division"); 
		}
		else
		{
		   System.out.println(" You passed with First class distinction"); 
		}
	}
}