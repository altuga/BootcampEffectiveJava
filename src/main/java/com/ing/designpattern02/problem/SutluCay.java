package com.ing.designpattern02.problem;

public class SutluCay implements Icecek {
    @Override
    public String detaylariVer() {
        return "Sutlu Cay";
    }

    @Override
    public double fiyatHesapla() {
        return 3;
    }
}
