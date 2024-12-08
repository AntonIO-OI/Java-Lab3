package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SeaBoat[] boatArray = new SeaBoat[5];
        boatArray[0] = new SeaBoat("Voyager", 25.5, 12, 2020, 30.0);
        boatArray[1] = new SeaBoat("SeaBreeze", 18.3, 8, 2019, 25.5);
        boatArray[2] = new SeaBoat("Neptune", 30.0, 20, 2021, 35.0);
        boatArray[3] = new SeaBoat("Mariner", 22.7, 10, 2018, 28.0);
        boatArray[4] = new SeaBoat("Poseidon", 28.4, 15, 2022, 32.5);

        BoatHandler handler = new BoatHandler(boatArray);

        System.out.println("Initial boat array:");
        handler.displayBoatList();
        System.out.println();

        handler.sortLengthAscendingYearDescending();
        System.out.println("Array sorted by length ascending and year descending:");
        handler.displayBoatList();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter boat details to search:");

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Length (meters): ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.println("Maximum passengers: ");
        int maxPassengers = InputHandler.getUserInput(1);

        System.out.println("Year built: ");
        int yearBuilt = InputHandler.getUserInput(1900);

        System.out.println("Maximum speed (knots): ");
        double maxSpeed = Double.parseDouble(scanner.nextLine());

        SeaBoat searchBoat = new SeaBoat(name, length, maxPassengers, yearBuilt, maxSpeed);
        if (handler.contains(searchBoat)) {
            System.out.println("\nBoat found!");
        } else {
            System.out.println("\nBoat not found!");
        }
    }
}
