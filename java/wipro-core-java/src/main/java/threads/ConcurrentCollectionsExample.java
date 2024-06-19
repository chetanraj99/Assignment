package threads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentCollectionsExample {

    public static void main(String[] args) throws InterruptedException {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        
        // Create a CopyOnWriteArrayList
        CopyOnWriteArrayList<String> concurrentList = new CopyOnWriteArrayList<>();
        
        // Create a thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit tasks to update ConcurrentHashMap
        for (int i = 0; i < 10; i++) {
            final int index = i;
            executorService.submit(() -> {
                concurrentMap.put("Key" + index, index);
                System.out.println(Thread.currentThread().getName() + " added Key" + index + " to ConcurrentHashMap");
            });
        }

        // Submit tasks to update CopyOnWriteArrayList
        for (int i = 0; i < 10; i++) {
            final int index = i;
            executorService.submit(() -> {
                concurrentList.add("Element" + index);
                System.out.println(Thread.currentThread().getName() + " added Element" + index + " to CopyOnWriteArrayList");
            });
        }

        // Shutdown the executor service and wait for tasks to complete
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        // Print the contents of ConcurrentHashMap
        System.out.println("ConcurrentHashMap contents:");
        concurrentMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Print the contents of CopyOnWriteArrayList
        System.out.println("CopyOnWriteArrayList contents:");
        concurrentList.forEach(System.out::println);
    }
}
