package com.gmail.aba.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
3. Реалізувати метод, який сортує геометричні 3d фігури за обсягом.
Метод приймає параметром колекцію довільних геометричних фігур (куб, кулю, циліндр). Написати unit-тести для методу.
*/

public class TaskThreeMain {
    public static void main(String[] args) {
        List<Shape> list = List.of(new Circle(3),
                                   new Cylinder(3,2),
                                   new Cube(3,2,4),
                                   new Circle(6),
                                   new Cylinder(4,1),
                                   new Cube(2,3,5));

        for (int i = 0; i < list.size(); i++) {
            list.get(i).calculateVolume();
        }

        System.out.println(list);
        System.out.println(sortedShapes(list));
    }

    public static List<Shape> sortedShapes(List<Shape> list) {
        if (list == null) throw new IllegalArgumentException("The parameter 'list' can't be null");

        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            shapes.add(list.get(i));
        }

        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return (int) (o1.calculateVolume() - o2.calculateVolume());
            }
        });
        return shapes;
    }
}
