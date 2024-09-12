import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindNumber {
    public static void main(String[] args) {
        // Generate a large dataset (one lac elements) with random numbers less than 100 million
        List<Integer> dataset = generateRandomDataset(100000, 100000000);

        System.out.println(dataset.get(1));

        // Find a specific number (e.g., 42) from the dataset
        int targetNumber = 51685948;

        // Measure the time taken to find the number using parallel processing
        long startTime = System.nanoTime();

        boolean numberExists = dataset.parallelStream().anyMatch(num -> num == targetNumber);

        long endTime = System.nanoTime();
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        // Output the result and performance metrics
        if (numberExists) {
            System.out.println("The number " + targetNumber + " exists in the dataset.");
        } else {
            System.out.println("The number " + targetNumber + " does not exist in the dataset.");
        }

        System.out.println("Time taken: " + durationInMillis + " milliseconds");
    }

    private static List<Integer> generateRandomDataset(int size, int maxValue) {
        Random random = new Random();
        return IntStream.range(0, size)
                .mapToObj(i -> random.nextInt(maxValue))
                .collect(Collectors.toList());
    }
}
