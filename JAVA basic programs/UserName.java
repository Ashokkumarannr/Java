
import java.util.*;
public class Average{
public static void main(String args[])
{
System.out.println("Enter 5 number for average");
Scanner scan=new Scanner(System.in);
Double a=scan.nextDouble();
Double b=scan.nextDouble();
Double c=scan.nextDouble();
Double d=scan.nextDouble();
Double e=scan.nextDouble();
Double avg=(a+b+c+d+e)/5;
System.out.println("Average is "+avg);
}
}