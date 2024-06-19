package designpatterns;

import java.util.ArrayList;
import java.util.List;

public class NewspaperPublisher implements ObserverSubject {
    private List<Observer> observers = new ArrayList<>();

    public void publishNewIssue() {
        // Publish a new issue
        System.out.println("New issue published!");

        // Notify all subscribers
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

