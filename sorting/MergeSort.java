package sorting;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 * @author backtodeath
 * @email lirolaluis@gmail.com
 * @date 24.08.2016
 **/

public class MergeSort {
    public static void makeMergeSort() {
        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted100kNumbers = new Random().ints(100000, -1000, 1000).toArray();

        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted10kNumbers = new Random().ints(10000, -1000, 1000).toArray();

        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted1kNumbers = new Random().ints(1000, -1000, 1000).toArray();

        //Sort arrays;
        int[] ints100k = MergeSort.sortWithMergeSorting(unsorted100kNumbers);
        printResultInfo(ints100k);
        int[] ints10k = MergeSort.sortWithMergeSorting(unsorted10kNumbers);
        printResultInfo(ints10k);
        int[] ints1k = MergeSort.sortWithMergeSorting(unsorted1kNumbers);
        printResultInfo(ints1k);
    }

    public static int[] sortWithMergeSorting(int[] ints) {
        System.out.println("Starting merge sorting for " + ints.length + " elements");
        Instant timeOfBeginning = Instant.now();

        mergeSort(ints);

        Instant timeOfEnding = Instant.now();

        System.out.println("Merge sorting: sorting time for " + ints.length + " elements: " + ChronoUnit.MILLIS.between(timeOfBeginning, timeOfEnding) + " ms");

        return ints;
    }

    private static int[] mergeSort(int[] ints) {
        if (ints.length <= 1) {
            return ints;
        }

        int[] firstHalf = new int[ints.length / 2];
        int[] secondHalf = new int[ints.length - firstHalf.length];

        System.arraycopy(ints, 0, firstHalf, 0, firstHalf.length);
        System.arraycopy(ints, firstHalf.length, secondHalf, 0, secondHalf.length);

        mergeSort(firstHalf);
        mergeSort(secondHalf);
        merge(firstHalf, secondHalf, ints);

        return ints;
    }

    private static void merge(int[] first, int[] second, int [] result) {
        int firstIndex = 0;
        int secondIndex = 0;

        int j = 0;
        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] < second[secondIndex]) {
                result[j] = first[firstIndex];
                firstIndex++;
            } else {
                result[j] = second[secondIndex];
                secondIndex++;
            }
            j++;
        }
        System.arraycopy(first, firstIndex, result, j, first.length - firstIndex);
        System.arraycopy(second, secondIndex, result, j, second.length - secondIndex);
    }

    private static void printResultInfo(int[] ints100k) {
        System.out.println("Merge Sort for " + ints100k.length + ":" + ints100k[0] + "," + ints100k[1] + ","
                + ints100k[2] + "," + ints100k[3] + "," + ints100k[4] + "..." + ints100k[ints100k.length - 5]
                + "," + ints100k[ints100k.length - 4] + "," + ints100k[ints100k.length - 3] + ","
                + ints100k[ints100k.length - 2] + "," + ints100k[ints100k.length - 1]);
    }
}
