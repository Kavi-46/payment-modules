import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CashOnDelivery cod = new CashOnDelivery(5000.00, "LKR",  "No. 12, Galle Road, Colombo");
        BankTransfer bankTransfer = new BankTransfer(12000.00, "LKR",  "HNB Bank", "123456789", "REF001");
        CreditCardPayment creditCard = new CreditCardPayment(8000.00, "LKR", "4567 8910 1234 5678", "Kavindu Sanchala", "12/28", 150000.00);
        DebitCardPayment debitCard = new DebitCardPayment(3500.00, "LKR", "1234 5678 9876 5432", "Kavindu Sanchala", "10/27", 50000.00);

        cod.processPayment();
        bankTransfer.processPayment();
        creditCard.processPayment();
        debitCard.processPayment();

        cod.generateReceipt();
        bankTransfer.generateReceipt();
        creditCard.generateReceipt();
        debitCard.generateReceipt();

        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(cod);
        payments.add(bankTransfer);
        payments.add(creditCard);
        payments.add(debitCard);

        for (Payment p : payments) {
            p.processPayment();
        }
    }
}