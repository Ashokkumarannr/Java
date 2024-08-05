import java.util.Scanner;
public class CircleTest{
   public static void main(String args[]){
	  Scanner scan  = new Scanner(System.in);
	  System.out.println("Enter radius");
	  double rad = scan.nextDouble();
	  
	  Circle c = new Circle(rad);
	  System.out.println("Area= "+c.area());
	  System.out.println("Perimeter= "+ c.perimeter());
   }
}