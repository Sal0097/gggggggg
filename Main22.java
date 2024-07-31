
public class Main22 {
    public static void main(String[] args) {
        // Creating and displaying instances of MusicalInstrument
        MusicalInstrument instrument1 = new MusicalInstrument("Instrument1", "Type1", "Brand1", 101);
        MusicalInstrument instrument2 = new MusicalInstrument("Instrument2", "Type2", "Brand2", 102);
        MusicalInstrument instrument3 = new MusicalInstrument("Instrument3", "Type3", "Brand3", 103);
        MusicalInstrument instrument4 = new MusicalInstrument("Instrument4", "Type4", "Brand4", 104);
        MusicalInstrument instrument5 = new MusicalInstrument("Instrument5", "Type5", "Brand5", 105);
        MusicalInstrument instrument6 = new MusicalInstrument("Instrument6", "Type6", "Brand6", 106);
        MusicalInstrument instrument7 = new MusicalInstrument("Instrument7", "Type7", "Brand7", 107);
        instrument1.display();
        instrument2.display();
        instrument3.display();
        instrument4.display();
        instrument5.display();
        instrument6.display();
        instrument7.display();

        // Creating and displaying instances of Injection
        Injection injection1 = new Injection("Medicine1", 11, "Brand1", "2023-12-11");
        Injection injection2 = new Injection("Medicine2", 12, "Brand2", "2023-12-12");
        Injection injection3 = new Injection("Medicine3", 13, "Brand3", "2023-12-13");
        Injection injection4 = new Injection("Medicine4", 14, "Brand4", "2023-12-14");
        Injection injection5 = new Injection("Medicine5", 15, "Brand5", "2023-12-15");
        Injection injection6 = new Injection("Medicine6", 16, "Brand6", "2023-12-16");
        Injection injection7 = new Injection("Medicine7", 17, "Brand7", "2023-12-17");
        injection1.display();
        injection2.display();
        injection3.display();
        injection4.display();
        injection5.display();
        injection6.display();
        injection7.display();

        // Creating and displaying instances of Tubelight
        Tubelight tubelight1 = new Tubelight("Type1", 41, "Brand1", 4.1);
        Tubelight tubelight2 = new Tubelight("Type2", 42, "Brand2", 4.2);
        Tubelight tubelight3 = new Tubelight("Type3", 43, "Brand3", 4.3);
        Tubelight tubelight4 = new Tubelight("Type4", 44, "Brand4", 4.4);
        Tubelight tubelight5 = new Tubelight("Type5", 45, "Brand5", 4.5);
        Tubelight tubelight6 = new Tubelight("Type6", 46, "Brand6", 4.6);
        Tubelight tubelight7 = new Tubelight("Type7", 47, "Brand7", 4.7);
        tubelight1.display();
        tubelight2.display();
        tubelight3.display();
        tubelight4.display();
        tubelight5.display();
        tubelight6.display();
        tubelight7.display();

        // Creating and displaying instances of Kettle
        Kettle kettle1 = new Kettle("Material1", 1.6, "Brand1", 1501);
        Kettle kettle2 = new Kettle("Material2", 1.7, "Brand2", 1502);
        Kettle kettle3 = new Kettle("Material3", 1.8, "Brand3", 1503);
        Kettle kettle4 = new Kettle("Material4", 1.9, "Brand4", 1504);
        Kettle kettle5 = new Kettle("Material5", 2.0, "Brand5", 1505);
        Kettle kettle6 = new Kettle("Material6", 2.1, "Brand6", 1506);
        Kettle kettle7 = new Kettle("Material7", 2.2, "Brand7", 1507);
        kettle1.display();
        kettle2.display();
        kettle3.display();
        kettle4.display();
        kettle5.display();
        kettle6.display();
        kettle7.display();

        // Creating and displaying instances of Microscope
        Microscope microscope1 = new Microscope("Type1", 101, "Brand1", 201);
        Microscope microscope2 = new Microscope("Type2", 102, "Brand2", 202);
        Microscope microscope3 = new Microscope("Type3", 103, "Brand3", 203);
        Microscope microscope4 = new Microscope("Type4", 104, "Brand4", 204);
        Microscope microscope5 = new Microscope("Type5", 105, "Brand5", 205);
        Microscope microscope6 = new Microscope("Type6", 106, "Brand6", 206);
        Microscope microscope7 = new Microscope("Type7", 107, "Brand7", 207);
        microscope1.display();
        microscope2.display();
        microscope3.display();
        microscope4.display();
        microscope5.display();
        microscope6.display();
        microscope7.display();
    }
}
class MusicalInstrument {
    String name;
    String type;
    String brand;
    double price;

    public MusicalInstrument(String nm, String tp, String br, double pr) {
        name = nm;
        type = tp;
        brand = br;
        price = pr;
    }

    public void display() {
        System.out.println("MusicalInstrument(name=" + name + ", type=" + type + ", brand=" + brand + ", price=" + price + ")");
    }
}

class Injection {
    String medicineName;
    double dosage;
    String brand;
    String expiryDate;

    public Injection(String mn, double ds, String br, String ed) {
        medicineName = mn;
        dosage = ds;
        brand = br;
        expiryDate = ed;
    }

    public void display() {
        System.out.println("Injection(medicineName=" + medicineName + ", dosage=" + dosage + ", brand=" + brand + ", expiryDate=" + expiryDate + ")");
    }
}

class Tubelight {
    String type;
    int wattage;
    String brand;
    double length;

    public Tubelight(String tp, int wt, String br, double len) {
        type = tp;
        wattage = wt;
        brand = br;
        length = len;
    }

    public void display() {
        System.out.println("Tubelight(type=" + type + ", wattage=" + wattage + ", brand=" + brand + ", length=" + length + ")");
    }
}

class Kettle {
    String material;
    double capacity;
    String brand;
    int power;

    public Kettle(String mat, double cap, String br, int pw) {
        material = mat;
        capacity = cap;
        brand = br;
        power = pw;
    }

    public void display() {
        System.out.println("Kettle(material=" + material + ", capacity=" + capacity + ", brand=" + brand + ", power=" + power + ")");
    }
}

class Microscope {
    String type;
    int magnification;
    String brand;
    double price;

    public Microscope(String tp, int mag, String br, double pr) {
        type = tp;
        magnification = mag;
        brand = br;
        price = pr;
    }

    public void display() {
        System.out.println("Microscope(type=" + type + ", magnification=" + magnification + ", brand=" + brand + ", price=" + price + ")");
    }
}



