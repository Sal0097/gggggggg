
class SmartPhone {
    String brand;
    String model;
    int storage;
    int batteryCapacity;

    SmartPhone() {
        this.brand = "GenericBrand";
        this.model = "GenericModel";
        this.storage = 64;
        this.batteryCapacity = 3000;
        System.out.println("SmartPhone: No-arg constructor called.");
    }

    void call() {
        System.out.println("Calling from " + model + ".");
    }

    void browse() {
        System.out.println("Browsing internet.");
    }
}


class AdvancedSmartPhone extends SmartPhone {
    boolean has5G;
    String operatingSystem;

    AdvancedSmartPhone() {
        this.has5G = true;
        this.operatingSystem = "Android";
        System.out.println("AdvancedSmartPhone: No-arg constructor called.");
    }

    void playGame() {
        System.out.println("Playing game on " + model);
    }

    void takePhoto() {
        System.out.println("Taking photo with " + model);
    }
}