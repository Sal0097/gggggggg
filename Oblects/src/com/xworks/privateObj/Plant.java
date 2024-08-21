package com.xworks.privateObj;

class Plant {
    String name;
    String species;
    double height;
    double age;
    String color;

    int numberOfLeaves;
    boolean hasFlowers;
    String climate;
    String soilType;
    String waterRequirements;

    public Plant(String name, String species, double height, double age, String color) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.age = age;
        this.color = color;
    }

    // Methods to set the variables
    public void setNumberOfLeaves(int numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    public void setHasFlowers(boolean hasFlowers) {
        this.hasFlowers = hasFlowers;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public void setWaterRequirements(String waterRequirements) {
        this.waterRequirements = waterRequirements;
    }

    // Method to print all instance variables
    public void printPlantDetails() {
        System.out.println("Plant Details:");
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Height: " + height);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
        System.out.println("Number of Leaves: " + numberOfLeaves);
        System.out.println("Has Flowers: " + hasFlowers);
        System.out.println("Climate: " + climate);
        System.out.println("Soil Type: " + soilType);
        System.out.println("Water Requirements: " + waterRequirements);
        System.out.println();
    }
}

