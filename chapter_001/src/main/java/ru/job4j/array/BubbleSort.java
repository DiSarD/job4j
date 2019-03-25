package ru.job4j.array;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] unsorted) {
        boolean flag = true;
        for (int i = 0; i != unsorted.length; i++) {
            if (flag) {
                flag = false;
                for (int j = 1; j != unsorted.length - i; j++) {
                    if (unsorted[j - 1] > unsorted[j]) {
                        int temp = unsorted[j];
                        unsorted[j] = unsorted[j - 1];
                        unsorted[j - 1] = temp;
                        flag = true;
                    }
                }
            } else {
                break;
            }
            System.out.println(Arrays.toString(unsorted));
        }
        return unsorted;
    }
}
