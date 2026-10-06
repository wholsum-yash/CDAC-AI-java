import java.util.Scanner;

public class ElectricityBill {
    String consumerNumber;
    String consumerName;
    int units;
    double billAmount;

    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Number: ");
        consumerNumber = sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        consumerName = sc.nextLine();

        System.out.print("Enter Number of Units: ");
        units = sc.nextInt();
    }

    void calculateBill() {
        if (units <= 100) {
            billAmount = units * 2;
        } else if (units <= 200) {
            billAmount = (100 * 2) + ((units - 100) * 3);
        } else {
            billAmount = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }
    }

    void display() {
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Number : " + consumerNumber);
        System.out.println("Consumer Name   : " + consumerName);
        System.out.println("Units Consumed  : " + units);
        System.out.println("Bill Amount     : Rs. " + billAmount);
    }

    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();
        eb.read();
        eb.calculateBill();
        eb.display();
    }
}
