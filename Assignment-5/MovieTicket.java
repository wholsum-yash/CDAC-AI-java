import java.util.Scanner;

class MovieTicket {
    private String customerName;
    private String movieName;
    private int numberOfTickets;
    private double ticketPrice;
    private double totalAmount;

    private static int bookingCount = 0;
    private static final String THEATRE_NAME = "PVR Cinemas";

    public MovieTicket(Scanner sc) {
        read(sc);
        bookingCount++;
    }

    public void read(Scanner sc) {
        System.out.print("Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Movie Name: ");
        movieName = sc.nextLine();

        System.out.print("Number of Tickets: ");
        numberOfTickets = sc.nextInt();

        System.out.print("Ticket Price: ");
        ticketPrice = sc.nextDouble();
        sc.nextLine();
    }

    public void calculateAmount() {
        totalAmount = numberOfTickets * ticketPrice;
    }

    public void display() {
        System.out.println("Theatre: " + THEATRE_NAME);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Ticket Price: %.2f%n", ticketPrice);
        System.out.printf("Total Amount: %.2f%n", totalAmount);
        System.out.println("-----------------------------");
    }

    public static void displayBookingCount() {
        System.out.println("Total bookings: " + bookingCount);
    }
}

public class MovieTicketDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bookings: ");
        int n = sc.nextInt();
        sc.nextLine();

        MovieTicket[] tickets = new MovieTicket[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Booking " + (i + 1) + ":");
            tickets[i] = new MovieTicket(sc);
            tickets[i].calculateAmount();
        }

        System.out.println("\n----- Movie Ticket Details -----");
        for (MovieTicket ticket : tickets) {
            ticket.display();
        }

        MovieTicket.displayBookingCount();
        sc.close();
    }
}
