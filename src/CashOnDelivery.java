public class CashOnDelivery extends Payment {
    public String deliveryAddress;

    public CashOnDelivery(double amount, String currency, String deliveryAddress) {
        super(amount, currency);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void processPayment() {
        System.out.println("Cash will be collected at delivery address: " + deliveryAddress);
        markAsCompleted();
    }
    @Override
    public boolean validate() {
        System.out.println("Validating delivery address...");
        return deliveryAddress != null && !deliveryAddress.isEmpty();
    }
}