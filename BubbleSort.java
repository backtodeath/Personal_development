import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * @author backtodeath
 * @email lirolaluis@gmail.com
 * @date 28.08.2016
 **/

class BubbleSort {
    static void sortWithBubbleSorting(int[] unsortedNumbers) {
        System.out.println("Starting bubble sorting for " + unsortedNumbers.length + " elements");
        Instant timeOfBeginning = Instant.now();

        for (int i = 0; i < unsortedNumbers.length; i++) {
            for (int j = 0; j < unsortedNumbers.length - 1; j++)
                if (unsortedNumbers[i] < unsortedNumbers[j]) {
                    int k = unsortedNumbers[i];
                    unsortedNumbers[i] = unsortedNumbers[j];
                    unsortedNumbers[j] = k;
                }
        }

        Instant timeOfEnding = Instant.now();

        System.out.println("sorting time for " + unsortedNumbers.length + " elements: " + ChronoUnit.MILLIS.between(timeOfBeginning, timeOfEnding) + " ms");
    }
}
