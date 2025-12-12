package Lab006;

public class Subscriber {
    private String subscriberName;
    private String subscriberEmail;
    private boolean notificationEnabled;
    
    public Subscriber(String subscriberName, String subscriberEmail) {
        this.subscriberName = subscriberName;
        this.subscriberEmail = subscriberEmail;
        this.notificationEnabled = true;
    }
    
    public void receiveNews(NewsAgency newsAgency) {
        if (notificationEnabled) {
            System.out.println("[NOTIFICATION] " + subscriberName + " (" + subscriberEmail + ")");
            System.out.println("News: " + newsAgency.getLatestNews());
            System.out.println("Received at: " + java.time.LocalDateTime.now());
            System.out.println();
        }
    }
    
    public void setNotificationEnabled(boolean enabled) {
        this.notificationEnabled = enabled;
        String status = enabled ? "ENABLED" : "DISABLED";
        System.out.println("[" + subscriberName + "] Notifications " + status);
    }
    
    public String getSubscriberName() {
        return subscriberName;
    }
    
    public String getSubscriberEmail() {
        return subscriberEmail;
    }
    
    public boolean isNotificationEnabled() {
        return notificationEnabled;
    }
    
    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }
    
    public void setSubscriberEmail(String subscriberEmail) {
        this.subscriberEmail = subscriberEmail;
    }
    
    @Override
    public String toString() {
        return subscriberName + " (" + subscriberEmail + ")";
    }
}