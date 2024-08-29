import java.util.Scanner;

class Bus {
    private int busNumber;
    private int totalSeats;
    private int bookedSeats;

    // Constructor for initializing bus details
    public Bus(int busNumber, int totalSeats) {
        this.busNumber = busNumber;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;  // Initially no seats are booked
    }

    // Get bus number
    public int getBusNumber() {
        return busNumber;
    }

    // Get available seats (total seats - booked seats)
    public int getAvailableSeats() {
        return totalSeats - bookedSeats;
    }

    // Book a seat if available
    public boolean bookSeat() {
        if (bookedSeats < totalSeats) {  // If seats are available
            bookedSeats++;
            return true;  // Booking successful
        } else {
            return false;  // Booking failed, no seats available
        }
    }

    // Cancel a booking if there's at least one booked seat
    public boolean cancelSeat() {
        if (bookedSeats > 0) {  // If any seats are booked
            bookedSeats--;
            return true;  // Cancellation successful
        } else {
            return false;  // No bookings to cancel
        }
    }

    // Display bus details
    public void displayBusInfo() {
        System.out.println("Bus Number: " + busNumber + ", Available Seats: " + getAvailableSeats());
    }
}

public class Main {
    // Array to hold multiple buses
    private static Bus[] buses;

    // Method to find a bus by its number
    private static Bus findBus(int busNumber) {
        for (Bus bus : buses) {
            if (bus.getBusNumber() == busNumber) {
                return bus;  // Return the bus if found
            }
        }
        return null;  // Return null if bus is not found
    }

    // Main method for the command-line bus reservation system
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize buses (bus number, total seats)
        buses = new Bus[]{
                new Bus(101, 40),
                new Bus(102, 30),
                new Bus(103, 20)
        };

        System.out.println("Welcome to the Bus Reservation System");

        // Loop for continuous interaction until user exits
        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. View Bus Availability");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display available buses and their seats
                    System.out.println("Available Buses:");
                    for (Bus bus : buses) {
                        bus.displayBusInfo();
                    }
                    break;

                case 2:
                    // Book a seat
                    System.out.print("Enter bus number to book a seat: ");
                    int busNumber = scanner.nextInt();
                    Bus busToBook = findBus(busNumber);

                    if (busToBook != null) {
                        if (busToBook.bookSeat()) {
                            System.out.println("Seat booked successfully on Bus " + busNumber);
                        } else {
                            System.out.println("Sorry, no seats available on Bus " + busNumber);
                        }
                    } else {
                        System.out.println("Invalid bus number.");
                    }
                    break;

                case 3:
                    // Cancel a booking
                    System.out.print("Enter bus number to cancel a seat: ");
                    int busNumberToCancel = scanner.nextInt();
                    Bus busToCancel = findBus(busNumberToCancel);

                    if (busToCancel != null) {
                        if (busToCancel.cancelSeat()) {
                            System.out.println("Booking canceled successfully on Bus " + busNumberToCancel);
                        } else {
                            System.out.println("No bookings to cancel on Bus " + busNumberToCancel);
                        }
                    } else {
                        System.out.println("Invalid bus number.");
                    }
                    break;

                case 4:
                    // Exit the system
                    System.out.println("Thank you for using the Bus Reservation System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

