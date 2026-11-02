public class Bestallning {
    private int orderNummer;
    private String kundNamn;
    private Produkt produkt;
    private OrderStatus status;

    public Bestallning(int orderNummer, String kundNamn, Produkt produkt) {
        this.orderNummer = orderNummer + 1;
        this.kundNamn = kundNamn;
        this.produkt = produkt;
        this.status = OrderStatus.NY; 
    }

    public int getOrderNummer() {
        return orderNummer;
    }

    public String getKundNamn() {
        return kundNamn;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void visaKvitto() {
        System.out.println(String.format("""
        -------------------------------
        Ordernummer: %d
        Kundnamn: %s
        Produkt: %s
        Status: %s
        -------------------------------
        """, getOrderNummer(), getKundNamn(), getProdukt().getNamn(), getStatus()));
    }
}