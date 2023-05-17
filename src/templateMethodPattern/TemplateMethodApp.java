package templateMethodPattern;

public class TemplateMethodApp {
    public static void main(String[] args) {
        System.out.println("Procesare comandă de produse:");
        OnlineOrderProcessor productOrderProcessor = new ProductOrderProcessor();
        productOrderProcessor.processOrder();
        System.out.println("---------------------------------");

        System.out.println("Procesare comandă de servicii:");
        OnlineOrderProcessor serviceOrderProcessor = new ServiceOrderProcessor();
        serviceOrderProcessor.processOrder();
        System.out.println("---------------------------------");
    }
}

