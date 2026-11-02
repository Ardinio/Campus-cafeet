public abstract class Produkt {
    private String namn;
    private double pris;

    public Produkt(String namn, double pris) {
        this.namn = namn;
        this.pris = pris;
    }

    public String getNamn() {
        return namn;
    }

    public double getPris() {
        return pris;
    }

    public abstract void displayInfo();
}