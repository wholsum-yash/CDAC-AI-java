import java.util.Scanner;

public class TemperatureConversion {
    static double convertTemperature(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = convertTemperature(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        if (fahrenheit > 100) {
            System.out.println("Temperature is above 100°F");
        } else {
            System.out.println("Temperature is not above 100°F");
        }

        sc.close();
    }
}
