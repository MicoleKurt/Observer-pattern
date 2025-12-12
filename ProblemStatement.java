package Lab006;

public class ProblemStatement {
    
    public static void displayProblemStatement() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("REAL-TIME NEWS SUBSCRIPTION SERVICE");
        System.out.println("Lab Assignment 6 - Observer Pattern");
        System.out.println("=".repeat(70));
        
        System.out.println("\nBACKGROUND:");
        System.out.println("You're tasked with designing a real-time news subscription service for");
        System.out.println("a media company. The system needs to notify subscribers about breaking");
        System.out.println("news as soon as it's published by the news agency.");
        
        System.out.println("\nSCENARIO DESCRIPTION:");
        System.out.println("The system comprises two main components: NewsAgency and Subscriber.");
        System.out.println("- NewsAgency: Represents the central hub for publishing news. It");
        System.out.println("  maintains a list of subscribers and notifies them whenever new");
        System.out.println("  news is available.");
        System.out.println("- Subscriber: Represents users or entities subscribed to the news");
        System.out.println("  service. Subscribers receive immediate notifications about any");
        System.out.println("  breaking news published by the agency.");
        
        System.out.println("\nREQUIREMENTS:");
        System.out.println("1. Subscription Management:");
        System.out.println("   - Users should be able to subscribe to the news service.");
        System.out.println("   - Subscribers should be notified promptly when new news is published.");
        System.out.println("\n2. Dynamic Subscription Updates:");
        System.out.println("   - The system should allow for dynamic subscription updates.");
        System.out.println("   - Subscribers can subscribe, unsubscribe, or modify preferences");
        System.out.println("     without disrupting other subscribers.");
        System.out.println("\n3. Decoupled Communication:");
        System.out.println("   - Ensure decoupled communication between news agency and subscribers.");
        System.out.println("   - Subscribers shouldn't directly request news updates but should be");
        System.out.println("     notified by the news agency when new information is available.");
        
        System.out.println("\nEXPECTED BEHAVIOR:");
        System.out.println("- When the news agency publishes breaking news, all subscribed users");
        System.out.println("  receive immediate updates.");
        System.out.println("- Subscribers can join or leave the service without affecting delivery");
        System.out.println("  to other subscribers.");
        System.out.println("- The system provides flexibility for future enhancements, such as");
        System.out.println("  personalized subscriptions or categorization of news updates.");
        
        System.out.println("\nCONSTRAINTS:");
        System.out.println("- The system should be scalable to handle a growing number of");
        System.out.println("  subscribers without compromising performance.");
        System.out.println("- Ensure implementation follows OOP design principles and promotes");
        System.out.println("  loose coupling between the news agency and subscribers.");
        
        System.out.println("\nDESIGN PATTERN: Observer Pattern");
        System.out.println("- NewsAgency acts as the Subject/Observable");
        System.out.println("- Subscriber acts as the Observer");
        System.out.println("- Implements publish-subscribe mechanism with loose coupling");
        
        System.out.println("\n" + "=".repeat(70) + "\n");
    }
}