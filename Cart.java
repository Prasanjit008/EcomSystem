import java.util.ArrayList;

class Cart {
    private ArrayList<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
        
    }

    public void clearCart() {
        products.clear();
    }

    public ArrayList<Product> getProducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProducts'");
    }

    public double calculateTotalWithDiscount(double discountRate) {
        // TODO Auto-generated method stub
        double total = calculateTotal();
        return total - (total * discountRate);
    }
}
