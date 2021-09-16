package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length - 1; i++) {
            for (int j = i; j <= pref.length - 1; j++) {
                if (i == j && word[i] != pref[j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
