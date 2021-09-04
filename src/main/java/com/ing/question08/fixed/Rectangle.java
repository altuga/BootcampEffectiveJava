package com.ing.question08.fixed;

class Rectangle extends Figure {
    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    double area() {
        return length * width;
    }
}