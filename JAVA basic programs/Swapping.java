import java.util.*;
public class Swapping{
public static void  main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter two number ");
int a=scan.nextInt();
int b=scan.nextInt();
System.out.println("your entered number is "+a+" "+b);
int temp=a;
a=b;
b=temp;
System.out.println("Your entered number after swapping "+a+" "+b);
}
}