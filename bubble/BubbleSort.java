package bubble;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * @author backtodeath
 * @email lirolaluis@gmail.com
 * @date 28.08.2016
 **/

public class BubbleSort {
    public static int[] sortWithBubbleSorting(int[] ints) {
        System.out.println("Starting bubble sorting for " + ints.length + " elements");
        Instant timeOfBeginning = Instant.now();

        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++)
                if (ints[j] < ints[i]) {
                    int k = ints[i];
                    ints[i] = ints[j];
                    ints[j] = k;
                }
        }

        Instant timeOfEnding = Instant.now();

        System.out.println("Bubble sorting: sorting time for " + ints.length + " elements: " + ChronoUnit.MILLIS.between(timeOfBeginning, timeOfEnding) + " ms");

        return ints;
    }
}
