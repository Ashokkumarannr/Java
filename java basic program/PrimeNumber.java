import java.util.*;
import java.lang.*;
public class PrimeNumber{
public static void main(String args[]){
int flag=0;
Scanner scan=new Scanner(System.in); 
System.out.println("Enter a number");
int num=scan.nextInt();
for(int i=2;i<num;i++)
{
    if(num%i==0)
    {
        flag=1;
        break;
    }
}

if(flag==1)
{
    System.out.println("Number is not a prime number");
}
else{
    System.out.println("Number is a prime number"); 
}
}
}