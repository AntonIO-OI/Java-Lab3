package org.example;

/**
 * Represents a marine vessel.
 */
public class SeaBoat implements Comparable<SeaBoat> {
    private final String name;
    private final double length;
    private final int maxPassengers;
    private final int yearBuilt;
    private final double maxSpeed;

    public SeaBoat(String name, double length, int maxPassengers, int yearBuilt, double maxSpeed) {
        this.name = name;
        this.length = length;
        this.maxPassengers = maxPassengers;
        this.yearBuilt = yearBuilt;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Gets the name of the vessel.
     *
     * @return the name of the vessel
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the length of the vessel in meters.
     *
     * @return the length of the vessel
     */
    public double getLength() {
        return length;
    }

    /**
     * Gets the maximum number of passengers the vessel can carry.
     *
     * @return the maximum number of passengers
     */
    public int getMaxPassengers() {
        return maxPassengers;
    }

    /**
     * Gets the year the vessel was built.
     *
     * @return the year the vessel was built
     */
    public int getYearBuilt() {
        return yearBuilt;
    }

    /**
     * Gets the maximum speed of the vessel in knots.
     *
     * @return the maximum speed of the vessel
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("[%s] %.1fm | %d pax | Built %d | %.1f knots",
                name, length, maxPassengers, yearBuilt, maxSpeed);
    }

    @Override
    public int compareTo(SeaBoat other) {
        double lengthDiff = this.length - other.length;
        if (Math.abs(lengthDiff) > 0.001) {
            return lengthDiff > 0 ? 1 : -1;
        }
        return other.yearBuilt - this.yearBuilt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SeaBoat other)) return false;

        return Math.abs(this.length - other.length) < 0.001 &&
                this.maxPassengers == other.maxPassengers &&
                this.yearBuilt == other.yearBuilt &&
                Math.abs(this.maxSpeed - other.maxSpeed) < 0.001 &&
                this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() +
                (int) (length * 100) +
                maxPassengers +
                yearBuilt +
                (int) (maxSpeed * 100);
    }
}