
class Halwa {
    String flavor;
    String sweetnessLevel;
    double weight;

    Halwa() {
        this.flavor = "Mango";
        this.sweetnessLevel = "Medium";
        this.weight = 250.0;
        System.out.println("Halwa: No-arg constructor called.");
    }

    void eat() {
        System.out.println("Eating " + flavor + " halwa.");
    }

    void pack() {
        System.out.println("Halwa is packed.");
    }
}

class SpecialHalwa extends Halwa {
    String region;
    String specialIngredient;

    SpecialHalwa() {
        this.region = "Rajasthan";
        this.specialIngredient = "Saffron";
        System.out.println("SpecialHalwa: No-arg constructor called.");
    }

    void addIngredient(String ingredient) {
        this.specialIngredient = ingredient;
        System.out.println("SpecialHalwa ingredient added: " + ingredient);
    }

    void serve() {
        System.out.println("Serving SpecialHalwa from " + region);
    }
}