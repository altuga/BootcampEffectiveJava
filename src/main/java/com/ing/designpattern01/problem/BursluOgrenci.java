package com.ing.designpattern01.problem;

public class BursluOgrenci extends Ogrenci{

    public BursluOgrenci(String ad, String soyad, double not) {
        this.ad = ad;
        this.soyad = soyad;
        this.not = not;
    }

    @Override
    protected String burslulukOraniniVer() {
        return "Burslu ";
    }

    @Override
    protected String anaDalBilgisiniVer() {
        return "Tek anadal";
    }
}
