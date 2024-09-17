import java.util.*;
import java.lang.*;
public class NumberReverse{
public static void main(String args[]){
int rem=0,rev=0;
Scanner scan=new Scanner(System.in); 
System.out.println("Enter a number");
int num=scan.nextInt();

while(num>0)
{
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;
}
System.out.println("Number in reverse order is :"+rev);

}
}