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

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 1; i != 5; i++) {
            if ((board[1][i] == 'X' && board[2][i] == 'X' && board[3][i] == 'X' && board[4][i] == 'X' && board[5][i] == 'X') ||
                    (board[i][1] == 'X' && board[i][2] == 'X' && board[i][3] == 'X' && board[i][4] == 'X' && board[i][5] == 'X')) {
                result = true;
            }
        }
        return result;
    }
}

