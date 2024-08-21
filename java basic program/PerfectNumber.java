import java.util.*;
public class PerfectNumber{
public static void main(String args[]){
int sum=0;
Scanner scan=new Scanner(System.in); 
System.out.println("Enter a number");
int num=scan.nextInt();
for(int i=1;i<num;i++)
{
    if(num%i==0)
    {
        sum+=i;
    }
}
if(num!=sum)
{
    System.out.println("Number is not perfect number");
}
else{
    System.out.println("Number is perfect number"); 
}
}
}