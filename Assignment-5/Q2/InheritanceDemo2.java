class Vehicle {
    String vehicleNo;
    String brand;
    double price;

    public Vehicle(String vehicleNo, String brand, double price) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.price = price;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public double calculateTax() {
        return price * 0.10;
    }
}

class Car extends Vehicle {
    String model;
    String fuelType;

    public Car(String vehicleNo, String brand, double price,
               String model, String fuelType) {
        super(vehicleNo, brand, price);
        this.model = model;
        this.fuelType = fuelType;
    }

    public void displayCarDetails() {
        displayVehicleDetails();
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
    }

    public double calculateInsurance() {
        return price * 0.05;
    }
}

class ElectricCar extends Car {
    double batteryCapacity;
    double chargingTime;

    public ElectricCar(String vehicleNo, String brand, double price,
                       String model, String fuelType,
                       double batteryCapacity, double chargingTime) {
        super(vehicleNo, brand, price, model, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    public double calculateRange() {
        return batteryCapacity * 5;
    }

    public void displayElectricCarDetails() {
        displayCarDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
        System.out.println("Tax: " + calculateTax());
        System.out.println("Insurance: " + calculateInsurance());
        System.out.println("Range: " + calculateRange() + " km");
    }
}

public class InheritanceDemo2 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar(
            "KA01AB1234", "Tesla", 60000,
            "Model 3", "Electric", 75, 8
        );
        ec.displayElectricCarDetails();
    }
}
