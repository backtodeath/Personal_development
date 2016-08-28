import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * @author backtodeath
 * @email lirolaluis@gmail.com
 * @date 28.08.2016
 **/

class BubbleSort {
    static void sortWithBubbleSorting(int[] ints) {
        System.out.println("Starting bubble sorting for " + ints.length + " elements");
        Instant timeOfBeginning = Instant.now();

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1; j++)
                if (ints[i] < ints[j]) {
                    int k = ints[i];
                    ints[i] = ints[j];
                    ints[j] = k;
                }
        }

        Instant timeOfEnding = Instant.now();

        System.out.println("sorting time for " + ints.length + " elements: " + ChronoUnit.MILLIS.between(timeOfBeginning, timeOfEnding) + " ms");
        /*System.out.println("array after sorting: " + Arrays.toString(ints));*/
    }
}
