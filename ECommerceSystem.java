import java.util.Scanner;

public class ECommerceSystem {

    public static void main(String[] args) {
        Admin admin = new Admin("admin1", "password123");
        Customer customer = new Customer("user1", "pass123");
        
        // Sample products
        Product laptop = new Product("Laptop", 1000.0, 10);
        Product phone = new Product("Phone", 500.0, 20);

        // Admin adding products
        admin.addProduct(laptop);
        admin.addProduct(phone);

        // Customer browsing and adding to cart
        customer.getCart().addProduct(laptop);
        customer.getCart().addProduct(phone);

        // Customer calculates total with discount
        double discountRate = 0.1; // 10% discount
        double totalAmount = customer.getCart().calculateTotalWithDiscount(discountRate);
        
        // Create order
        Order order = new Order(customer.getCart().getProducts(), totalAmount);
        order.displayOrderDetails();
        
        // Clear cart after placing order
        customer.getCart().clearCart();
    }
}
