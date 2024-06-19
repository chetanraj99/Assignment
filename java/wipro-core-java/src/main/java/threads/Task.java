package threads;

import java.util.concurrent.Callable;

class Task implements Callable<String> {
    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Task " + taskId + " is starting.");
        // Simulate some work with Thread.sleep
        Thread.sleep(5000);
        System.out.println("Task " + taskId + " is completed.");
        return "Result of Task " + taskId;
    }
}
