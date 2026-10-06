import java.util.Scanner;

class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;
    private double totalBill;

    private static int productCount = 0;
    private static final String STORE_NAME = "SuperMart";

    public Product(Scanner sc) {
        read(sc);
        productCount++;
    }

    public void read(Scanner sc) {
        System.out.print("Product ID: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Product Name: ");
        productName = sc.nextLine();

        System.out.print("Price: ");
        price = sc.nextDouble();

        System.out.print("Quantity: ");
        quantity = sc.nextInt();
        sc.nextLine();
    }

    public void calculateBill() {
        totalBill = price * quantity;
    }

    public void display() {
        System.out.println("Store: " + STORE_NAME);
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.printf("Price: %.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Bill: %.2f%n", totalBill);
        System.out.println("-----------------------------");
    }

    public static void displayProductCount() {
        System.out.println("Total products: " + productCount);
    }
}

public class ProductBillingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            products[i] = new Product(sc);
            products[i].calculateBill();
        }

        System.out.println("\n----- Product Bills -----");
        for (Product p : products) {
            p.display();
        }

        Product.displayProductCount();
        sc.close();
    }
}
