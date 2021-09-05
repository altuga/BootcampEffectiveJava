package com.ing.designpattern02.solution;

public class Cay extends Icecek{
    public Cay() {
        this.aciklama = "Cay";
    }

    @Override
    double fiyatHesapla() {
        return 1;
    }
}
