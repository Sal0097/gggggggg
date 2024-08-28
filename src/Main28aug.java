public class Main28aug {
    public static void main(String[] args) {

        Bulb myBulb = new SmartBulb();
        myBulb.type = "Smart LED";
        myBulb.switchOn();
        ((SmartBulb) myBulb).changeColor("Green");

        System.out.println("========================================");


        SpecialHalwa mySpecialHalwa = new SpecialHalwa();
        mySpecialHalwa.flavor = "Chocolate";
        mySpecialHalwa.serve();
        mySpecialHalwa.addIngredient("Almonds");
        System.out.println("========================================");


        AdvancedSmartPhone myPhone = new AdvancedSmartPhone();
        myPhone.brand = "Samsung";
        myPhone.playGame();
        myPhone.takePhoto();
        System.out.println("========================================");


        MightyBull myBull = new MightyBull();
        myBull.breed = "Brahman";
        myBull.participateInRace();
        myBull.win();
        System.out.println("========================================");


        FarmChicken myChicken = new FarmChicken();
        myChicken.breed = "Rhode Island Red";
        myChicken.forage();
        myChicken.layDoubleYolkEgg();
        System.out.println("========================================");
    }
}
