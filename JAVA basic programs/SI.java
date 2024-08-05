import java.util.*;
public class SI{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal");
		Double p=sc.nextDouble();
		System.out.println("Enter the rate");
		Double r=sc.nextDouble();
		System.out.println("Enter the years");
		int y=sc.nextInt();
		Double si=(p*r*y)/100.0;
		System.out.println("Simple interest is "+si);
	}
}