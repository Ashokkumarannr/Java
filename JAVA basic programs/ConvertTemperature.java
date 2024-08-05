import java.util.*;
public class ConvertTemperature{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Temperature(in celsius)");
		Double C=sc.nextDouble();
		Double F = (9*C/5) + 32;
		System.out.println("Temperature(in fahrenheit) is "+F);
	}
    }