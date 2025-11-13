package ucu.apps.flowerstorereboot.payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public boolean pay(double price) {
        System.out.println("Paid " + price + " using Credit Card.");
        return true;
    }
}
