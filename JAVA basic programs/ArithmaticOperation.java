import java.util.Scanner;
public class ArithmaticOperation{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter the number 1:");
int a= in.nextInt();
System.out.println("enter the number 2:");
int b= in.nextInt();
int add=a+b;
System.out.println("Addition of two number "+add);
int sub=a-b;
System.out.println("Subtraction of two number "+sub);
int mul=a*b;
System.out.println("Multiplication of two number "+mul);
int div=a/b;
System.out.println("Division of two number "+div);
}
}