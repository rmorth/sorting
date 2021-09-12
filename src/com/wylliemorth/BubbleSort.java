package com.wylliemorth;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements SortingAlgorithm {
    /*
    * Time Complexity
    * Worst/Average case: O(n^2)
    * Best case: O(n) (already sorted)
    * */

    @Override
    public void sort(int[] array) {
        int swapped; // array might be sorted

        for (int i = 0; i < array.length - 1; i++) {
            swapped = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = 1;
                }
            }
            if (swapped == 0) break;
        }
    }
}
