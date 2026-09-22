import java.util.Scanner;

public class MobileDataUsage {
    static double calculateCharge(double dataUsedGB) {
        if (dataUsedGB <= 1) {
            return 50;
        } else if (dataUsedGB <= 5) {
            return 100;
        } else if (dataUsedGB <= 10) {
            return 200;
        } else {
            return 350;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        long mobileNumber = sc.nextLong();

        System.out.print("Enter data usage in GB: ");
        double dataUsedGB = sc.nextDouble();

        double charge = calculateCharge(dataUsedGB);

        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Data Usage: " + dataUsedGB + " GB");
        System.out.println("Final Charge: " + charge);

        sc.close();
    }
}
