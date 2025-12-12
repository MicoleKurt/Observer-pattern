package Lab006;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static NewsAgency newsAgency;
    private static Scanner scanner;
    private static List<Subscriber> subscribersList;
    
    public static void main(String[] args) {
        System.out.println("Gonda_Lab Assignment 6");
        System.out.println("Real-time News Subscription Service\n");
        
        scanner = new Scanner(System.in);
        newsAgency = new NewsAgency("Global News Network (GNN)");
        subscribersList = new ArrayList<>();
        
        boolean continueProgram = true;
        
        while (continueProgram) {
            displayMainMenu();
            System.out.print("Enter your choice (1-6): ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice) {
                    case 1:
                        subscribeNewSubscriber();
                        break;
                    case 2:
                        unsubscribeSubscriber();
                        break;
                    case 3:
                        publishNews();
                        break;
                    case 4:
                        viewSubscribers();
                        break;
                    case 5:
                        modifyNotificationPreferences();
                        break;
                    case 6:
                        System.out.println("Thank you for using News Subscription Service. Goodbye!");
                        continueProgram = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.\n");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.\n");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
    
    private static void displayMainMenu() {
        System.out.println("========== NEWS SUBSCRIPTION MENU ==========");
        System.out.println("1. Subscribe to News Service");
        System.out.println("2. Unsubscribe from News Service");
        System.out.println("3. Publish Breaking News");
        System.out.println("4. View All Subscribers");
        System.out.println("5. Modify Notification Preferences");
        System.out.println("6. Exit");
        System.out.println("===========================================\n");
    }
    
    private static void subscribeNewSubscriber() {
        System.out.println("\n========== NEW SUBSCRIPTION ==========");
        System.out.print("Enter subscriber name: ");
        String name = scanner.nextLine();
        System.out.print("Enter subscriber email: ");
        String email = scanner.nextLine();
        
        Subscriber subscriber = new Subscriber(name, email);
        subscribersList.add(subscriber);
        newsAgency.subscribe(subscriber);
        NewsDisplay.displaySubscriberSubscription(subscriber, newsAgency);
    }
    
    private static void unsubscribeSubscriber() {
        if (subscribersList.isEmpty()) {
            System.out.println("\nNo subscribers available to unsubscribe.\n");
            return;
        }
        
        System.out.println("\n========== UNSUBSCRIPTION ==========");
        System.out.println("Available Subscribers:");
        for (int i = 0; i < subscribersList.size(); i++) {
            System.out.println((i + 1) + ". " + subscribersList.get(i).getSubscriberName());
        }
        
        System.out.print("Enter subscriber number to unsubscribe: ");
        try {
            int index = scanner.nextInt();
            scanner.nextLine();
            
            if (index > 0 && index <= subscribersList.size()) {
                Subscriber subscriber = subscribersList.get(index - 1);
                subscribersList.remove(index - 1);
                newsAgency.unsubscribe(subscriber);
                System.out.println();
            } else {
                System.out.println("Invalid selection.\n");
            }
        } catch (Exception e) {
            System.out.println("Invalid input.\n");
            scanner.nextLine();
        }
    }
    
    private static void publishNews() {
        System.out.println("\n========== PUBLISH NEWS ==========");
        System.out.print("Enter breaking news: ");
        String news = scanner.nextLine();
        
        newsAgency.publishNews(news);
        NewsDisplay.displayNewsUpdate(newsAgency);
    }
    
    private static void viewSubscribers() {
        System.out.println();
        newsAgency.displaySubscribers();
    }
    
    private static void modifyNotificationPreferences() {
        if (subscribersList.isEmpty()) {
            System.out.println("\nNo subscribers available.\n");
            return;
        }
        
        System.out.println("\n========== MODIFY PREFERENCES ==========");
        System.out.println("Available Subscribers:");
        for (int i = 0; i < subscribersList.size(); i++) {
            Subscriber sub = subscribersList.get(i);
            String status = sub.isNotificationEnabled() ? "ENABLED" : "DISABLED";
            System.out.println((i + 1) + ". " + sub.getSubscriberName() + " - Notifications: " + status);
        }
        
        System.out.print("Select subscriber number to toggle notifications: ");
        try {
            int index = scanner.nextInt();
            scanner.nextLine();
            
            if (index > 0 && index <= subscribersList.size()) {
                Subscriber subscriber = subscribersList.get(index - 1);
                boolean currentStatus = subscriber.isNotificationEnabled();
                subscriber.setNotificationEnabled(!currentStatus);
                System.out.println();
            } else {
                System.out.println("Invalid selection.\n");
            }
        } catch (Exception e) {
            System.out.println("Invalid input.\n");
            scanner.nextLine();
        }
    }
}