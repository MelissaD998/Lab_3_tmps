package templateMethodPattern;

public class ProductOrderProcessor extends OnlineOrderProcessor {
    protected void validateOrder() {
        System.out.println("Validare comandă de produse...");
    }

    protected void generateInvoice() {
        System.out.println("Generare factură pentru comanda de produse...");
    }

    protected void packOrder() {
        System.out.println("Pregătirea comenzii de produse pentru ambalare...");
    }

    protected void shipOrder() {
        System.out.println("Expedierea comenzii de produse...");
    }

    protected void sendNotification() {
        System.out.println("Trimitere notificare către client pentru comanda de produse...");
    }
}
