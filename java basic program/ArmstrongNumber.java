import java.util.*;
import java.lang.*;
public class ArmstrongNumber{
public static void main(String args[]){
int sum=0,rem=0;
Scanner scan=new Scanner(System.in); 
System.out.println("Enter a number");
int num=scan.nextInt();
int temp=num;
while(temp>0)
{
    rem=temp%10;
    sum+=Math.pow(rem,3);
    temp=temp/10;
}

if(num!=sum)
{
    System.out.println("Number is not an armstrong number");
}
else{
    System.out.println("Number is an armstrong number"); 
}
}
}