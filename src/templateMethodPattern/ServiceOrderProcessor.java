package templateMethodPattern;

public class ServiceOrderProcessor extends OnlineOrderProcessor {
    protected void validateOrder() {
        System.out.println("Validare comandă de servicii...");
    }

    protected void generateInvoice() {
        System.out.println("Generare factură pentru comanda de servicii...");
    }

    protected void packOrder() {
        // Nu este necesar pentru comenzile de servicii
    }

    protected void shipOrder() {
        // Nu este necesar pentru comenzile de servicii
    }

    protected void sendNotification() {
        System.out.println("Trimitere notificare către client pentru comanda de servicii...");
    }
}