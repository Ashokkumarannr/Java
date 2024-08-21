import java.util.*;
public class PositiveNumber{
public static void  main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number : ");
int a=scan.nextInt();
if(a>=0)
{
System.out.println("Entered number is positive");
}
else
{
System.out.println("Entered number is negative");
}
}
}