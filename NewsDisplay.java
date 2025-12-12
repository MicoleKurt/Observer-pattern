package Lab006;

public class NewsDisplay {
    
    public static void displaySubscriberSubscription(Subscriber subscriber, NewsAgency agency) {
        System.out.println("\n========== SUBSCRIPTION DETAILS ==========");
        System.out.println("Subscriber: " + subscriber.getSubscriberName());
        System.out.println("Email: " + subscriber.getSubscriberEmail());
        System.out.println("Notifications: " + (subscriber.isNotificationEnabled() ? "ENABLED" : "DISABLED"));
        System.out.println("News Agency: " + agency.getAgencyName());
        System.out.println("=========================================\n");
    }
    
    public static void displayNewsUpdate(NewsAgency agency) {
        System.out.println("\n========== LATEST NEWS UPDATE ==========");
        System.out.println("News Agency: " + agency.getAgencyName());
        System.out.println("Total Subscribers: " + agency.getSubscriberCount());
        System.out.println("Latest News: " + agency.getLatestNews());
        System.out.println("========================================\n");
    }
    
    public static void displaySystemInfo(NewsAgency agency) {
        System.out.println("\n========== NEWS SUBSCRIPTION SYSTEM ==========");
        System.out.println("Agency Name: " + agency.getAgencyName());
        System.out.println("Active Subscribers: " + agency.getSubscriberCount());
        System.out.println("==============================================\n");
    }
}