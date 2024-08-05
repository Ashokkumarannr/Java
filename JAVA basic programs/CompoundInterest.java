import java.util.*;
import java.lang.*;
public class CompoundInterest{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the principal value");
int principal=scan.nextInt();
System.out.println("Enter the rate");
double rate=scan.nextDouble();
System.out.println("Enter time");
double time=scan.nextDouble();
double compoundInterest=(principal*Math.pow(1+(rate/100),time));
System.out.println("Compound Interest "+compoundInterest);
}
}