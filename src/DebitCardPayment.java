public class DebitCardPayment extends CardPayment implements Discount{
    public double availableBalance;
    public double discountedAmount;

    public DebitCardPayment(double amount, String currency, String cardNumber, String cardHolderName, String expiryDate, double availableBalance) {
        super(amount, currency, cardNumber, cardHolderName, expiryDate);
        this.availableBalance = availableBalance;
        this.discountedAmount = amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Debiting from account balance " + availableBalance + " for amount " + discountedAmount);
    }

    public void checkSufficientBalance() {
        System.out.println("Checking if balance covers amount.");
    }

    @Override
    public double applyDiscount(double percent) {
        discountedAmount = amount * (1 - percent / 100);
        System.out.println("Discount of " + percent + "% applied. New amount: " + discountedAmount);
        return discountedAmount;
    }

    @Override
    public double finalAmount() {
        return discountedAmount;
    }
}