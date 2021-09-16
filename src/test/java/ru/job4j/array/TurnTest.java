package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expected = new int[] {4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {6, 5, 3, 1};
        int[] result = Turn.back(input);
        int[] expected = new int[] {1, 3, 5, 6};
        Assert.assertArrayEquals(expected, result);
    }
}
