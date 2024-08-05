import java.util.*;
public class LargestBetweenTwo{
public static void  main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter two number : ");
int a=scan.nextInt();
int b=scan.nextInt();
if(a>=b)
{
System.out.println("Largest number between two number is "+a);
}
else
{
System.out.println("Largest number between two number is "+b);
}
}
}