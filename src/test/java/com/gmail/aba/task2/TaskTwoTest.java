package com.gmail.aba.task2;

import com.gmail.aba.task1.TaskOneMain;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TaskTwoTest {

    @Test
    void testMethodGetTopFiveElements() {
        List<String> words = List.of("I #like Java", "#like #like", "I #like", "you #like MySQL",
                "#travel", "#travel", "#travel #travel #travel", "#travel", "#want", "#want", "#want",
                "#good", "#good", "#good", "#hello", "#hello", "#hello", "#key", "#key",
                "#home", "#home", "#spring", "#boot", "#core");

        Map<String, Integer> expect = new LinkedHashMap<>();
        expect.put("#like", 4);
        expect.put("#travel", 4);
        expect.put("#want", 3);
        expect.put("#good", 3);
        expect.put("#hello", 3);

        assertEquals(expect, new TaskTwoMain().getTopFiveElements(words));
    }

    @Test
    public void testThrowsIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new TaskTwoMain().getTopFiveElements(null);
        });

        String expectedMessage = "The parameter 'words' can't be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}



