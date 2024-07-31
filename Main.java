
public class Main {
    public static void main(String[] args) {
        // Initial literals
        Spatula spatula = new Spatula("Plastic", "Red", 12.0, "KitchenAid");
        IronBox ironBox = new IronBox("Philips", 1500, "Black", 1.2);
        Mirror mirror = new Mirror("Round", 24.0, 24.0, "Wood");
        Pillow pillow = new Pillow("Feather", "Queen", "White", "SleepWell");
        Wallet wallet = new Wallet("Leather", "Brown", "Fossil", 5);

        // Print initial literals
        System.out.println("Initial literals:");
        spatula.display();
        ironBox.display();
        mirror.display();
        pillow.display();
        wallet.display();

        // Re-initialize with new keyword
        spatula = new Spatula("Silicone", "Blue", 14.0, "Cuisinart");
        ironBox = new IronBox("Bajaj", 2000, "White", 1.5);
        mirror = new Mirror("Square", 30.0, 30.0, "Metal");
        pillow = new Pillow("Memory Foam", "King", "Gray", "Tempur-Pedic");
        wallet = new Wallet("Synthetic", "Black", "Tommy Hilfiger", 8);

        // Print re-initialized literals
        System.out.println("Re-initialized literals:");
        spatula.display();
        ironBox.display();
        mirror.display();
        pillow.display();
        wallet.display();
    }
}

class Spatula {
    String material;
    String color;
    double length;
    String brand;

    public Spatula(String mat, String clr, double len, String br) {
        material = mat;
        color = clr;
        length = len;
        brand = br;
    }

    public void display() {
        System.out.println("Spatula(material=" + material + ", color=" + color + ", length=" + length + ", brand=" + brand + ")");
    }
}

class IronBox {
    String brand;
    int power;
    String color;
    double weight;

    public IronBox(String br, int pw, String clr, double wt) {
        brand = br;
        power = pw;
        color = clr;
        weight = wt;
    }

    public void display() {
        System.out.println("IronBox(brand=" + brand + ", power=" + power + ", color=" + color + ", weight=" + weight + ")");
    }
}

class Mirror {
    String shape;
    double height;
    double width;
    String frameMaterial;

    public Mirror(String shp, double ht, double wd, String frmMat) {
        shape = shp;
        height = ht;
        width = wd;
        frameMaterial = frmMat;
    }

    public void display() {
        System.out.println("Mirror(shape=" + shape + ", height=" + height + ", width=" + width + ", frameMaterial=" + frameMaterial + ")");
    }
}

class Pillow {
    String material;
    String size;
    String color;
    String brand;

    public Pillow(String mat, String sz, String clr, String br) {
        material = mat;
        size = sz;
        color = clr;
        brand = br;
    }

    public void display() {
        System.out.println("Pillow(material=" + material + ", size=" + size + ", color=" + color + ", brand=" + brand + ")");
    }
}

class Wallet {
    String material;
    String color;
    String brand;
    int compartments;

    public Wallet(String mat, String clr, String br, int cmp) {
        material = mat;
        color = clr;
        brand = br;
        compartments = cmp;
    }

    public void display() {
        System.out.println("Wallet(material=" + material + ", color=" + color + ", brand=" + brand + ", compartments=" + compartments + ")");
    }
}


