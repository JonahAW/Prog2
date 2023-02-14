import java.awt.*;
import java.util.Scanner;
public class CUI {
    int a;
    Scanner scanner = new Scanner(System.in);

    public void Menue() {
        System.out.println("_____________Menü_____________");
        System.out.println("1 = Artikel");
        System.out.println("2 = Warenkorb");
        System.out.println("3 = Benutzerdaten bearbeiten");
        System.out.println("______________________________");
    }

    public void Auswahl() {
        scanner.nextInt(a);
        switch('a') {
            case '1':
                // Artikelliste anzeigen
                break;
            case '2':
                // Warenkorb anzeigen
                break;
            case '3':
                // Benutzerdaten anzeigen
                break;
            default:
                System.out.println("Eingabe konnte nicht identifiziert werden");
                Menue();
                break;
        }
    }



    public static void main (String[] args) {
        CUI cui = new CUI();
        cui.Menue();
        cui.Auswahl();
    }
}
