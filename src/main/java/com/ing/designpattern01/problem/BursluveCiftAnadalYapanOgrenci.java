package com.ing.designpattern01.problem;

public class BursluveCiftAnadalYapanOgrenci extends Ogrenci{

    public BursluveCiftAnadalYapanOgrenci(String ad, String soyad, double not) {
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
        return "Cift anadal";
    }
}
