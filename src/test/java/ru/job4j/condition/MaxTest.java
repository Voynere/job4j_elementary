package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    public void whenMax7To10Then10() {
        int left = 7;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    public void whenMax22To22Then22() {
        int left = 22;
        int right = 22;
        int result = Max.max(left, right);
        int expected = 22;
        Assert.assertEquals(result, expected);
    }
}
