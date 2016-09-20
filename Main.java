import bubble.BubbleSort;

import java.util.Random;

/**
 * @author backtodeath
 * @email lirolaluis@gmail.com
 * @date 28.08.2016
 **/

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting application");
        makeBubbleSort();

    }

    private static void makeBubbleSort() {
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

    private static void printResultInfo(int[] ints100k) {
        System.out.println("Bubble Sort for" + ints100k.length + ":" + ints100k[0] + "," + ints100k[1] + ","
                + ints100k[2] + "," + ints100k[3] + "," + ints100k[4] + "..." + ints100k[ints100k.length - 5]
                + "," + ints100k[ints100k.length - 4] + "," + ints100k[ints100k.length - 3] + ","
                + ints100k[ints100k.length - 2] + "," + ints100k[ints100k.length - 1]);
    }
}