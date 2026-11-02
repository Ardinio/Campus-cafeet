public class Kaffe extends Produkt implements Tillagbar {

    public Kaffe() {
        super("Kaffe", 25.0);
    }

    @Override 
    public void displayInfo() {
        System.out.println("Produkt: " + getNamn() + ", Pris: " + getPris() + " kr");
    }

    @Override 
    public void tillaga() {
        System.out.println("Tillagar kaffe...");
    }
}
