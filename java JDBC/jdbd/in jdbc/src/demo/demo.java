//package demo;
//import java.sql.*;
//
///**
// *
// * @author www.luv2code.com
// *
// */
//public class demo {
//
//    public static void main(String[] args) throws SQLException {
//
//        Connection myConn = null;
//        Statement myStmt = null;
//        ResultSet myRs = null;
//
//        String dbUrl = "jdbc:mysql://localhost:3306/demo";
//        String user = "student";
//        String pass = "Changeme@123";
//
//        try {
//            // 1. Get a connection to database
//            myConn = DriverManager.getConnection(dbUrl, user, pass);
//
//            // 2. Create a statement
//            myStmt = myConn.createStatement();
//
//            // 3. Insert a new employee
//            System.out.println("Inserting a new employee to database\n");
//
//            int rowsAffected = myStmt.executeUpdate(
//                    "insert into employees " +
//                            "(last_name, first_name, email, department, salary) " +
//                            "values " +
//                            "('Wright', 'Eric', 'eric.wright@foo.com', 'HR', 33000.00)");
//
//            // 4. Verify this by getting a list of employees
//            myRs = myStmt.executeQuery("select * from employees order by last_name");
//
//            // 5. Process the result set
//            while (myRs.next()) {
//                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
//            }
//        }
//        catch (Exception exc) {
//            exc.printStackTrace();
//        }
//        finally {
//            if (myRs != null) {
//                myRs.close();
//            }
//
//            if (myStmt != null) {
//                myStmt.close();
//            }
//
//            if (myConn != null) {
//                myConn.close();
//            }
//        }
//    }
//
//}

package demo;

import java.sql.*;

/**
 *
 *
 */
public class demo {

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/demo";
        String user = "student";
        String pass = "Changeme@123";

        try (Connection myConn = DriverManager.getConnection(dbUrl, user, pass)) {

            // CREATE Operation
            createEmployee(myConn, "Smith", "John", "john.smith@foo.com", "IT", 50000.00);

            // READ Operation
            readEmployees(myConn);

            // UPDATE Operation
            updateEmployeeSalary(myConn, "Smith", "ashok", 60000.00);

            // DELETE Operation
           // deleteEmployee(myConn, "Smith", "John");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void createEmployee(Connection myConn, String lastName, String firstName, String email, String department, double salary) throws SQLException {
        try (Statement myStmt = myConn.createStatement()) {
            System.out.println("Inserting a new employee into database\n");
            int rowsAffected = myStmt.executeUpdate(
                    "insert into employees " +
                            "(last_name, first_name, email, department, salary) " +
                            "values " +
                            "('" + lastName + "', '" + firstName + "', '" + email + "', '" + department + "', " + salary + ")");
            System.out.println("Rows affected: " + rowsAffected);
        }
    }

    public static void readEmployees(Connection myConn) throws SQLException {
        try (Statement myStmt = myConn.createStatement();
             ResultSet myRs = myStmt.executeQuery("select * from employees order by last_name")) {

            System.out.println("List of employees:\n");

            while (myRs.next()) {
                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
            }
        }
    }

    public static void updateEmployeeSalary(Connection myConn, String lastName, String firstName, double newSalary) throws SQLException {
        try (Statement myStmt = myConn.createStatement()) {
            System.out.println("Updating employee salary\n");
            int rowsAffected = myStmt.executeUpdate(
                    "update employees " +
                            "set salary=" + newSalary + " " +
                            "where last_name='" + lastName + "' and first_name='" + firstName + "'");
            System.out.println("Rows affected: " + rowsAffected);
        }
    }

    public static void deleteEmployee(Connection myConn, String lastName, String firstName) throws SQLException {
        try (Statement myStmt = myConn.createStatement()) {
            System.out.println("Deleting an employee\n");
            int rowsAffected = myStmt.executeUpdate(
                    "delete from employees " +
                            "where last_name='" + lastName + "' and first_name='" + firstName + "'");
            System.out.println("Rows affected: " + rowsAffected);
        }
    }
}

