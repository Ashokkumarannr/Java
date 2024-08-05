/*1. Create a class Emp with fields like empId, name,dept,salary,address.
  Write required constructors for initialization
  Write a method displayEmpDetails() in the same class.
  
  Write another test class , where you have to take emp details from user using Scanner and create object and call methods.*/
  public class Employee{
		  int empId;
		  String name;
		  String dept;
		  int salary;
		  String address;
		  
		  Employee(int i,String n,String d,int s,String a){	
		  empId=i;
		  name=n;
		  dept=d;
		  salary=s;
		  address=a;
		  }
		  
		  void displayEmpDetails(){
			  System.out.println(empId+" "+name+" "+dept+" "+salary+" "+address);
		  }
  }
  