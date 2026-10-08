class Product {
    int productId;
    String productName;
    double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public double calculatePrice() {
        return price;
    }

    public double calculatePrice(int quantity) {
        return price * quantity;
    }

    public double calculatePrice(int quantity, double discount) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }
}

public class ProductPoly {
    public static void main(String[] args) {
        Product obj = new Product(1, "Laptop", 50000);

        System.out.println("Price for 1 item: " + obj.calculatePrice());
        System.out.println("Price for 3 items: " + obj.calculatePrice(3));
        System.out.println("Price for 3 items with 10% discount: " + obj.calculatePrice(3, 10));
    }
}
