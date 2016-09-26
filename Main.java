import static sorting.BubbleSort.makeBubbleSort;
import static sorting.InsertionSort.makeInsertionSort;
import static sorting.MergeSort.makeMergeSort;

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