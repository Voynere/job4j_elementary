package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (char[] chars : board) {
            result = true;
            for (int j = 0; j < board.length; j++) {
                if (chars[j] != 'X') {
                    result = false;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }
}
