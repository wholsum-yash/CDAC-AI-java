import java.util.Scanner;

class ElectricityBill {
    private String consumerNumber;
    private String consumerName;
    private int units;
    private double billAmount;

    private static int consumerCount = 0;
    private static final double FIRST_100_RATE = 2.0;
    private static final double NEXT_100_RATE = 3.0;
    private static final double ABOVE_200_RATE = 5.0;

    public ElectricityBill(Scanner sc) {
        read(sc);
        consumerCount++;
    }

    public void read(Scanner sc) {
        System.out.print("Consumer Number: ");
        consumerNumber = sc.next();
        sc.nextLine();

        System.out.print("Consumer Name: ");
        consumerName = sc.nextLine();

        System.out.print("Number of Units: ");
        units = sc.nextInt();
        sc.nextLine();
    }

    public void calculateBill() {
        if (units <= 100) {
            billAmount = units * FIRST_100_RATE;
        } else if (units <= 200) {
            billAmount = (100 * FIRST_100_RATE)
                    + ((units - 100) * NEXT_100_RATE);
        } else {
            billAmount = (100 * FIRST_100_RATE)
                    + (100 * NEXT_100_RATE)
                    + ((units - 200) * ABOVE_200_RATE);
        }
    }

    public void display() {
        System.out.println("Consumer Number: " + consumerNumber);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + units);
        System.out.printf("Bill Amount: Rs. %.2f%n", billAmount);
        System.out.println("-----------------------------");
    }

    public static void displayConsumerCount() {
        System.out.println("Total consumers: " + consumerCount);
    }
}

public class ElectricityBillDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of consumers: ");
        int n = sc.nextInt();
        sc.nextLine();

        ElectricityBill[] bills = new ElectricityBill[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Consumer " + (i + 1) + ":");
            bills[i] = new ElectricityBill(sc);
            bills[i].calculateBill();
        }

        System.out.println("\n----- Electricity Bills -----");
        for (ElectricityBill bill : bills) {
            bill.display();
        }

        ElectricityBill.displayConsumerCount();
        sc.close();
    }
}
