package com.gmail.aba.task3;

import com.gmail.aba.task2.TaskTwoMain;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TaskThreeTest {

    @Test
    void testMethodSortedShapes() {
        List<Shape> list = List.of(new Circle(3), new Cube(4,6,5), new Cylinder(3,2));
        for (Shape shapes: list) {
            shapes.calculateVolume();
        }

        List<Shape> expect = List.of(new Cylinder(3,2), new Circle(3), new Cube(4,6,5));
        for (Shape shapes: expect) {
            shapes.calculateVolume();
        }
        assertEquals(expect, new TaskThreeMain().sortedShapes(list));
    }

    @Test
    public void testThrowsIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new TaskThreeMain().sortedShapes(null);
        });

        String expectedMessage = "The parameter 'list' can't be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}