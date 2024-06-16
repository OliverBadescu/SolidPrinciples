package Principles.orders;

import Principles.notification.NotificationSender;
import Principles.payments.Processing;

public class OrderService {

    private OrderProcessor orderProcessor;
    private Processing paymentProcessor;
    private NotificationSender notificationSender;

    public OrderService(OrderProcessor orderProcessor, Processing paymentProcessor, NotificationSender notificationSender) {
        this.orderProcessor = orderProcessor;
        this.paymentProcessor = paymentProcessor;
        this.notificationSender = notificationSender;
    }

    public void placeOrder(Order order) {
        orderProcessor.processOrder(order);

        paymentProcessor.processPayment(order.getAmount());

        notificationSender.notify("Order has been placed successfully");
    }

}
