package Principles;

import Principles.notification.Email;
import Principles.notification.NotificationSender;
import Principles.orders.Order;
import Principles.orders.OrderProcessor;
import Principles.orders.OrderService;
import Principles.payments.CreditCard;
import Principles.payments.Processing;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("12345", 99);

        OrderProcessor orderProcessor = new OrderProcessor();
        Processing paymentProcessor = new Processing(new CreditCard());
        NotificationSender notificationSender = new NotificationSender(new Email());

        OrderService orderService = new OrderService(orderProcessor, paymentProcessor, notificationSender);
        orderService.placeOrder(order);
    }
}