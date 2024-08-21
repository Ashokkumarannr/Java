import java.util.*;
public class MonthlySalary{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the basic salary of Employee");
int salary=scan.nextInt();
double hra=0.4*salary;
double pf=0.12*salary;
int medicalAllowance=1200;
int travellingAllowance=800;
int tax=300;
double handSalary=salary+hra-pf+medicalAllowance+travellingAllowance-tax;
System.out.println("Monthly in hand salary of an employee : "+handSalary);

}
}