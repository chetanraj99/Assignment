package designpatterns;

public interface ObserverSubject {
	void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();


}
