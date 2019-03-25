package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i != data.length; i++) {
            if (i == 0) {
                result = data[i];
            } else {
                result = data[i] && result;
            }
        }
        return result;
    }
}
