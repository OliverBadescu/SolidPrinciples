package Principles.notification;

public class SMS implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
