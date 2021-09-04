package com.ing.question08.fixed;

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}