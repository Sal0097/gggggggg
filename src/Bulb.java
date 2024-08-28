
class Bulb {
    String type;

    Bulb() {
        this.type = "LED";
        System.out.println("Bulb: No-arg constructor called.");
    }

    void switchOn() {
        System.out.println("Bulb is switched on.");
    }
}

class SmartBulb extends Bulb {
    String color;

    SmartBulb() {
        this.color = "White";
        System.out.println("SmartBulb  No argument constructor called.");
    }

    void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("SmartBulb color changed to " + newColor);
    }
}








