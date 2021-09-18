package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {13, 4, 10, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 5, 10, 13};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {15, 22, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 15, 22};
        Assert.assertArrayEquals(expected, result);
    }
}
