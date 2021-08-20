package com.ing.question43.unsuportedOperation;

public class ModelDuck extends Duck{
    @Override
    void display() {
        System.out.println("I am Model Duck");
    }


    @Override
    void fly() {
        throw new UnsupportedOperationException("I am Model Duck");
    }
}
