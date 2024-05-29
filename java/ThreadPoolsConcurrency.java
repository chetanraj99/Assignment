import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ComplexTask implements Runnable {
    private final int taskId;

    public ComplexTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Executing task " + taskId + " by " + Thread.currentThread().getName());
        // Simulate complex calculation or I/O operation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Completed task " + taskId);
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executor.submit(new ComplexTask(i));
        }
        executor.shutdown();
    }
}
