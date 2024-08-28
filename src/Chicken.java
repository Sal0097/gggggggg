// Base class for Chicken
class Chicken {
    String breed;
    int age;
    double weight;
    String color;
    boolean isBroiler;
    boolean isLayingEggs;
    String feedType;
    boolean isVaccinated;
    String coopSize;
    int eggCount;

    Chicken() {
        this.breed = "GenericBreed";
        this.age = 1;
        this.weight = 2.5;
        this.color = "White";
        this.isBroiler = false;
        this.isLayingEggs = true;
        this.feedType = "Grains";
        this.isVaccinated = true;
        this.coopSize = "Medium";
        this.eggCount = 0;
        System.out.println("Chicken: No-arg constructor called.");
    }

    void cluck() {
        System.out.println("Chicken is clucking.");
    }

    void layEgg() {
        System.out.println("Chicken laid an egg.");
        this.eggCount++;
    }

    void eat() {
        System.out.println("Chicken is eating.");
    }

    void sleep() {
        System.out.println("Chicken is sleeping.");
    }

    void roam() {
        System.out.println("Chicken is roaming around.");
    }
}

class FarmChicken extends Chicken {
    String farmName;
    boolean isOrganic;

    FarmChicken() {
        this.farmName = "Sunny Farm";
        this.isOrganic = true;
        System.out.println("FarmChicken: No-arg constructor called.");
    }

    void forage() {
        System.out.println("FarmChicken is foraging in " + farmName);
    }

    void layDoubleYolkEgg() {
        System.out.println("FarmChicken laid a double yolk egg!");
    }

    void dustBath() {
        System.out.println("FarmChicken is taking a dust bath.");
    }

    void roost() {
        System.out.println("FarmChicken is roosting.");
    }
}