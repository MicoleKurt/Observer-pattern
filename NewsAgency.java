package Lab006;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewsAgency {
    private String agencyName;
    private List<Subscriber> subscribers;
    private String latestNews;
    private LocalDateTime newsPublishTime;
    
    public NewsAgency(String agencyName) {
        this.agencyName = agencyName;
        this.subscribers = new ArrayList<>();
        this.latestNews = "";
    }
    
    public void subscribe(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println("[" + agencyName + "] " + subscriber.getSubscriberName() + " has subscribed.");
        }
    }
    
    public void unsubscribe(Subscriber subscriber) {
        if (subscribers.remove(subscriber)) {
            System.out.println("[" + agencyName + "] " + subscriber.getSubscriberName() + " has unsubscribed.");
        }
    }
    
    public void publishNews(String news) {
        this.latestNews = news;
        this.newsPublishTime = LocalDateTime.now();
        System.out.println("\n========== BREAKING NEWS ==========");
        System.out.println("News Agency: " + agencyName);
        System.out.println("Published: " + newsPublishTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("News: " + news);
        System.out.println("====================================\n");
        notifyAllSubscribers();
    }
    
    private void notifyAllSubscribers() {
        System.out.println("Notifying " + subscribers.size() + " subscribers...\n");
        for (Subscriber subscriber : subscribers) {
            subscriber.receiveNews(this);
        }
    }
    
    public String getAgencyName() {
        return agencyName;
    }
    
    public String getLatestNews() {
        return latestNews;
    }
    
    public LocalDateTime getNewsPublishTime() {
        return newsPublishTime;
    }
    
    public int getSubscriberCount() {
        return subscribers.size();
    }
    
    public void displaySubscribers() {
        System.out.println("Active Subscribers of " + agencyName + ":");
        if (subscribers.isEmpty()) {
            System.out.println("No subscribers at the moment.");
        } else {
            for (int i = 0; i < subscribers.size(); i++) {
                System.out.println((i + 1) + ". " + subscribers.get(i).getSubscriberName());
            }
        }
        System.out.println();
    }
}