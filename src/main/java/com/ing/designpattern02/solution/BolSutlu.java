package com.ing.designpattern02.solution;

public class BolSutlu extends Eklenti {

    public BolSutlu(Icecek icecek) {
        this.icecek = icecek;
    }

    @Override
    public String getAciklama() {
        return icecek.getAciklama() + " bol sutlu";
    }

    @Override
    double fiyatHesapla() {
        return icecek.fiyatHesapla() +  3.0;
    }
}
