import java.util.HashSet;
import java.util.Scanner;

public class employeeservice {
    HashSet<employee> empset = new HashSet<>();

    employee emp1 = new employee(101, "developer", 21, "ashok", "IT", 25000);
    employee emp2 = new employee(102, "tester", 24, "ashok", "IT", 25000);
    employee emp3 = new employee(103, "data analyst", 27, "ashok", "IT", 25000);
    employee emp4 = new employee(104, "web dev", 26, "ashok", "IT", 25000);
    employee emp5 = new employee(105, "java developer", 28, "ashok", "IT", 25000);

    Scanner sc = new Scanner(System.in);

    public employeeservice() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
        empset.add(emp5);
    }

    public void viewAllEmps() {
        for (employee emp : empset) {
            System.out.println(emp);
        }
    }

    // View single employee
    public void viewEmp() {
        System.out.println("Enter the id:");
        int id = sc.nextInt();
        boolean found = false;
        for (employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with this id is not present");
        }
    }

    // Update employee details
    public void updateEmployee() {
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        boolean found = false;
        for (employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println("Enter name: ");
                String name = sc.next();
                System.out.println("Enter new Salary");
                double salary = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(salary);
                System.out.println("Updated Details of employee are: ");
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        } else {
            System.out.println("Employee details updated successfully!!");
        }
    }

    // Delete employee
    public void deleteEmp() {
        System.out.println("Enter id");
        int id = sc.nextInt();
        boolean found = false;
        employee empdelete = null;
        for (employee emp : empset) {
            if (emp.getId() == id) {
                empdelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        } else {
            empset.remove(empdelete);
            System.out.println("Employee deleted successfully!!");
        }
    }

    // Add new employee
    public void addEmp() {
        System.out.println("Enter id:");
        int id = sc.nextInt();
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter Designation");
        String designation = sc.next();
        System.out.println("Enter Department");
        String department = sc.next();
        System.out.println("Enter salary");
        double salary = sc.nextDouble();

        employee emp = new employee(id, designation, age, name, department, salary);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee added successfully");
    }
}