import java.util.*;
public class EmployeeTest
{
public static void main(String args[])
{
  Scanner scan=new Scanner(System.in);  
  System.out.println("Enter the Employee id");
  int empId=scan.nextInt();
  System.out.println("Enter the Employee name ");
  String name=scan.next();
  System.out.println("Enter the Employee dept");
  String dept=scan.next();
  System.out.println("Enter the Employee salary");
  int salary=scan.nextInt();
  System.out.println("Enter the Employee address");
  String address=scan.next(); 
  Employee e1=new Employee(empId,name,dept,salary,address);
  e1.displayEmpDetails();
}	
}
