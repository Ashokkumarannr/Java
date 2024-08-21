import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PizzaBillingSwingApp extends JFrame {

    private JComboBox<String> sizeComboBox;
    private JCheckBox vegCheckBox;
    private JCheckBox extraCheeseCheckBox;
    private JTextField toppingField;
    private JTextArea billArea;
    private Order order;

    public PizzaBillingSwingApp() {
        order = new Order();

        // Set up the frame
        setTitle("Pizza Billing System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        // Add components for selecting pizza size
        add(new JLabel("Pizza Size:"));
        String[] sizes = {"Small", "Medium", "Large"};
        sizeComboBox = new JComboBox<>(sizes);
        add(sizeComboBox);

        // Add components for selecting veg/non-veg
        add(new JLabel("Veg Pizza:"));
        vegCheckBox = new JCheckBox();
        add(vegCheckBox);

        // Add components for extra cheese
        add(new JLabel("Extra Cheese:"));
        extraCheeseCheckBox = new JCheckBox();
        add(extraCheeseCheckBox);

        // Add components for topping
        add(new JLabel("Topping:"));
        toppingField = new JTextField();
        add(toppingField);

        // Add buttons for adding pizza and generating bill
        JButton addButton = new JButton("Add Pizza");
        add(addButton);

        JButton generateBillButton = new JButton("Generate Bill");
        add(generateBillButton);

        // Text area for displaying the bill
        billArea = new JTextArea();
        billArea.setEditable(false);
        add(new JScrollPane(billArea));
        add(new JLabel());  // Empty label for layout adjustment

        // Button action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPizzaToOrder();
            }
        });

        generateBillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayBill();
            }
        });
    }

    private void addPizzaToOrder() {
        String size = (String) sizeComboBox.getSelectedItem();
        boolean isVeg = vegCheckBox.isSelected();
        boolean extraCheese = extraCheeseCheckBox.isSelected();
        String topping = toppingField.getText().trim();

        Pizza pizza = new Pizza(size, isVeg, extraCheese, topping);
        order.addPizza(pizza);

        // Clear the topping field for the next input
        toppingField.setText("");
    }

    private void displayBill() {
        String bill = order.generateBill();
        billArea.setText(bill);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PizzaBillingSwingApp app = new PizzaBillingSwingApp();
            app.setVisible(true);
        });
    }
}

