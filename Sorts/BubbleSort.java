package sorts;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 * @author backtodeath
 * @email lirolaluis@gmail.com
 * @date 28.08.2016
 **/

public class BubbleSort {
    public static void makeBubbleSort() {
        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted100kNumbers = new Random().ints(100000, -1000, 1000).toArray();

        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted10kNumbers = new Random().ints(10000, -1000, 1000).toArray();

        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted1kNumbers = new Random().ints(1000, -1000, 1000).toArray();

        //Sort arrays;
        int[] ints100k = BubbleSort.sortWithBubbleSorting(unsorted100kNumbers);
        printResultInfo(ints100k);
        int[] ints10k = BubbleSort.sortWithBubbleSorting(unsorted10kNumbers);
        printResultInfo(ints10k);
        int[] ints1k = BubbleSort.sortWithBubbleSorting(unsorted1kNumbers);
        printResultInfo(ints1k);
    }

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

    private static void printResultInfo(int[] ints100k) {
        System.out.println("Bubble Sort for " + ints100k.length + ":" + ints100k[0] + "," + ints100k[1] + ","
                + ints100k[2] + "," + ints100k[3] + "," + ints100k[4] + "..." + ints100k[ints100k.length - 5]
                + "," + ints100k[ints100k.length - 4] + "," + ints100k[ints100k.length - 3] + ","
                + ints100k[ints100k.length - 2] + "," + ints100k[ints100k.length - 1]);
    }
}
