package ucu.apps.flowerstorereboot.payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public boolean pay(double price) {
        System.out.println("Paid " + price + " using PayPal.");
        return true;
    }
}
