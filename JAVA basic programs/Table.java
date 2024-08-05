import java.util.*;
public class Table{
public static void main(String args[]){
Scanner scan=new Scanner(System.in); 
System.out.println("Enter a numbers");
int a=scan.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(a+" * " + i + " = " + (a*i));
}
}
}