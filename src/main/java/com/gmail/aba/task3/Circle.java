package com.gmail.aba.task3;

import java.util.Objects;

public class Circle implements Shape {
    private double radius;
    private double volume;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        this.volume = (4*Math.PI*Math.pow(radius, 3))/3;
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Double.compare(circle.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, volume);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "volume= " + volume +
                '}';
    }
}
