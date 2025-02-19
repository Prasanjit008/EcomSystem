import java.util.ArrayList;

class Order {
    private static int orderCounter = 1;
    private int orderId;
    private ArrayList<Product> products;
    private double totalAmount;

    public Order(ArrayList<Product> products, double totalAmount) {
        this.orderId = orderCounter++;
        this.products = new ArrayList<>(products);
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}
