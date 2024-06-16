package Principles.orders;

public class OrderProcessor {

    public void processOrder(Order order) {
        System.out.println("Order with ID: " + order.getOrderId() + " has been processed");
    }

}
