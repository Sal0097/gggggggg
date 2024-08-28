// Base class for Bull
class Bull {
    String breed;
    int age;
    double weight;
    String color;
    boolean isTrained;

    Bull() {
        this.breed = "GenericBreed";
        this.age = 2;
        this.weight = 500.0;
        this.color = "Brown";
        this.isTrained = false;
        System.out.println("Bull: No-arg constructor called.");
    }

    void graze() {
        System.out.println("Bull is grazing.");
    }

    void roar() {
        System.out.println("Bull is roaring.");
    }

    void run() {
        System.out.println("Bull is running.");
    }

    void sleep() {
        System.out.println("Bull is sleeping.");
    }

    void train() {
        System.out.println("Bull is being trained.");
        this.isTrained = true;
    }
}

// Subclass of Bull
class MightyBull extends Bull {
    double hornLength;
    boolean isChampion;

    MightyBull() {
        this.hornLength = 1.5;
        this.isChampion = false;
        System.out.println("MightyBull: No-arg constructor called.");
    }

    void participateInRace() {
        System.out.println("MightyBull is participating in a race.");
    }

    void win() {
        System.out.println("MightyBull has won the race!");
        this.isChampion = true;
    }

    void defend() {
        System.out.println("MightyBull is defending its territory.");
    }

    void eatGrass() {
        System.out.println("MightyBull is eating grass.");
    }
}
