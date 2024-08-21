package com.xworks.privateObj;

public class Main11 {
    public static void main(String[] args) {
        // Creating 3 instances of each class
        Plant plant1 = new Plant("Rose", "Rosa", 1.2, 2.5, "Red");
        Plant plant2 = new Plant("Tulip", "Tulipa", 0.4, 1.0, "Yellow");
        Plant plant3 = new Plant("Sunflower", "Helianthus", 1.8, 3.0, "Yellow");

        Ball ball1 = new Ball("Soccer Ball", "White", 22.0, "Leather", 0.45, 0.8, "Adidas", "Outdoor");
        Ball ball2 = new Ball("Basketball", "Orange", 24.6, "Synthetic", 0.62, 0.7, "Spalding", "Indoor");
        Ball ball3 = new Ball("Tennis Ball", "Green", 6.7, "Rubber", 0.056, 0.85, "Wilson", "Outdoor");

        Submarine submarine1 = new Submarine("Nautilus", 97.0, 8.5, 8.0, 100);
        Submarine submarine2 = new Submarine("Seawolf", 107.0, 12.0, 11.0, 120);
        Submarine submarine3 = new Submarine("Virginia", 115.0, 10.5, 9.0, 135);

        // Adding these instances into an array
        Object[] objects = {plant1, plant2, plant3, ball1, ball2, ball3, submarine1, submarine2, submarine3};


        for (Object obj : objects) {
            if (obj instanceof Plant) {
                ((Plant) obj).printPlantDetails();
            } else if (obj instanceof Ball) {
                ((Ball) obj).printBallDetails();
            } else if (obj instanceof Submarine) {
                ((Submarine) obj).printSubmarineDetails();
            }
        }
    }
}

