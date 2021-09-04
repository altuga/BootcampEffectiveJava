package com.ing.question08.fixed;

class Circle extends Figure implements AutoCloseable  {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void close() throws Exception {

    }
}
