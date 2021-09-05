package com.ing.designpattern02.solution;

public abstract class   Icecek {

    String aciklama;

    public String getAciklama() {
        return aciklama;
    }

    abstract double fiyatHesapla();
}
