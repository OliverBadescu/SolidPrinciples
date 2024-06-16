package Principles.payments;

public class Processing {
    private PaymentMethod paymentMethod;

    public Processing(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}
