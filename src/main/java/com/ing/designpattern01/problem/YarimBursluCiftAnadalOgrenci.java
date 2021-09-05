package com.ing.designpattern01.problem;

public class YarimBursluCiftAnadalOgrenci extends Ogrenci{

    public YarimBursluCiftAnadalOgrenci(String ad, String soyad, double not) {
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
        return "Cift anadal";
    }
}
