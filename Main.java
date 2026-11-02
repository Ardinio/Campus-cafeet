import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        while (true) {
            printMenu();
        }
    }

    static Scanner scanner = new Scanner(System.in);
    static Produkt[] produkter = {new Flaskvatten(), new Macka(), new Kaffe()};
    static List<Bestallning> bestallningar = new ArrayList<>();
    static Deque<Bestallning> bestallningsKon = new LinkedList<>();

    static void printMenu() {
        System.out.println("""
        === Välkommen till CampusCaféet! ===
        1. Visa produkter och priser
        2. Lägg en beställning
        3. Visa alla beställningar
        4. Visa beställningskön
        5. Gör klar nästa beställning
        6. Lämna ut färdig beställning
        7. Visa dagens statistik
        8. Avsluta
        """);
        
        switch (scanner.nextInt()) {
            case 1: // Visa produkter och priser
                visaProdukter();
                break;
            case 2: // Lägg en beställning
                
                break;
            case 3: // Visa alla beställningar
                
                break;
            case 4: // Visa beställningskön
                
                break;
            case 5: // Gör klar nästa beställning
                
                break;
            case 6: // Lämna ut färdig beställning
                
                break;
            case 7: // Visa dagens statistik
                
                break;
            case 8: // Avsluta
                System.exit(0);
            default:
                System.out.println("Ogiltigt val. Försök igen.");
                break;
        }
    }

    static void visaProdukter() {
        System.out.println("Produkter och priser:");
        for (Produkt produkt : produkter) {
            System.out.println(produkt.getNamn() + " - " + produkt.getPris() + " kr");
        }
    }

    static void laggBestallning() {
        System.out.print("Ange kundens namn: ");
        String kundNamn = scanner.next();
        System.out.println("Välj produkt:");
        for (int i = 0; i < produkter.length; i++) {
            System.out.println((i + 1) + ". " + produkter[i].getNamn() + " - " + produkter[i].getPris() + " kr");
        }
        int produktVal = scanner.nextInt() - 1;
        if (produktVal < 0 || produktVal >= produkter.length) {
            System.out.println("Ogiltigt produktval.");
            return;
        }
        Produkt valdProdukt = produkter[produktVal];
        Bestallning bestallning = new Bestallning(0, kundNamn, valdProdukt);
        System.out.println("Beställning lagd:");
        bestallning.visaKvitto();
    }
}