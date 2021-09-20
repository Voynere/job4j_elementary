package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int value = money - price;
        if (value != 0) {
            for (int i = 0; i < rsl.length; i++) {
                while (value >= 1 && value >= coins[i]) {
                    value -= coins[i];
                    rsl[i] = coins[i];
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
