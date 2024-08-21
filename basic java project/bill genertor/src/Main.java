import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Schedule the application to run on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            // Create an instance of the PizzaBillingSwingApp
            PizzaBillingSwingApp app = new PizzaBillingSwingApp();

            // Set the application window to be visible
            app.setVisible(true);
        });
    }

    // Define additional methods and functionality for your application here
    public void setVisible(boolean isVisible) {
        // Your implementation to show the GUI window
    }
}

