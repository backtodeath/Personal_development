import static sorts123.BubbleSort.makeBubbleSort;
import static sorts123.InsertionSort.makeInsertionSort;
import static sorts123.MergeSort.makeMergeSort;

/**
 * @author backtodeath
 * @email lirolaluis@gmail.com
 * @date 28.08.2016
 **/

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting application");
        makeBubbleSort();
        makeInsertionSort();
        makeMergeSort();
    }
}