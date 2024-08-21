import java.util.*;
public class SmallestBetweenFive{
public static void  main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter five number : ");
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=scan.nextInt();
int e=scan.nextInt();
int min=a;
if(min>=a) min=a;
if(min>=b) min=b;
if(min>=c) min=c;
if(min>=d) min=d;
if(min>=e) min=e;
System.out.println("Smallest number between five number is "+min);
}
}