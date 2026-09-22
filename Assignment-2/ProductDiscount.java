import java.util.Scanner;

public class ProductDiscount {
    static double calculateFinalPrice(double price) {
        double discount = 0;

        if (price >= 10000) {
            discount = 0.20;
        } else if (price >= 5000) {
            discount = 0.10;
        } else if (price >= 2000) {
            discount = 0.05;
        }

        return price - (price * discount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        double finalPrice = calculateFinalPrice(price);

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Final Price: " + finalPrice);

        sc.close();
    }
}
