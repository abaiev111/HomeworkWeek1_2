package com.gmail.aba.task1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TaskOneTest {

    @Test
    void testMethodGetPositiveNumbers() {
        Integer[] arr = {5,2,1,4, -2, 0};
        List<Integer> result = Arrays.asList(5, 4, 2, 1);
        assertEquals(result, new TaskOneMain().getPositiveNumbers(arr));

    }

    @Test
    public void testThrowsIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new TaskOneMain().getPositiveNumbers(null);
        });

        String expectedMessage = "The parameter 'numbers' can't be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}