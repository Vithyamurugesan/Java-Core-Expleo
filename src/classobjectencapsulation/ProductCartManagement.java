package classobjectencapsulation;

//Product Class
class Product {

 private int productId;
 private String productName;
 private double price;
 private int quantity;

 // Constructor
 public Product(int productId, String productName, double price, int quantity) {
     this.productId = productId;
     this.productName = productName;
     this.price = price;
     this.quantity = quantity;
 }

 // Update quantity
 public void setQuantity(int newQty) {
     if (newQty >= 0) {
         quantity = newQty;
     } else {
         System.out.println("Invalid quantity");
     }
 }

 // Calculate total price
 public double calculateTotal() {
     return price * quantity;
 }

 // Get product details
 public String getProductDetails() {
     return "Product ID: " + productId +
            ", Name: " + productName +
            ", Price: " + price +
            ", Quantity: " + quantity +
            ", Total: " + calculateTotal();
 }

 public int getProductId() {
     return productId;
 }
}


//Cart Class
class Cart {

 private Product[] products = new Product[10]; // cart size
 private int count = 0;

 // Add product
 public void addProduct(Product p) {
     if (count < products.length) {
         products[count] = p;
         count++;
     } else {
         System.out.println("Cart is full");
     }
 }

 // Remove product using productId
 public void removeProduct(int productId) {

     for (int i = 0; i < count; i++) {

         if (products[i].getProductId() == productId) {

             for (int j = i; j < count - 1; j++) {
                 products[j] = products[j + 1];
             }

             products[count - 1] = null;
             count--;

             System.out.println("Product removed from cart");
             return;
         }
     }

     System.out.println("Product not found");
 }

 // Calculate cart total
 public double calculateCartTotal() {

     double total = 0;

     for (int i = 0; i < count; i++) {
         total += products[i].calculateTotal();
     }

     return total;
 }

 // Display cart items
 public void displayCartItems() {

     if (count == 0) {
         System.out.println("Cart is empty");
         return;
     }

     for (int i = 0; i < count; i++) {
         System.out.println(products[i].getProductDetails());
     }

     System.out.println("Total Cart Value: " + calculateCartTotal());
 }
}


//Main Class
public class ProductCartManagement {

 public static void main(String[] args) {

     Cart cart = new Cart();

     Product p1 = new Product(101, "Laptop", 50000, 1);
     Product p2 = new Product(102, "Mouse", 500, 2);
     Product p3 = new Product(103, "Keyboard", 1000, 1);

     cart.addProduct(p1);
     cart.addProduct(p2);
     cart.addProduct(p3);

     System.out.println("Cart Items:");
     cart.displayCartItems();

     cart.removeProduct(102);

     System.out.println("\nUpdated Cart:");
     cart.displayCartItems();
 }
}

