package com.gmail.aba.task3;

import java.util.Objects;

public class Cylinder implements Shape{
    private double radius;
    private double height;

    private double volume;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        this.volume = Math.PI * radius * radius * height;
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.radius, radius) == 0 && Double.compare(cylinder.height, height) == 0 && Double.compare(cylinder.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, height, volume);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "volume= " + volume +
                '}';
    }
}
