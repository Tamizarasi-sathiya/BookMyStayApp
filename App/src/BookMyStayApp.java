/**
 * =====================================================
 * MAIN CLASS - BookMyStayApp
 * =====================================================
 *
 * Use Case 2 : Basic Room Types & Static Availability
 *
 * Demonstrates abstraction, inheritance and polymorphism
 * using different room types in the hotel booking system.
 *
 * @author Tamizh
 * @version 1.0
 */

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("        BOOK MY STAY SYSTEM         ");
        System.out.println("====================================");

        // Creating room objects using polymorphism
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        System.out.println("\n--- Room Details & Availability ---\n");

        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms : " + singleAvailability);
        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms : " + doubleAvailability);
        System.out.println();

        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms : " + suiteAvailability);

        System.out.println("\nApplication Terminated.");
    }
}


/**
 * Abstract class representing a general Room
 */
abstract class Room {

    protected String roomType;
    protected int beds;
    protected double size;
    protected double price;

    public Room(String roomType, int beds, double size, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type : " + roomType);
        System.out.println("Beds      : " + beds);
        System.out.println("Size      : " + size + " sqm");
        System.out.println("Price     : $" + price);
    }
}


/**
 * Single Room Class
 */
class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 20, 100);
    }
}


/**
 * Double Room Class
 */
class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 35, 180);
    }
}


/**
 * Suite Room Class
 */
class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 60, 350);
    }
}