package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] date, int el) {
        int rst = -1;
        for (int index = 0; index != date.length; index++) {
            if (date[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
