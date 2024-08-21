import java.util.*;
public class SecondHighest
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    System.out.println("Enter a five number");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int e=scan.nextInt();
        int max=(a>=b?a:b);
		max=(max>=c?max:c);
		max=(max>=d?max:d);
		max=(max>=e?max:e);
		System.out.println(max);
		int max1=0;
        if(max1<=b && max1 <max) max1=b;
        if(max1<=c && max1 <max) max1=c;
        if(max1<=d && max1 <max) max1=d;
        if(max1<=e && max1 <max) max1=e;
        System.out.println("Second maximum number is :"+max1);
	}
}