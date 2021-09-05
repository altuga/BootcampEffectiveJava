package com.ing.designpattern01.problem;

public class YarimBursluOgrenci extends Ogrenci{

    public YarimBursluOgrenci(String ad, String soyad, double not) {
        this.ad = ad;
        this.soyad = soyad;
        this.not = not;
    }

    @Override
    protected String burslulukOraniniVer() {
        return "Yarim Burslu ";
    }

    @Override
    protected String anaDalBilgisiniVer() {
        return "Tek anadal";
    }
}
