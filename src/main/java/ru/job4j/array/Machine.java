package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int value = money - price;
        while (value >= 1) {
            for (int i = 0; i < rsl.length; i++) {
                for (int coin : coins) {
                    if (value >= coin) {
                        value -= coin;
                        rsl[i] = coin;
                        size += 1;
                        break;
                    }
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
