package ru.job4j.array;

public class MatrixCheck {
    public boolean duo(boolean[][] table) {
        boolean flag = true;
        for (int i = 1; i != table.length; i++) {
             boolean check = table[i][i] && table[i - 1][i - 1];
             flag = check && flag;
            }
        for (int i = 1; i != table.length; i++) {
            boolean check = table[i][table.length - i - 1] && table[i - 1][table.length - i];
            flag = check && flag;
        }
        return flag;
    }

    public boolean mono(boolean[][] table) {
        boolean flagx = false;
        boolean flagy = false;
        for (int i = 1; i != table.length; i++) {
            if (table[i - 1][i - 1] == table[i][i]) {
                flagx = true;
            } else {
                flagx = false;
            }
        }
        for (int i = 1; i != table.length; i++) {
            if (table[i][table.length - i - 1] == table[i - 1][table.length - i]) {
                flagy = true;
            } else {
                flagy = false;
            }
        }
        return flagx && flagy;
    }
}
