import java.util.*;
public class SumAvg{
public static void main(String args[]){
int a[]=new int[10];
int sum=0;
Scanner scan=new Scanner(System.in); 
System.out.println("Enter 10 numbers");
for(int i=0;i<10;i++)
{
a[i]=scan.nextInt();
sum+=a[i];
}
double avg=sum/10.0;
System.out.println("Sum and average of 10 numbers :" + sum + " " + avg);
}
}