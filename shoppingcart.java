package shoping;

	import java.util.ArrayList;
	import java.util.List;

	public class shoppingcart {

	    private List<CarItem> items = new ArrayList<>();

	    public void addProduct(Product product, int quantity) {
	        items.add(new CarItem(product, quantity));
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
	            for (CarItem item : items) {
	                System.out.println(item);
	            }
	        }
	    }

	    public double getTotal() {
	        return items.stream().mapToDouble(CarItem::getTotalPrice).sum();
	    }

	    public void clearCart() {
	        items.clear();
	        System.out.println("Cart has been cleared.");
	    }
	}


