package threads.childthread;

public class SharedBuffer {
    private int data;
    private boolean hasData = false;

    // Synchronized method for producing data
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // Wait until the data is consumed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + data);
        notify(); // Notify the consumer that new data is available
    }

    // Synchronized method for consuming data
    public synchronized int consume() {
        while (!hasData) {
            try {
                wait(); // Wait until data is produced
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify(); // Notify the producer that data has been consumed
        return data;
    }
}
