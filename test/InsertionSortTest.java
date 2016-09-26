package test;

import org.junit.Test;

import java.util.Arrays;

import static sorts.InsertionSort.sortWithInsertionSorting;

public class InsertionSortTest {
    @Test
    public void shouldReturnSortedArray() throws Exception {
        int[] ints = {0, -0, 4, 7, -3, -18, 24};

        int[] result = sortWithInsertionSorting(ints);

        assert (Arrays.equals(result, new int[]{-18, -3, 0, 0, 4, 7, 24}));
    }

}