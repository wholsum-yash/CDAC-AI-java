class Product {
    int productId;
    String productName;
    double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public double calculateDiscount() {
        return price * 0.10;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
    }
}

class Electronics extends Product {
    String brand;
    int warranty;

    public Electronics(int productId, String productName, double price,
                       String brand, int warranty) {
        super(productId, productName, price);
        this.brand = brand;
        this.warranty = warranty;
    }

    public double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    public void displayElectronicsDetails() {
        displayProductDetails();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty + " months");
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}

class Clothing extends Product {
    String size;
    String material;

    public Clothing(int productId, String productName, double price,
                    String size, String material) {
        super(productId, productName, price);
        this.size = size;
        this.material = material;
    }

    public double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    public void displayClothingDetails() {
        displayProductDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}

public class InheritanceDemo4 {
    public static void main(String[] args) {
        Electronics e = new Electronics(201, "Laptop", 80000, "Dell", 24);
        e.displayElectronicsDetails();

        System.out.println("-------------------");

        Clothing c = new Clothing(202, "T-Shirt", 1500, "L", "Cotton");
        c.displayClothingDetails();
    }
}
