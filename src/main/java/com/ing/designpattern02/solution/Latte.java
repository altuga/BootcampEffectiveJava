package com.ing.designpattern02.solution;

public class Latte extends Icecek{

    public Latte() {
        this.aciklama = "Latte";
    }

    @Override
    double fiyatHesapla() {
        return 22;
    }
}
