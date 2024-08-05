import java.util.*;
import java.lang.*;
public class Palindrome{
public static void main(String args[]){
int rem=0,rev=0;
Scanner scan=new Scanner(System.in); 
System.out.println("Enter a number");
int num=scan.nextInt();
int temp=num;
while(num>0)
{
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;
}
if(temp==rev)
{
    System.out.println("number is a palindrome");
}
else{
    System.out.println("number is not a palindrome");
}
}
}