import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Pizza> pizzaList;

    public Order() {
        pizzaList = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzaList.add(pizza);
    }

    public double calculateTotal() {
        double total = 0;
        for (Pizza pizza : pizzaList) {
            total += pizza.getPrice();
        }
        return total;
    }

    public String generateBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("-------- PIZZA BILL --------\n");
        for (Pizza pizza : pizzaList) {
            bill.append(pizza.toString()).append("\n");
        }
        bill.append("----------------------------\n");
        bill.append("Total Amount: ₹").append(calculateTotal()).append("\n");
        return bill.toString();
    }
}

