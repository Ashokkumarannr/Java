import java.util.Scanner;

// Main class
public class Main {
    static boolean ordering = true;

    public static void menu() {
        System.out.println("******Welcome to employee management system******"
                + "\n1. Add employee"
                + "\n2. View employee"
                + "\n3. Update employee"
                + "\n4. Delete employee"
                + "\n5. View all employees"
                + "\n6. Exit"
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employeeservice service = new employeeservice();
        do {
            menu();
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.addEmp();
                    break;
                case 2:
                    service.viewEmp();
                    break;
                case 3:
                    service.updateEmployee();
                    break;
                case 4:
                    service.deleteEmp();
                    break;
                case 5:
                    service.viewAllEmps();
                    break;
                case 6:
                    System.out.println("Thank you for using the application!!");
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        } while (ordering);
    }
}