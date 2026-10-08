class ElectricityBill {
    String consumerNo;
    String consumerName;
    int unitsConsumed;

    public ElectricityBill(String consumerNo, String consumerName, int unitsConsumed) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill() {
        return unitsConsumed * 8.0;
    }

    public double calculateBill(double rate) {
        return unitsConsumed * rate;
    }

    public double calculateBill(double rate, int units) {
        return units * rate;
    }
}

public class ElectricityBillPoly {
    public static void main(String[] args) {
        ElectricityBill obj = new ElectricityBill("C101", "Ravi", 250);

        System.out.println("Bill using default rate: " + obj.calculateBill());
        System.out.println("Bill using rate 10: " + obj.calculateBill(10));
        System.out.println("Bill using rate 12 and 300 units: " + obj.calculateBill(12, 300));
    }
}
