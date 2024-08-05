import java.util.*;
import java.lang.*;
public class FabonacciSeries{
public static void main(String args[]){
int x=0,y=1,z;
Scanner scan=new Scanner(System.in); 
System.out.println("Enter a number");
int num=scan.nextInt();
System.out.print(x+" "+y+" ");
for(int i=1;i<num-1;i++)
{
    z=x+y;
    System.out.print(z+" ");
    x=y;
    y=z;   
}
}
}