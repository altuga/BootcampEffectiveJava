package com.ing.designpattern02.problem;

public class BolKopukluLatte implements Icecek {


    @Override
    public String detaylariVer() {
        return "Bol Kopuklu Latte";
    }

    @Override
    public double fiyatHesapla() {
        return 24;
    }
}
