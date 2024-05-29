import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class PrimeCalculator {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> calculatePrimes(int limit) {
        return IntStream.range(0, limit).filter(PrimeCalculator::isPrime).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        CompletableFuture.supplyAsync(() -> calculatePrimes(1000), executor)
            .thenApply(primes -> primes.stream().map(String::valueOf).collect(Collectors.joining(", ")))
            .thenAcceptAsync(result -> {
                try {
                    Files.write(Paths.get("primes.txt"), result.getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, executor)
            .thenRun(executor::shutdown);
    }
}
