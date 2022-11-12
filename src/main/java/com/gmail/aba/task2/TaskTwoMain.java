package com.gmail.aba.task2;


import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
2. Написати метод, який на вхід приймає список рядків-текстів,
в яких можуть бути хеш-теги (слова, що починаються на знак "#").
Як результат, метод повинен повертати top-5 найчастіше згаданих хеш-тегів із зазначенням кількості згадки кожного з них.
Декілька однакових хеш-тегів в одному рядку повинні вважатися однією згадкою. Написати unit-тести для цього методу.
*/

public class TaskTwoMain {
    public static void main(String[] args) {
        List<String> list = List.of("#spring", "#spring #spring", "#spring", "you like #spring",
                "#home", "#home", "#home #home #home", "#home", "#like", "#like",
                "#core", "#core", "#core", "#job", "#job", "#job", "#key", "#key", "#boot", "#job");

        System.out.println(getTopFiveElements(list));
    }

    public static Map<String, Integer> getTopFiveElements(List<String> words) {
        if (words == null) throw new IllegalArgumentException("The parameter 'words' can't be null");

        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            Pattern pattern = Pattern.compile("#\\w+");
            Matcher matcher = pattern.matcher(words.get(i));
            matcher.find();
            Integer count = wordCount.get(matcher.group());
            wordCount.put(matcher.group(), (count == null) ? 1 : count+1);
        }

        Map<String, Integer> topFive = wordCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return topFive;
    }
}
