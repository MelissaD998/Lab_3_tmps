package templateMethodPattern;

abstract class OnlineOrderProcessor {
    public void processOrder() {
        validateOrder();
        generateInvoice();
        packOrder();
        shipOrder();
        sendNotification();
    }

    protected abstract void validateOrder();
    protected abstract void generateInvoice();
    protected abstract void packOrder();
    protected abstract void shipOrder();
    protected abstract void sendNotification();
}

