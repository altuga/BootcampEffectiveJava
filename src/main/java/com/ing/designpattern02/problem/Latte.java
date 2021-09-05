package com.ing.designpattern02.problem;

public class Latte implements Icecek {


    @Override
    public String detaylariVer() {
        return "Latte";
    }

    @Override
    public double fiyatHesapla() {
        return 22;
    }
}
