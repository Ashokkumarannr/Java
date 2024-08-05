import java.util.*;
public class IntegerCheck{
public static void  main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number : ");
int a=scan.nextInt();
if(a==0)
{
System.out.println("\n0");
}
else if(a>0)
System.out.println("\n1");
else
System.out.println("\n-1");
}
}