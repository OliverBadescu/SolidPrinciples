package Principles.notification;

public class NotificationSender {
    private NotificationService notificationService;

    public NotificationSender(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notify(String message) {
        notificationService.sendNotification(message);
    }
}
