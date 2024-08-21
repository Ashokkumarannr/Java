import java.util.*;
public class Rectangle{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the width and height");
double width=scan.nextDouble();
double height=scan.nextDouble();
double Area = width * height;
double Perimeter = 2 * ( width + height);
System.out.println("Area of the Rectangle "+Area);
System.out.println("Perimeter of the Rectangle "+Perimeter);
}
}
