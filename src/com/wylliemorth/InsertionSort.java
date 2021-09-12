package com.wylliemorth;

public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i]; // else we'll lose context

            int aux = i-1;
            while (aux >= 0 && array[aux] > value) {
                array[aux+1] = array[aux];
                aux--;
            }
            array[aux+1] = value;
        }
    }
}
