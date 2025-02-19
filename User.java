class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
}

class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    public void addProduct(Product product) {
        // Logic to add product
    }

    public void modifyProduct(Product product) {
        // Logic to modify product
    }
}

class Customer extends User {
    private Cart cart;

    public Customer(String username, String password) {
        super(username, password);
        this.cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }
}
