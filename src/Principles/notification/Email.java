package Principles.notification;

public class Email implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification: " + message);
    }
}
