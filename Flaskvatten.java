public class Flaskvatten extends Produkt {
    public Flaskvatten() {
        super("Flaskvatten", 20.0);
    }

    @Override
    public void displayInfo() {
        System.out.println("Produkt: " + getNamn() + ", Pris: " + getPris() + " kr");
    }
    
}
