package threads;

public class SharedBuffer {
    private int data;
    private boolean hasData = false;

    // Method for producing data without synchronization
    public void produce(int value) {
        if (hasData) {
            System.out.println("Buffer full, producer is waiting");
            return;
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + data);
    }

    // Method for consuming data without synchronization
    public int consume() {
        if (!hasData) {
            System.out.println("Buffer empty, consumer is waiting");
            return -1;
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        return data;
    }
}

