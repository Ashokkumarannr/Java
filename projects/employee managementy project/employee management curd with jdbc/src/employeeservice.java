import java.sql.*;
import java.util.Scanner;

public class employeeservice {
    Connection con;
    Scanner sc = new Scanner(System.in);

    // Constructor to initialize the database connection
    public employeeservice() {
        try {
            // Register JDBC driver and open connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "ashok@"); // Replace with your DB credentials
            System.out.println("Connected to database successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Add new employee
    public void addEmp() {
        try {
            System.out.println("Enter id:");
            int id = sc.nextInt();
            System.out.println("Enter name:");
            String name = sc.next();
            System.out.println("Enter age:");
            int age = sc.nextInt();
            System.out.println("Enter designation:");
            String designation = sc.next();
            System.out.println("Enter department:");
            String department = sc.next();
            System.out.println("Enter salary:");
            double salary = sc.nextDouble();

            // SQL Insert Statement
            String sql = "INSERT INTO employee (id, name, age, designation, department, salary) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, age);
            pst.setString(4, designation);
            pst.setString(5, department);
            pst.setDouble(6, salary);

            pst.executeUpdate();
            System.out.println("Employee added successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View all employees
    public void viewAllEmps() {
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age")
                        + ", Designation: " + rs.getString("designation") + ", Department: " + rs.getString("department")
                        + ", Salary: " + rs.getDouble("salary"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View a single employee by ID
    public void viewEmp() {
        try {
            System.out.println("Enter the employee ID:");
            int id = sc.nextInt();

            String sql = "SELECT * FROM employee WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age")
                        + ", Designation: " + rs.getString("designation") + ", Department: " + rs.getString("department")
                        + ", Salary: " + rs.getDouble("salary"));
            } else {
                System.out.println("Employee not found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update an employee
    public void updateEmployee() {
        try {
            System.out.println("Enter the employee ID:");
            int id = sc.nextInt();

            System.out.println("Enter new name:");
            String name = sc.next();
            System.out.println("Enter new salary:");
            double salary = sc.nextDouble();

            String sql = "UPDATE employee SET name = ?, salary = ? WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setDouble(2, salary);
            pst.setInt(3, id);

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee updated successfully");
            } else {
                System.out.println("Employee not found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete an employee
    public void deleteEmp() {
        try {
            System.out.println("Enter the employee ID to delete:");
            int id = sc.nextInt();

            String sql = "DELETE FROM employee WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowsDeleted = pst.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Employee deleted successfully");
            } else {
                System.out.println("Employee not found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
