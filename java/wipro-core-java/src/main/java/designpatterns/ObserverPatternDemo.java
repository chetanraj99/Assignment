package designpatterns;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create the subject
        NewspaperPublisher newspaperPublisher = new NewspaperPublisher();

        // Create subscribers
        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");
        Subscriber subscriber3 = new Subscriber("Subscriber 3");

        // Register subscribers with the subject
        newspaperPublisher.registerObserver(subscriber1);
        newspaperPublisher.registerObserver(subscriber2);
        newspaperPublisher.registerObserver(subscriber3);

        // Publish a new issue
        newspaperPublisher.publishNewIssue();
    }
}
