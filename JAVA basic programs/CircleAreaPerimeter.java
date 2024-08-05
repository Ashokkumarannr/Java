import java.util.*;
public class CircleAreaPerimeter{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the radious of circle");
double radius=scan.nextDouble();
double Area = Math.PI * radius * radius;
double Perimeter = 2* Math.PI* radius;
System.out.println("Area of circle is "+Area);
System.out.println("Perimeter of circle is "+Perimeter);
}
}