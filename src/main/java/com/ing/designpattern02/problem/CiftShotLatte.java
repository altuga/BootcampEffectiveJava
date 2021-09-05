package com.ing.designpattern02.problem;

public class CiftShotLatte implements Icecek {


    @Override
    public String detaylariVer() {
        return "Cift Shot Kopuklu Latte";
    }

    @Override
    public double fiyatHesapla() {
        return 30;
    }
}
