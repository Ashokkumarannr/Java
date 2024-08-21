import java.util.*;
public class EvenOdd{
public static void  main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number : ");
int a=scan.nextInt();
if(a%2==0)
{
System.out.println("Entered number is even");
}
else
{
System.out.println("Entered number is odd");
}
}
}