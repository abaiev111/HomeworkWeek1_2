package com.gmail.aba.task3;

import java.util.Objects;

public class Cube implements Shape{
    private double width;
    private double height;
    private double length;
    private double volume;

    public Cube(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public double calculateVolume() {
        this.volume = width * height * length;
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.width, width) == 0 && Double.compare(cube.height, height) == 0 && Double.compare(cube.length, length) == 0 && Double.compare(cube.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, length, volume);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "volume= " + volume +
                '}';
    }
}
