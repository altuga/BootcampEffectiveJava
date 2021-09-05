package com.ing.designpattern02.solution;

public class Buzlu extends Eklenti{

    public Buzlu(Icecek icecek) {
        this.icecek = icecek;
    }

    @Override
    public String getAciklama() {
        return icecek.getAciklama() + " Buz eklendi";
    }

    @Override
    double fiyatHesapla() {
        return icecek.fiyatHesapla() + 1;
    }
}
