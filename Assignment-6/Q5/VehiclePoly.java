class Vehicle {
    String vehicleNo;
    String brand;
    double baseRate;

    public Vehicle(String vehicleNo, String brand, double baseRate) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public double calculateRental() {
        return baseRate; 
    }
}

class Car extends Vehicle {
    int numberOfDays;
    double insuranceCharge;

    public Car(String vehicleNo, String brand, double baseRate,
               int numberOfDays, double insuranceCharge) {
        super(vehicleNo, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.insuranceCharge = insuranceCharge;
    }

    public double calculateRental() {
        return (numberOfDays * baseRate) + insuranceCharge;
    }
}

class Bike extends Vehicle {
    int numberOfDays;
    double helmetCharge;

    public Bike(String vehicleNo, String brand, double baseRate,
                int numberOfDays, double helmetCharge) {
        super(vehicleNo, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.helmetCharge = helmetCharge;
    }

    public double calculateRental() {
        return (numberOfDays * baseRate) + helmetCharge;
    }
}

public class VehiclePoly {
    public static void main(String[] args) {
        Car obj1 = new Car("7865", "Honda", 1500, 3, 500);
        Bike obj2 = new Bike("3475", "Yamaha", 500, 2, 100);

        System.out.println("Car Rental: " + obj1.calculateRental());
        System.out.println("Bike Rental: " + obj2.calculateRental());
    }
}
