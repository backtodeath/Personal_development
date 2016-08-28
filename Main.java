import java.util.Random;

/**
 * @author backtodeath
 * @email lirolaluis@gmail.com
 * @date 28.08.2016
 **/

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting application");

        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted100kNumbers = new Random().ints(100000, -1000, 1000).toArray();

        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted10kNumbers = new Random().ints(10000, -1000, 1000).toArray();

        //Get array with 10000 random integers from -1000 to 1000
        int[] unsorted1kNumbers = new Random().ints(1000, -1000, 1000).toArray();
        BubbleSort.sortWithBubbleSorting(unsorted100kNumbers);
        BubbleSort.sortWithBubbleSorting(unsorted10kNumbers);
        BubbleSort.sortWithBubbleSorting(unsorted1kNumbers);

    }
}