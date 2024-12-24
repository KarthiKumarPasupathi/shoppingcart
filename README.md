# Shopping Cart Project

A simple Java-based shopping cart application designed to demonstrate object-oriented programming concepts, collections, and basic user interactions.

---

## Features

### Product Management
- View available products.
- Add products to the cart.
- Remove products from the cart.

### Cart Operations
- View items in the cart.
- Calculate the total price of items in the cart.
- Clear the cart.

### Checkout
- Generate a summary of the total price of items in the cart.
- Clear the cart after checkout.

---

## Project Structure

### Classes
1. **Product**
   - Represents a product in the store.
   - Attributes: `id`, `name`, `price`.

2. **CartItem**
   - Represents an item in the shopping cart.
   - Attributes: `Product`, `quantity`.

3. **ShoppingCart**
   - Manages cart operations like adding, removing, and displaying items.

4. **Main**
   - Entry point of the application.
   - Provides a command-line interface for interacting with the shopping cart.

---

## Technologies Used
- **Java**: Core programming language.
- **Java Collections Framework**: Used for managing the cart and product list.
- **Scanner**: For user input handling.

---

## How to Run

### Prerequisites
- **Java JDK**: Ensure you have Java installed. You can download it from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).
- **IDE or Text Editor**: Use an IDE like IntelliJ IDEA, Eclipse, or VS Code for easier development.

### Steps
1. Clone this repository:
   ```bash
   git clone https://github.com/KarthiKumarPasupathi/shopping-cart.git
   ```
2. Navigate to the project directory:
   ```bash
   cd shopping-cart
   ```
3. Compile the code:
   ```bash
   javac src/*.java
   ```
4. Run the application:
   ```bash
   java src.Main
   ```

---

## Usage Instructions
1. Run the program to display the main menu.
2. Choose from the following options:
   - **View Products**: Lists all available products.
   - **Add Product to Cart**: Enter the product ID and quantity to add to the cart.
   - **Remove Product from Cart**: Enter the product ID to remove it from the cart.
   - **View Cart**: Displays all items currently in the cart.
   - **Checkout**: Displays the total cost and clears the cart.
   - **Exit**: Exits the application.

---

## Sample Product Catalog
| Product ID | Name       | Price    |
|------------|------------|----------|
| 1          | Laptop     | $999.99  |
| 2          | Smartphone | $499.99  |
| 3          | Headphones | $99.99   |

---

## Future Enhancements
- **Persistent Storage**:
  - Use a database (e.g., MySQL) to store product and cart information.
  - Integrate JDBC for database operations.

- **GUI Integration**:
  - Develop a user-friendly interface using JavaFX or Swing.

- **User Accounts**:
  - Add functionality for user registration and login.
  - Maintain separate carts for different users.

---


## Contributing
Contributions are welcome! Feel free to fork this repository and submit a pull request.

---


### Happy Coding!
