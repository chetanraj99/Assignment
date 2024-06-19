package threads;

class YieldExample extends Thread {
    public YieldExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - iteration: " + i);
            // Yield the CPU to give other threads a chance to run
            Thread.yield();
        }
    }
}

class JoinExample extends Thread {
    private Thread threadToJoin;

    public JoinExample(String name, Thread threadToJoin) {
        super(name);
        this.threadToJoin = threadToJoin;
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            if (threadToJoin != null) {
                System.out.println(getName() + " waiting for " + threadToJoin.getName() + " to finish.");
                threadToJoin.join();
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " resuming.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - iteration: " + i);
        }
        System.out.println(getName() + " finished.");
    }
}

public class YieldAndJoinDemo {
    public static void main(String[] args) {
        System.out.println("Demonstrating yield():");
        Thread yieldThread1 = new YieldExample("YieldThread-1");
        Thread yieldThread2 = new YieldExample("YieldThread-2");

        yieldThread1.start();
        yieldThread2.start();

        try {
            yieldThread1.join();
           yieldThread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for yield threads.");
        }

        System.out.println("\nDemonstrating join():");
        Thread joinThread1 = new Thread(() -> {
            System.out.println("JoinThread-1 starting.");
            try {
                Thread.sleep(2000); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println("JoinThread-1 interrupted.");
            }
            System.out.println("JoinThread-1 finished.");
        }, "JoinThread-1");

        Thread joinThread2 = new JoinExample("JoinThread-2", joinThread1);

        joinThread1.start();
       // joinThread2.start();

        try {
            joinThread1.join();
        //    joinThread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for join threads.");
        }

        System.out.println("Main thread ending.");
    }
}
