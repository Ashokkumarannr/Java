import java.util.*;
import java.lang.*;
public class Strong{
public static void main(String args[]){
int fact,rem=0,sum=0;
Scanner scan=new Scanner(System.in); 
System.out.println("Enter a number");
int num=scan.nextInt();
int temp=num;
while(num>0)
{
    fact=1;
    rem=num%10;
    while(rem>0)
    {
        fact=fact*rem;
        rem--;
    }
    sum+=fact;
    num=num/10;
}
if(temp==sum)
{
    System.out.println("number is a strong number");
}
else{
    System.out.println("number is not a strong number");
}
}
}