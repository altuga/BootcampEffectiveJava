package com.ing.designpattern02.solution;

public class BolShot extends Eklenti {

    public BolShot(Icecek icecek) {
        this.icecek = icecek;
    }

    @Override
    public String getAciklama() {
        return icecek.getAciklama() + " Bol shotlu";
    }

    @Override
    double fiyatHesapla() {
        return icecek.fiyatHesapla() + 4;
    }
}
