package com.ing.designpattern02.problem;

public class Cay implements Icecek{
    @Override
    public String detaylariVer() {
        return "Cay";
    }

    @Override
    public double fiyatHesapla() {
        return 1;
    }
}
