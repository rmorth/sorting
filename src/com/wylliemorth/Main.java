package com.wylliemorth;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private final static int SEED = 47;

    public static void main(String[] args) {
        Random random = new Random(SEED);

        int[] array = new int[1000];
        int min = 0;
        int max = 1000;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        BubbleSort bs = new BubbleSort();
        bs.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
