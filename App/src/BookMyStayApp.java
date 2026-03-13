import java.util.HashMap;
import java.util.Map;

/**
 * =====================================================
 * MAIN CLASS - BookMyStayApp
 * =====================================================
 *
 * Use Case 3 : Centralized Room Inventory Management
 *
 * Demonstrates how HashMap is used to manage
 * room availability in a centralized inventory system.
 *
 * @author Tamizh
 * @version 1.0
 */

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("       BOOK MY STAY APPLICATION     ");
        System.out.println("====================================");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Register room types and availability
        inventory.addRoomType("Single Room", 5);
        inventory.addRoomType("Double Room", 3);
        inventory.addRoomType("Suite Room", 2);

        System.out.println("\n--- Current Room Inventory ---");

        // Display inventory
        inventory.displayInventory();

        // Update availability example
        System.out.println("\nUpdating inventory after booking a Single Room...\n");
        inventory.updateAvailability("Single Room", -1);

        System.out.println("--- Updated Room Inventory ---");
        inventory.displayInventory();

        System.out.println("\nApplication Terminated.");
    }
}


/**
 * RoomInventory class manages room availability
 * using a centralized HashMap
 */
class RoomInventory {

    private HashMap<String, Integer> inventory;

    // Constructor initializes inventory
    public RoomInventory() {
        inventory = new HashMap<>();
    }

    // Add room type with availability
    public void addRoomType(String roomType, int count) {
        inventory.put(roomType, count);
    }

    // Get availability of a room type
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Update room availability
    public void updateAvailability(String roomType, int change) {

        int current = inventory.getOrDefault(roomType, 0);
        inventory.put(roomType, current + change);
    }

    // Display entire inventory
    public void displayInventory() {

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {

            System.out.println("Room Type : " + entry.getKey());
            System.out.println("Available : " + entry.getValue());
            System.out.println();
        }
    }
}