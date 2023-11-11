package com.chinni.logical_programming.strings;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BigSumTest {
    @Test
    public void emptyStringsTest() {
        String result = BigSum.sum("", "", "");
        assertEquals(result.isEmpty(), true);
    }

    @Test
    public void nullStringTest() {
        String result = BigSum.sum(null, null, null);
        assertEquals(result, null);
    }

    @Test
    public void sumOfInteger() {
        String result = BigSum.sum("12345", "9999", "");
        assertEquals(result, "22344");
    }
}
