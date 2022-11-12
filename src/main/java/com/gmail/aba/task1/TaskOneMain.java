package com.gmail.aba.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1. Зробити метод, який приймає на вхід масив цілих чисел,
і повертає тільки ті з них, які позитивні (>=0), відсортувавши їх за спаданням.
Зробити unit-тести для цього методу.
*/

public class TaskOneMain {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 6, 8, 1, 4, -2, 0};

        System.out.println(getPositiveNumbers(arr));
    }

    public static List<Integer> getPositiveNumbers(Integer[] numbers) {
        if (numbers == null) throw new IllegalArgumentException("The parameter 'numbers' can't be null");

        List<Integer> num = new ArrayList<>();

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    num.add(numbers[i]);
                }
            }
            Collections.sort(num, Collections.reverseOrder());
            return num;
        }
    }

