import java.util.UUID;
public abstract class Payment implements Payable{
    public double amount;
    public String currency;
    public String status;
    public String referenceId;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.status = "PENDING";
        this.referenceId = "TXN-" + UUID.randomUUID().toString().substring(0, 6);
    }
    public abstract void processPayment();
    public void generateReceipt() {
        System.out.println("Receipt for amount " + amount + " " + currency + " | Reference: " + referenceId);
    }

    public void markAsCompleted() {
        status = "COMPLETED";
    }

    @Override
    public String getReference() {
        return referenceId;
    }
}
