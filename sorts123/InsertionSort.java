package sorts123;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 * @author backtodeath
 * @email lirolaluis@gmail.com
 * @date 23.09.2016
 **/

public class InsertionSort {
    public static void makeInsertionSort() {
        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted100kNumbers = new Random().ints(100000, -1000, 1000).toArray();

        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted10kNumbers = new Random().ints(10000, -1000, 1000).toArray();

        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted1kNumbers = new Random().ints(1000, -1000, 1000).toArray();

        //Sort arrays;
        int[] ints100k = InsertionSort.sortWithInsertionSorting(unsorted100kNumbers);
        printResultInfo(ints100k);
        int[] ints10k = InsertionSort.sortWithInsertionSorting(unsorted10kNumbers);
        printResultInfo(ints10k);
        int[] ints1k = InsertionSort.sortWithInsertionSorting(unsorted1kNumbers);
        printResultInfo(ints1k);
    }

    public static int[] sortWithInsertionSorting(int[] ints) {
        System.out.println("Starting insertion sorting for " + ints.length + " elements");
        Instant timeOfBeginning = Instant.now();

        int temp;

        for (int i = 1; i < ints.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(ints[j] < ints[j-1]){
                    temp = ints[j];
                    ints[j] = ints[j-1];
                    ints[j-1] = temp;
                } else {
                    break;
                }
            }
        }

        Instant timeOfEnding = Instant.now();

        System.out.println("Insertion sorting: sorting time for " + ints.length + " elements: " + ChronoUnit.MILLIS.between(timeOfBeginning, timeOfEnding) + " ms");

        return ints;
    }

    private static void printResultInfo(int[] ints100k) {
        System.out.println("Insertion Sort for " + ints100k.length + ":" + ints100k[0] + "," + ints100k[1] + ","
                + ints100k[2] + "," + ints100k[3] + "," + ints100k[4] + "..." + ints100k[ints100k.length - 5]
                + "," + ints100k[ints100k.length - 4] + "," + ints100k[ints100k.length - 3] + ","
                + ints100k[ints100k.length - 2] + "," + ints100k[ints100k.length - 1]);
    }
}
