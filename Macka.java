public class Macka extends Produkt implements Tillagbar {
    public Macka() {
        super("Macka", 45);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Produkt: " + getNamn() + ", Pris: " + getPris() + " kr");
    }

    @Override
    public void tillaga() {
        System.out.println("Tillagar macka...");
    }
}