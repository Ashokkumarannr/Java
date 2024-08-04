import java.util.*;
public class CastVote{
public static void  main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter person age : ");
int a=scan.nextInt();
if(a>=18)
{
System.out.println("Persion is eligible to cast vote");
}
else
{
System.out.println("Persion is not eligible to cast vote");
}
}
}