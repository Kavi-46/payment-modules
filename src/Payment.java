public class Payment {
    public double amount;
    public String currency;
    public String status;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.status = "PENDING";
    }
    public void processPayment() {
        System.out.println("Processing generic payment...");
    }

    public void generateReceipt() {
        System.out.println("Receipt for amount " + amount + " " + currency);
    }

    public void markAsCompleted() {
        status = "COMPLETED";
    }
}
