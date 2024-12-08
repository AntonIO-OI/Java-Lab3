package org.example;

/**
 * Manages a fleet of vessels and provides operations for fleet management.
 * Includes functionality for displaying, sorting, and searching vessels.
 */
public class BoatHandler {
    /**
     * Array containing all vessels in the fleet.
     * This array is final to prevent reassignment.
     */
    private final SeaBoat[] fleet;

    /**
     * Initializes a new fleet management system.
     *
     * @param boats array of vessels to manage
     * @throws NullPointerException if boats array is null
     */
    public BoatHandler(SeaBoat[] boats) {
        this.fleet = boats;
    }

    /**
     * Displays all vessels in the fleet with formatting.
     * Each vessel is numbered starting from 1.
     */
    public void displayBoatList() {
        System.out.println("=== Current Fleet Status ===");
        for (int i = 0; i < fleet.length; i++) {
            System.out.printf("Boat #%d: %s%n", i + 1, fleet[i]);
        }
        System.out.println("=========================");
    }

    /**
     * Sorts the fleet by vessel length (ascending) and year built (descending).
     * Uses bubble sort algorithm for sorting.
     */
    public void sortLengthAscendingYearDescending() {
        for (int i = 0; i < fleet.length - 1; i++) {
            for (int j = 0; j < fleet.length - i - 1; j++) {
                if (fleet[j].compareTo(fleet[j + 1]) > 0) {
                    SeaBoat temp = fleet[j];
                    fleet[j] = fleet[j + 1];
                    fleet[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Searches for a specific vessel in the fleet.
     *
     * @param targetBoat vessel to search for
     * @return true if vessel is found, false otherwise
     */
    public boolean contains(SeaBoat targetBoat) {
        for (SeaBoat boat : fleet) {
            if (boat.equals(targetBoat)) {
                return true;
            }
        }
        return false;
    }
} 