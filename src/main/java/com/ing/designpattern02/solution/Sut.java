package com.ing.designpattern02.solution;

public class Sut extends  Eklenti {

    public Sut(Icecek icecek) {
        this.icecek = icecek;
    }

    @Override
    public String getAciklama() {
        return icecek.getAciklama() + " sutlu";
    }

    @Override
    double fiyatHesapla() {
        return this.icecek.fiyatHesapla()+ 1.5;
    }
}
