class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("Incremented to " + count);
    }

    public synchronized void decrement() {
        count--;
        System.out.println("Decremented to " + count);
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable incrementTask = counter::increment;
        Runnable decrementTask = counter::decrement;

        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(decrementTask);
        Thread t3 = new Thread(incrementTask);
        Thread t4 = new Thread(decrementTask);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

final class ImmutableData {
    private final int value;

    public ImmutableData(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        ImmutableData data = new ImmutableData(42);
        System.out.println("Immutable data value: " + data.getValue());
    }
}
