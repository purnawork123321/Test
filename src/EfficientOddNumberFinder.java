import java.util.concurrent.ThreadLocalRandom;

public class EfficientOddNumberFinder {
    public static void main(String[] args) {
        // Generate two random integers
        int lowerBound = ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        int upperBound = ThreadLocalRandom.current().nextInt(lowerBound + 1, Integer.MAX_VALUE);

        System.out.println("Lower Bound: " + lowerBound);
        System.out.println("Upper Bound: " + upperBound);

        // Find and print odd numbers between the two bounds
        long startTime = System.nanoTime();

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 != 0) {
                // i is odd
                System.out.print(i + " ");
            }
        }

        long endTime = System.nanoTime();
        long durationInMillis = (endTime - startTime) / 1_000_000;

        System.out.println("\nTime taken: " + durationInMillis + " milliseconds");
    }
}
