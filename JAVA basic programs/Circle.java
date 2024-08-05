public class Circle{
	double radius;
	
	Circle(double radius){
	  this.radius = radius;
	}
	
	double area(){
		double area = Math.PI * radius * radius;
		return area;
	}
	
	double perimeter(){
		double perim = 2 * Math.PI * radius;
		return perim;
	}

}