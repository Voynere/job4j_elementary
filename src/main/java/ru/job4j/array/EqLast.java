package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        for (int i = left.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (i == j && left[i] == right[j]) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
