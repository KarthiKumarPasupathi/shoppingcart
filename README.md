import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;


    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: $" + price;
    }
}

class CartItem {
    private Product product;
    private int quantity;

    // Constructor, Getters, Setters
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return product + ", Quantity: " + quantity + ", Total: $" + getTotalPrice();
    }
}

class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
        System.out.println("Product added to cart.");
    }

    public void removeProduct(int productId) {
        items.removeIf(item -> item.getProduct().getId() == productId);
        System.out.println("Product removed from cart.");
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (CartItem item : items) {
                System.out.println(item);
            }
        }
    }

    public double getTotal() {
        return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
    }

    public void clearCart() {
        items.clear();
        System.out.println("Cart has been cleared.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        // Sample products
        Product product1 = new Product(1, "Laptop", 999.99);
        Product product2 = new Product(2, "Smartphone", 499.99);
        Product product3 = new Product(3, "Headphones", 99.99);

        Map<Integer, Product> productCatalog = new HashMap<>();
        productCatalog.put(product1.getId(), product1);
        productCatalog.put(product2.getId(), product2);
        productCatalog.put(product3.getId(), product3);

        while (true) {
            System.out.println("\n1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Products:");
                    productCatalog.values().forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Enter Product ID to add: ");
                    int productId = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    if (productCatalog.containsKey(productId)) {
                        cart.addProduct(productCatalog.get(productId), quantity);
                    } else {
                        System.out.println("Invalid Product ID.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID to remove: ");
                    productId = scanner.nextInt();
                    cart.removeProduct(productId);
                    break;
                case 4:
                    System.out.println("\nYour Cart:");
                    cart.viewCart();
                    break;
                case 5:
                    System.out.println("Total Price: $" + cart.getTotal());
                    System.out.println("Thank you for shopping!");
                    cart.clearCart();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
