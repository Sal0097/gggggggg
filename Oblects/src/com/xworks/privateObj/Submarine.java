package com.xworks.privateObj;

class Submarine {
    String name;
    double length;
    double width;
    double height;
    int crewSize;

    double maxDepth;
    double speed;
    String propulsionType;
    String countryOfOrigin;
    String launchDate;

    String manufacturer;
    String hullMaterial;
    String sonarSystem;
    String radarSystem;
    int torpedoCount;

    int missileCount;
    String nuclearCapability;
    String displacement;
    String endurance;
    String communicationSystem;

    String navigationSystem;
    int periscopeCount;
    String stealthTechnology;
    String fireControlSystem;
    String coolingSystem;

    String divingPlanes;
    String ballastSystem;
    String ventilationSystem;
    int lifeBoats;
    int oxygenSystem;

    String fuelType;
    String nuclearReactor;
    String emergencyExit;
    String storageCapacity;
    String maintenanceSchedule;

    String operatingDepth;
    String operationalArea;
    String crewAccommodation;
    String safetyProtocol;
    String camouflagePattern;


    public Submarine(String name, double length, double width, double height, int crewSize) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.crewSize = crewSize;
    }


    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public void setSonarSystem(String sonarSystem) {
        this.sonarSystem = sonarSystem;
    }

    public void setRadarSystem(String radarSystem) {
        this.radarSystem = radarSystem;
    }

    public void setTorpedoCount(int torpedoCount) {
        this.torpedoCount = torpedoCount;
    }

    public void printSubmarineDetails() {
        System.out.println("Submarine Details:");
        System.out.println("Name: " + name);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Crew Size: " + crewSize);
        System.out.println("Max Depth: " + maxDepth);
        System.out.println("Speed: " + speed);
        System.out.println("Propulsion Type: " + propulsionType);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Hull Material: " + hullMaterial);
        System.out.println("Sonar System: " + sonarSystem);
        System.out.println("Radar System: " + radarSystem);
        System.out.println("Torpedo Count: " + torpedoCount);
        // Print the rest of the instance variables...
        System.out.println();
    }
}
