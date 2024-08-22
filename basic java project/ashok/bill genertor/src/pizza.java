class Pizza {
    private String size;
    private boolean isVeg;
    private boolean extraCheese;
    private String topping;
    private double price;

    // Add-on prices
    private static final double EXTRA_CHEESE_PRICE = 50;
    private static final double TOPPING_PRICE = 40;

    public Pizza(String size, boolean isVeg, boolean extraCheese, String topping) {
        this.size = size;
        this.isVeg = isVeg;
        this.extraCheese = extraCheese;
        this.topping = topping;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        double basePrice = isVeg ? 200 : 250;

        switch (size.toLowerCase()) {
            case "small":
                break;
            case "medium":
                basePrice += 50;
                break;
            case "large":
                basePrice += 100;
                break;
            default:
                break;
        }

        if (extraCheese) {
            basePrice += EXTRA_CHEESE_PRICE;
        }

        if (!topping.isEmpty()) {
            basePrice += TOPPING_PRICE;
        }

        return basePrice;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String pizzaDescription = (isVeg ? "Veg" : "Non-Veg") + " Pizza [" + size + "] - ₹" + price;
        if (extraCheese) pizzaDescription += " (Extra Cheese)";
        if (!topping.isEmpty()) pizzaDescription += " (Topping: " + topping + ")";
        return pizzaDescription;
    }
}

