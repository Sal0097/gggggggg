package com.xworks.privateObj;

class Ball {
    // 25 instance variables
    String type;
    String color;
    double diameter;
    String material;
    double weight;

    double bounceRate;
    String brand;
    String usage;
    String sportType;
    String manufacturerCountry;

    String logo;
    String texture;
    String packaging;
    String pressure;
    String category;

    String model;
    int warrantyYears;
    boolean isInflatable;
    String surfaceCompatibility;
    String storageInstructions;

    String productionDate;
    boolean isEcoFriendly;
    String retailPrice;
    String barcode;
    String batchNumber;

    // Constructor to initialize 8 instance variables
    public Ball(String type, String color, double diameter, String material, double weight, double bounceRate, String brand, String usage) {
        this.type = type;
        this.color = color;
        this.diameter = diameter;
        this.material = material;
        this.weight = weight;
        this.bounceRate = bounceRate;
        this.brand = brand;
        this.usage = usage;
    }

    // Methods to set the remaining 17 variables
    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public void setIsInflatable(boolean isInflatable) {
        this.isInflatable = isInflatable;
    }

    public void setSurfaceCompatibility(String surfaceCompatibility) {
        this.surfaceCompatibility = surfaceCompatibility;
    }

    public void setStorageInstructions(String storageInstructions) {
        this.storageInstructions = storageInstructions;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public void setIsEcoFriendly(boolean isEcoFriendly) {
        this.isEcoFriendly = isEcoFriendly;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public void printBallDetails() {
        System.out.println("Ball Details:");
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Diameter: " + diameter);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight);
        System.out.println("Bounce Rate: " + bounceRate);
        System.out.println("Brand: " + brand);
        System.out.println("Usage: " + usage);
        System.out.println("Sport Type: " + sportType);
        System.out.println("Manufacturer Country: " + manufacturerCountry);
        System.out.println("Logo: " + logo);
        System.out.println("Texture: " + texture);
        System.out.println("Packaging: " + packaging);
        System.out.println("Pressure: " + pressure);
        System.out.println("Category: " + category);
        System.out.println("Model: " + model);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Is Inflatable: " + isInflatable);
        System.out.println("Surface Compatibility: " + surfaceCompatibility);
        System.out.println("Storage Instructions: " + storageInstructions);
        System.out.println("Production Date: " + productionDate);
        System.out.println("Is Eco-Friendly: " + isEcoFriendly);
        System.out.println("Retail Price: " + retailPrice);
        System.out.println("Barcode: " + barcode);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println();
    }
}

